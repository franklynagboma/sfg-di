/**
 * Created by Franklyn Agboma
 */
package com.example.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// Make service primary

/**
 * Qualifier take preference over Primary
 * when no Qualifier annotation for same service/interface type
 * it falls to it Primary.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world from PRIMARY bean";
    }
}
