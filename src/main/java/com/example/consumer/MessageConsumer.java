package com.example.consumer;

import com.example.service.MessageConsumerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MessageConsumer {

	@Autowired
	MessageConsumerService messageConsumerService;
	@KafkaListener(topics = "thread-topic", groupId = "test-group")
	public void listener(ConsumerRecord<String, String> consumerRecord) throws JsonProcessingException {
	    System.out.println("Received Message : "+ consumerRecord.value());
		messageConsumerService.process(consumerRecord.value());
	}
}

