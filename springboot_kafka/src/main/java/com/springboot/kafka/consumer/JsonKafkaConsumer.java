package com.springboot.kafka.consumer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.kafka.payload.Music;
import com.springboot.kafka.repository.MusicDataRepository;

@Service
public class JsonKafkaConsumer {

	private static final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	private MusicDataRepository musicDataRepository;
	
	public JsonKafkaConsumer(MusicDataRepository musicDataRepository) {
		super();
		this.musicDataRepository = musicDataRepository;
	}

	@KafkaListener(topics = "SpringBootTopic_json", groupId = "myGroup")
	public void consume(Music song) throws IOException{
		logger.info(String.format("Json message recieved by -> %s", song.toString()));

		musicDataRepository.save(song);
	}
}
