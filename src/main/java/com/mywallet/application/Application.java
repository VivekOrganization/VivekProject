package com.mywallet.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Starting point of the application
 * 
 * @author vivek-ardhan
 */

@SpringBootApplication
@ComponentScan(basePackages={"com.mywallet.controller"})
public class Application {
	
	public static void main (String args[]) throws Exception{
		
		SpringApplication.run(Application.class, args);
	}
}
