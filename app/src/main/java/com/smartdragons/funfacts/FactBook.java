package com.smartdragons.funfacts;

import android.content.Context;
import android.content.res.Resources;
import java.util.Random;

public class FactBook {

    // Methods (abilities; things the object can do)
    public static String getFact(Context context) {
        String[] facts = context.getResources().getStringArray(R.array.facts);
        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(facts.length);

        return facts[randomNumber];
    }
}
