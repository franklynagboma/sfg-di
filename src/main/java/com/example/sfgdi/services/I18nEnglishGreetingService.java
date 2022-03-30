/**
 * Created by Franklyn Agboma
 */
package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// default will post this as the default active bean when non is
// assign on the application properties
@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
