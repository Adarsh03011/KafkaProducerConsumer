package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

import java.nio.ByteBuffer;
import java.util.Map;

import static org.apache.kafka.common.requests.DeleteAclsResponse.log;

public class CustomSerializer implements Serializer<Customer> {
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        Serializer.super.configure(configs, isKey);
    }

    @Override
    public void close() {
        Serializer.super.close();
    }

    @Override
    public byte[] serialize(String s, Customer data) {
            try {
                return objectMapper.writeValueAsBytes(data);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

    }
}
