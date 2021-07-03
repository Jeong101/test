package com.study.dbapp.domain.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BootstrapControllerTest {
	@GetMapping("/test/boot/navbar")
	public String navBar() {
		return "test/NavBarTest";
	}
	
}
