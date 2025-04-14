package org.springframework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.springframework.yf")
@EnableAspectJAutoProxy
public class JavaConfig {


	@Bean
	public User user() {
		return new User("YunFei", 18);
	}


}
