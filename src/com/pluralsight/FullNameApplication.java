package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Name: ");

        System.out.println("First name: ");
        String firstName = input.nextLine().trim();

        System.out.println("Middle Name: ");
        String middleName = input.nextLine().trim();

        System.out.println("Last Name: ");
        String lastName = input.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = input.nextLine().trim();

       StringBuilder fullName = new StringBuilder();
       fullName.append(firstName).append(" ");

       if(!middleName.isEmpty()){
           fullName.append(middleName).append(" ");
       }
       fullName.append(lastName);

       if(!suffix.isEmpty()){
           fullName.append(", ").append(suffix);
       }
        System.out.println("Full name: " + fullName);

 //Another way
       /* public class FullNameApplication {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("\nPlease enter your full name e.g. First Middle Last, Suffix: ");
                String rawInput = in.nextLine();

                String suffix = "";  //creating a variable called suffix and initializing it as an empty string
                int suffixPosition = rawInput.indexOf(",");
                if (suffixPosition != -1){ //-1 indicates or assume there's a suffix.
                    String[] nameSuffix = rawInput.trim().split(",");
                    rawInput = nameSuffix[0];
                    suffix = ", " + nameSuffix[1].trim();
                }

                String[] username = rawInput.trim().split(" ");
                String firstName = username[0];

                String middleName = "";
                if (username.length >= 3){
                    for (int i = 1; i < username.length - 1; i++) {
                        middleName += " " + username[i];
                    }
                }

                String lastName = "";
                if (username.length > 1) {
                    lastName = " " + username[username.length - 1];
                }

                System.out.println("First name: " + firstName);
                System.out.println("Middle name:" + middleName);
                System.out.println("Last name:" + lastName);
                System.out.println("Suffix: " + suffix.replace(", ", ""));

                System.out.printf("Full name: %s%s%s%s%n", firstName, middleName, lastName, suffix);
            }
        }*/

    }
    }



