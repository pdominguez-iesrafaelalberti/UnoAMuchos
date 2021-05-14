package com.dwes.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Posts")
public class Post extends AuditModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String content;
	
	@NotFound
	private String description;
	
	@NotNull
	private String title;
	

	 @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,  mappedBy = "post")
	 private Set<Comment> comments = new HashSet<>();
	
	

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public Post(String content, String description, String title) {
		super();
		this.content = content;
		this.description = description;
		this.title = title;
	}
	

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Post() {
		super();
	}

	
	
	
	

}
