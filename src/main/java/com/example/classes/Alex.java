package com.example.classes;

import com.example.classes.constants.Constants;

import java.util.List;

public class Alex extends Lion {

    private final List<String> friendsList = Constants.ALEX_FRIENDS_LIST;
    private final String placeOfLiving = Constants.ALEX_PLACE_OF_LIVING;

    public Alex(String sex, Feline feline) throws Exception {
        super(Constants.ANIMAL_SEX.get(0), feline);
    }

    public List<String> getFriendsList() {
        return friendsList;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    @Override
    public int getKittens() {
        return Constants.ALEX_KITTENS;
    }
}