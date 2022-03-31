package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("____Pet, Which is the best?");
		PetController petController = (PetController) applicationContext.getBean("petController");
		System.out.println(petController.whichIsTheBest());

		System.out.println("____I18nController Testing Profile");
		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());

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
