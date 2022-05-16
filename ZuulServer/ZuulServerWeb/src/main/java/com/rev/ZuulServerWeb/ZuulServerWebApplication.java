package com.rev.ZuulServerWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulServerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerWebApplication.class, args);
	}

}
