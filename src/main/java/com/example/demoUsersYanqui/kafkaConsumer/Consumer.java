package com.example.demoUsersYanqui.kafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	@KafkaListener(topics = "topic-service", groupId = "group_id")
	public void consumeMessage(String message) {
		System.out.println("el mensaje es: "+message);
	}
}
