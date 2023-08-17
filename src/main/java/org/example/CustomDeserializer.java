package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class CustomDeserializer implements Deserializer<Customer> {
    ObjectMapper objectMapper =new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        Deserializer.super.configure(configs, isKey);
    }

    @Override
    public Customer deserialize(String s, byte[] data) {
        try {
            return objectMapper.readValue(data, Customer.class);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void close() {
        Deserializer.super.close();
    }
}
