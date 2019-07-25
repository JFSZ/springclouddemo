package com.example.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {
	@Value("${server.port}")
	private String port;

	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name",defaultValue = "demo") String name){
		return "hi " + name + " ,我是来自端口号为:" + port;
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}

}
