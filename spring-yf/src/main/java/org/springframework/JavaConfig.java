package org.springframework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.springframework.yf.bean")
public class JavaConfig {

	@Bean
	public User user() {
		return new User("YunFei", 18);
	}


}
