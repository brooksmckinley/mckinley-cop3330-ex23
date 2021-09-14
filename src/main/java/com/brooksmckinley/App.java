/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String response = scan.nextLine();
        if (isAffirmative(response)) {
            System.out.print("Are the battery terminals corroded? ");
            response = scan.nextLine();
            if (isAffirmative(response)) {
                System.out.println("Clear terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            System.out.print("Does the car make a slicking noise? ");
            response = scan.nextLine();
            if (isAffirmative(response)) {
                System.out.println("Replace the battery.");
            } else {
                System.out.print("Does the car crank up but fail to start? ");
                response = scan.nextLine();
                if (isAffirmative(response)) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.print("Does the engine start and then die? ");
                    response = scan.nextLine();
                    if (isAffirmative(response)) {
                        System.out.print("Does your car have fuel injection? ");
                        response = scan.nextLine();
                        if (isAffirmative(response)) {
                            System.out.println("Get it in for service");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }

    public static boolean isAffirmative(String response) {
        return response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");
    }
}