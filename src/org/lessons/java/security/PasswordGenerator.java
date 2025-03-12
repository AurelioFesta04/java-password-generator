package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.nextLine();

        System.out.println("Enter your surname");
        String surname = in.nextLine();

        System.out.println("Enter your favourite color");
        String favouriteColor = in.nextLine();

        System.out.println("Enter your birth's day");
        int day = in.nextInt();

        System.out.println("Enter your birth's month");
        int month = in.nextInt();

        System.out.println("Enter your birth's year");
        int year = in.nextInt();

        in.close();

        int dateSum = day + month + year;

        System.out.println("your password is " + name + surname + favouriteColor + dateSum);

    }

}
