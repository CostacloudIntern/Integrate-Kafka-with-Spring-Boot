package com.springboot.kafka.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.kafka.payload.Music;

public interface MusicDataRepository extends MongoRepository<Music, Long>{

		List<Music> findByUploader(String musicUploader);
}