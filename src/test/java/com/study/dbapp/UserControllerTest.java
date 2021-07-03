package com.study.dbapp;

import org.junit.jupiter.api.Test;

public class UserControllerTest {
	@Test//가상 main method를 만들어서 실행
	public void addressParsing() {
		String addr = "http://localhost:8080/user/2";
		String host = "http://localhost:8080";
		
		String r1 = addr.replace(host,"");
		String[] r2 = r1.split("/");
		System.out.println(r2[2]);
		System.out.println("TEST");
	}
}
