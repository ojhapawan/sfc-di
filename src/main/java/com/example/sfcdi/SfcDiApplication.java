package com.example.sfcdi;

import com.example.sfcdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfcDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(SfcDiApplication.class, args);

		MyController myController=(MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
	}

}
