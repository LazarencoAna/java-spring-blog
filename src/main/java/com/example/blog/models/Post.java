package com.example.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;



@Getter
@Setter
@Accessors(chain = true)
@ToString
@Entity

public class Post {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private String anons;
	
	private String full_text;
	
	private int views;
	
	public Post(String title2, String anons2, String full_text2) {
		this.title=title2;
		this.anons=anons2;
		this.full_text=full_text2;
	}
	public Post() {
		
	}
	
	public void incrementViews()
	{
		views++;
	}
}
