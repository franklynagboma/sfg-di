package com.example.sfgdi;

import com.example.sfgdi.controllers.ConstructorInjectedController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.PropertyInjectedController;
import com.example.sfgdi.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("____Primary");
		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("____Property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) applicationContext.getBean("propertyInjectedController") ;
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("____Setting");
		SetterInjectionController setterInjectionController =
				(SetterInjectionController) applicationContext.getBean("setterInjectionController") ;
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("____Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) applicationContext.getBean("constructorInjectedController") ;
		System.out.println(constructorInjectedController.getGreeting());

	}

}
