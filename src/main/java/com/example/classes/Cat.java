package com.example.classes;

import com.example.classes.constants.Constants;

import java.util.List;


public class Cat {

    Predator predator;
    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() {
        return Constants.CAT_SOUND;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}