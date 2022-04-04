/**
 * Created by Franklyn Agboma
 */
package com.example.sfgdi.controllers;

import com.example.sfgdi.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(@Qualifier("pet") PetService petService) {
        this.petService = petService;
    }

    public String whichIsTheBest() {
        return petService.getPetType();
    }
}
