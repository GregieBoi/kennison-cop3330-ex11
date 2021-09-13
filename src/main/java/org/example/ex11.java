/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex11 {

    // main
    public static void main(String[] args) {

        // initialize variables, calculate dollars, set format and rounding mode
        double euros = get_euros();
        double rate = get_rate();
        double dollars = euros * rate;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        // print output
        System.out.println(df.format(euros) + " euros at an exchange rate of " + rate + " is\n" +
                df.format(dollars) + " U.S. dollars.");

    }

    // gets euros
    public static double get_euros() {

        // prompts for input and returns scan
        System.out.print("How many euros are you exchanging? ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // gets rate
    public static double get_rate() {

        // prompts for input and returns scan
        System.out.print("What is the exchange rate? ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
