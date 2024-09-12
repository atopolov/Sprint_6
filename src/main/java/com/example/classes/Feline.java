package com.example.classes;

import com.example.classes.constants.Constants;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood(Constants.ANIMAL_KIND.get(1));
    }

    @Override
    public String getFamily() {
        return Constants.PREDATOR_FAMILY_KIND;
    }

    public int getKittens() {
        return getKittens(1);
    }
    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}