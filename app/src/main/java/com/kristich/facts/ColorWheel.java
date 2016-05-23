package com.kristich.facts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Kristich on 5/22/16.
 */
public class ColorWheel {

    public String[] colors = {"#39add1", "#3079ab", "#c25975", "#e15258"};




    public int getColor() {





        Random randomGen = new Random();

        int randomNumb = randomGen.nextInt(colors.length);

        String color = colors[randomNumb];

        int colorAsInt = Color.parseColor(color);


        return colorAsInt;

    }

}
