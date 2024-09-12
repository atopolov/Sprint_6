package com.example.classes;

import com.example.classes.constants.Constants;

import java.util.List;

public class Lion {

    boolean hasMane;
    Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        if (Constants.ANIMAL_SEX.get(0).equals(sex)) {
            hasMane = true;
        } else if (Constants.ANIMAL_SEX.get(1).equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception(Constants.ANIMAL_SEX_EXCEPTION_TEXT);
        }
        this.feline = feline;
    }


    public int getKittens() {

        return feline.getKittens();
    }

    public boolean doesHaveMane() {

        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood(Constants.ANIMAL_KIND.get(1));
    }
}