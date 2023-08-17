package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializerConfig;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Producer {
    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        final Logger logger = LoggerFactory.getLogger(Producer.class);
        // Converting to Json format
        Customer customer = new Customer(231,"Adarsh Singh");
        MyRecord.Record r = MyRecord.Record.newBuilder().setId(1).setLocation("Mumbai").setName("Adarsh").build();
        // Creating properties
        String bootstrapServers = "127.0.0.1:9092";
        String schema = "127.0.0.1:8081";
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, CustomSerializer.class.getName());
        properties.put(KafkaProtobufSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG,schema);
        // Creating producer
        KafkaProducer<String, Customer> first_producer = new KafkaProducer<>(properties);
        String topic = "newTopic";
        for(int i=0;i<10;i++){
            String key = "id_" + i;
            ProducerRecord<String, Customer> record = new ProducerRecord<>(topic,key,customer);
            logger.info("key" + key);
            first_producer.send(record, (recordMetadata, e) -> {
                if(e == null){
                    logger.info("Successfully received the details as; \n " +
                            "Topics: " +  recordMetadata.topic()+"\n" +
                            "Partitions: " + recordMetadata.partition() + "\n" +
                            "Offset: " + recordMetadata.offset()+ "\n" +
                            "Timestamp: " + recordMetadata.timestamp());
                } else {
                    logger.error("Cant produce, getting error" ,e);
                }
            }).get();
        }
        first_producer.flush();
        first_producer.close();
    }
}

