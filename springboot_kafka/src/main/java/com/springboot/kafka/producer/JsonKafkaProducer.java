package com.springboot.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.springboot.kafka.payload.Music;

@Service
public class JsonKafkaProducer {
	
	private static final Logger logger = LoggerFactory.getLogger(JsonKafkaProducer.class);
	private KafkaTemplate<String, Music> kafkaTemplate;
	
	public JsonKafkaProducer(KafkaTemplate<String, Music> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(Music song) {
		
		logger.info(String.format("Message sent -> %s", song.toString()));

		Message<Music> message = MessageBuilder
				.withPayload(song)
				.setHeader(KafkaHeaders.TOPIC, "SpringBootTopic_json")
				.build();
		kafkaTemplate.send(message);
	}
}