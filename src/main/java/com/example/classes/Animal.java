package com.example.classes;

import com.example.classes.constants.Constants;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if (Constants.ANIMAL_KIND.get(0).equals(animalKind)) {
            return Constants.HERBIVORE_FOOD;
        } else if (Constants.ANIMAL_KIND.get(1).equals(animalKind)) {
            return Constants.PREDATOR_FOOD;
        } else {
            throw new Exception(Constants.ANIMAL_KIND_EXCEPTION_TEXT);
        }
    }

    public String getFamily() {
        return Constants.FAMILY_KINDS;
    }
}