package com.study.dbapp.domain.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.dbapp.domain.user.User;
import com.study.dbapp.domain.user.UserRepository;
import com.study.dbapp.util.Script;

@Controller
public class UserController {
	
	private final UserRepository userRep;
	private final HttpSession session;
	
	public UserController(UserRepository userRep,HttpSession session) {
		this.userRep = userRep;
		this.session = session;
	}

	@GetMapping("/auth/registform")
	public String registForm() {
		
		return "auth/RegistForm"; 
	}
	
	@GetMapping("/auth/loginform")
	public String loginForm() {
		
		return "auth/LoginForm"; 
	}
	
	@PostMapping("/auth/regist")
	public String regist(User user) {
		userRep.save(user);
		return "redirect:/auth/loginform";
	}
	
	@PostMapping("/auth/login")
	public @ResponseBody String login(User user) {
		User userEntity = userRep.mLogin(user.getUserid(), user.getPassword());
		System.out.println(user.getUserid()+"/"+user.getPassword());
		
		if(userEntity!=null) {
			session.setAttribute("principal", userEntity);
			System.out.println(session.getAttribute("principal"));
			return Script.href("/");
		}
		else {
			return Script.back("Login FAIL");
		}
	}
	
	@GetMapping("/user/logout")
	public String logout() {
		session.invalidate();
		return "redirect:/";
	}
}
