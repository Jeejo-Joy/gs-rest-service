package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ConnectionTimeOutController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/slow-connection-endpoint")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		try {
			Thread.sleep(5000); // 5secs
		} catch (InterruptedException e) {
			// Ignore
		}
		return "Hello from slow endpoint!";
	}
}
