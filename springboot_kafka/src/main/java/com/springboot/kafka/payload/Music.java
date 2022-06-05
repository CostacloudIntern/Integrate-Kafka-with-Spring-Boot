package com.springboot.kafka.payload;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "Songs")
public class Music {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String artist;
	private String genre;
	private double length;
	private String uploader;
	private String uploadDate;
	private String uploadTime;
	
	public Music() {
		
	}

	public Music(int id, String title, String artist, String genre, double length, String uploader, String uploadDate,
			String uploadTime) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.length = length;
		this.uploader = uploader;
		this.uploadDate = uploadDate;
		this.uploadTime = uploadTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	public String getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

	@Override
	public String toString() {
		return "Music [id=" + id + ", title=" + title + ", artist=" + artist + ", genre=" + genre + ", length=" + length
				+ ", uploader=" + uploader + ", uploadDate=" + uploadDate + ", uploadTime=" + uploadTime + "]";
	}
}
