/**
 * Created by Franklyn Agboma
 */
package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service("pet")
public class DogPetService implements PetService {

    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
