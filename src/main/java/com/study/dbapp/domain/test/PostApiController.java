package com.study.dbapp.domain.test;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.study.dbapp.domain.post.Post;
import com.study.dbapp.domain.web.PostRepository;

@RestController
public class PostApiController {
	private final PostRepository postRepository;

	public PostApiController(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	@GetMapping("test/post")
	public List<Post> findAll(){
		return postRepository.findAll();
	}
	
	@GetMapping("/test/post/{user_id}")
	public Post findByid(@PathVariable int user_id) {
		return postRepository.findByUserId(user_id);
	}
}
