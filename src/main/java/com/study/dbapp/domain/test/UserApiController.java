package com.study.dbapp.domain.test;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.dbapp.domain.user.User;
import com.study.dbapp.domain.user.UserRepository;


@RestController
public class UserApiController {
	private final UserRepository userRep;

	public UserApiController(UserRepository userRep) {
		this.userRep = userRep;
	}
	
	@PostMapping("/test/user")
	public String save(User user) {
		userRep.save(user);
		return "saved";
	}
	
	@GetMapping("/test/user")
	public List<User> findAll(){
		return userRep.findAll();
	}
	
	@GetMapping("/test/user/{id}")
	public User findById(@PathVariable int id) {
		return userRep.findById(id).get();
	}
	
	@GetMapping("/test/user/userid/{userid}")
	public User findByuserId(@PathVariable String userid) {
		return userRep.mFindByUserId(userid);
	}
	
	@PostMapping("/test/login")
	public String login(@RequestBody User user) {
		User result = userRep.mLogin(user.getUserid(), user.getPassword());
		
		if(result == null) {
			return "loginFail";
		}else {
			return "loginSuccess";
		}
	}
	
	@DeleteMapping("/test/user/{id}")
	public String deleteById(@PathVariable int id) {
		userRep.deleteById(id);
		return "delete ok";
	}
	
	@PutMapping("/test/user/{id}")
	public String updateUser(@PathVariable int id,User user) {
		//id로 select
		User userEntity = userRep.findById(id).get();
		//2. 받은 body데이터로 수정
		userEntity.setPassword(user.getPassword());
		userEntity.setEmail(user.getEmail());
		
		userRep.save(userEntity);
		return "Success";
	}
}

