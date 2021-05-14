package com.dwes.datatesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dwes.entity.Comment;
import com.dwes.entity.Post;
import com.dwes.repository.CommentRepository;
import com.dwes.repository.PostRepository;


	@Component
	public class LoadDataExample implements CommandLineRunner {
		
		@Autowired
		PostRepository postRepository;
		
		@Autowired
		CommentRepository commentRepository;

		@Override
		public void run(String... args) throws Exception {
			// Create a Post
			Post post = new Post("post title", "post description", "post content");

			// Create Comments
			Comment comment1 = new Comment("Great Post!");
			comment1.setPost(post);
			Comment comment2 = new Comment("Really helpful Post. Thanks a lot!");
			comment2.setPost(post);

			// Add comments in the Post
			post.getComments().add(comment1);
			post.getComments().add(comment2);

			// Save Post and Comments via the Post entity
			postRepository.save(post);
			
		}

}
