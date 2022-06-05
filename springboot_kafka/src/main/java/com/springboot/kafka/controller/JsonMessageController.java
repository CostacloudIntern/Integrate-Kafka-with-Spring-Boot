package com.springboot.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.kafka.payload.Music;
import com.springboot.kafka.producer.JsonKafkaProducer;

@RestController
@RequestMapping("kafka")
public class JsonMessageController {

	private JsonKafkaProducer kafkaProducer;
			
	public JsonMessageController(JsonKafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody Music song){
		kafkaProducer.sendMessage(song);
		return ResponseEntity.ok("Json message sent to kafka topic");
	}
}