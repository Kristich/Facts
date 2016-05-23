package com.kristich.facts;

import java.util.Random;

/**
 * Created by Kristich on 5/22/16.
 */
public class FactsBook {

    public String[] facts = {"Ants Stretch when they wake up in the morning",
            "Ostriches can run faster than horses",
            "Olympic gold medals are actually made mostly of silver",
            "You are born with 300 bones, by the time you are adult you will have 206"};




    public String getFact() {



        String fact = "";

        Random randomGen = new Random();

        int randomNumb = randomGen.nextInt(facts.length);

        fact = facts[randomNumb];


        return fact;

    }

}
