package com.javashastra.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
@KafkaListener(topics = "quickstart-events")
    public void readMessage(ConsumerRecord<String,String> consumerRecord){
     System.out.println(consumerRecord.value());
    }

}
