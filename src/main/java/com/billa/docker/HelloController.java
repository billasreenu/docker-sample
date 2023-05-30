package com.billa.docker;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String get() {
		System.out.println("HelloController " + LocalDateTime.now());
		return "Hello docker world";
	}

	@GetMapping("/test")
	public String test() {
		System.out.println("HelloController  test " + LocalDateTime.now());
		return "Hello docker world";
	}


@GetMapping("/test1")
	public String test1() {
		System.out.println("HelloController  test " + LocalDateTime.now());
		return "Hello docker world";
	}
}
