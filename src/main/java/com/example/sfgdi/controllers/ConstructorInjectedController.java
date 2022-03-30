/**
 * Created by Franklyn Agboma
 */
package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    /**
     * Add @Autowired here is optional since spring 4.2.0
     * Spring will automatically detect the service
     * @param greetingService
     */
    public ConstructorInjectedController(
            @Qualifier("constructorGreetingService") GreetingService greetingService
    ) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
