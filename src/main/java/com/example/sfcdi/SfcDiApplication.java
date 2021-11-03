package com.example.sfcdi;

import com.example.sfcdi.controller.ConstructorInjectionController;
import com.example.sfcdi.controller.MyController;
import com.example.sfcdi.controller.PropertyInjectionController;
import com.example.sfcdi.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfcDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(SfcDiApplication.class, args);

		System.out.println("---------- Primary Bean -------------");

		MyController myController=(MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("---------- Property Injection -------------");

		PropertyInjectionController propertyInjectionController=(PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.sayGreeting());

		System.out.println("---------- Setter Injection ---------------");

		SetterInjectionController setterInjectionController=(SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.sayGreeting());

		System.out.println("---------- Constructor Injection -----------");

		ConstructorInjectionController constructorInjectionController=(ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.sayGreeting());
	}

}
