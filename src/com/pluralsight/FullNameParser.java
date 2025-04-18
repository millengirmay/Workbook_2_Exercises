package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name (first middle last or first last):");
        String FullName = input.nextLine().trim();

        String[] Username = FullName.split("\\s+");  //convert to array to get the index and \\s+ this means splits by any number of spaces, so it works even if the user enters multiple spaces between names

        if(Username.length == 3){
            System.out.println("First name: "+ Username[0]);
            System.out.println("Middle name: "+ Username[1]);
            System.out.println("Last name: "+ Username[2]);
        } else if (Username.length == 2) {
            System.out.println("First name: "+ Username[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: "+ Username[1]);
        }else {
            System.out.println("Invalid name format please enter first,middle and last name or first and last name");
        }
    }
    }

