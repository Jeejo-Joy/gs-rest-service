package com.example.restservice;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RequestTimeOutController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/slow-endpoint")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		try {
			Thread.sleep(10000); // 10secs
		} catch (InterruptedException e) {
			// Ignore
		}
		return "Hello from slow endpoint!";
	}
}
