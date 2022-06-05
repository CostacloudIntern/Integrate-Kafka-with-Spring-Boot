package com.springboot.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic myTopic() {
		return TopicBuilder.name("SpringBootTopic")
				.build();
	}
	
	@Bean
	public NewTopic myJsonTopic() {
		return TopicBuilder.name("SpringBootTopic_json")
				.partitions(1)
				.replicas(3)
				.build();
	}
}

//3 broker 1 topic 1 partition 3 replication