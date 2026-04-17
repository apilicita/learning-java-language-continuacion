package com.example;

import java.time.DayOfWeek;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DayOfWeek today = DayOfWeek.FRIDAY;

        switch (today) {
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            default:
                break;
        }
    }
}
