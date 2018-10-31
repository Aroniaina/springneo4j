package com.aroniaina.springneo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author a.safidy
 */
@ComponentScan("com.etech.springneo4j")
@EnableSwagger2
@SpringBootApplication
public class Springneo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springneo4jApplication.class, args);
	}
}
