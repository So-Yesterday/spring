package org.springframework.yf.mvc;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/yf")
public class YfController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}

}
