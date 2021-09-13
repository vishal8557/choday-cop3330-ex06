package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
//Exercise //6 - Retirement Calculator
        //Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.

        //Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

        //Example Output
       // What is your current age? 25
        //At what age would you like to retire? 65
        //You have 40 years left until you can retire.
        //It's 2015, so you can retire in 2055.
       // Constraints
       // Again, be sure to convert the input to numerical data before doing any math.
        //Don’t hard-code the current year into your program. Get it from the system time via your programming language.

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner theinput = new Scanner(System.in);
        int the_year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        int ur_age = theinput.nextInt();

        System.out.print("At what age would you like to retire? ");
        int ur_age_in_retirement = theinput.nextInt();

        int how_much_yr_left = timeleftnow(ur_age_in_retirement, ur_age);
        int when_r_u_retiring = thetrtrmtyrnow(the_year, ur_age_in_retirement, ur_age);
        System.out.println(String.format("You have %d years left until you can retire.", how_much_yr_left));
        System.out.println(String.format("It's %d, so you can retire in %d.", the_year, when_r_u_retiring));
    }

    public static int thetrtrmtyrnow(int year, int theretireAgechosen, int age_right_now) {
        int retirementYear = year + timeleftnow(theretireAgechosen, age_right_now);
        return retirementYear;
    }

    public static int timeleftnow(int theretireAgechosen, int age_right_now) {
        int theyrsleft = theretireAgechosen - age_right_now;
        return theyrsleft;

    }
}
