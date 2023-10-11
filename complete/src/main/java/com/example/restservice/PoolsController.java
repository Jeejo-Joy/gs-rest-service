package com.example.restservice;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PoolsController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/poolsInCpu")
	public Pools greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return new Pools(counter.incrementAndGet(), String.format(template, name));
		return new Pools(poolsService().getNumberOfPools(), "Number of pools in cpu");
	}
	@Bean
	public PoolsService poolsService() {
		return new PoolsService();
	}
}

class PoolsService {

	public int getNumberOfPools() {
		return Runtime.getRuntime().availableProcessors();
	}
}
