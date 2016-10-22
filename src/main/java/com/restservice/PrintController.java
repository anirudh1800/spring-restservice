package com.restservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintController {
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/message")
	public Message message(@RequestParam(value="text", defaultValue="empty message") String text) {
		return new Message(counter.incrementAndGet(), text);
	}

}
