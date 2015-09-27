package com.smartdragons.funfacts;

import android.content.Context;
import android.graphics.Color;

import java.util.Random;

public class ColorWheel {

    // Methods (abilities; things the object can do)
    public static int getColor(Context context) {
        String[] colors = context.getResources().getStringArray(R.array.colors);

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(colors.length);

        String color = colors[randomNumber];

        return Color.parseColor(color);
    }
}

