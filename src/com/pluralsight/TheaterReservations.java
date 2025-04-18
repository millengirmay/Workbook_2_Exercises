package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your name: ");
        String fullName = input.nextLine();
        System.out.println("What date will you be coming (MM/dd/yyyy)");
        String date = input.nextLine();
        System.out.println("How many tickets would you like?");
        int ticket = input.nextInt();

        //Parse and format the date
        String formattedDate = LocalDate.parse(date,DateTimeFormatter.ofPattern("MM/dd/yyyy")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        //Split name into first and last
        String[] name = fullName.trim().split(" ");
        String firstName = name[0];
        String lastName = name[name.length-1];
        //Build ticket text(singular/plural)
        String ticketText;
        if(ticket == 1){
            ticketText = "ticket";
        }else{
            ticketText = " tickets";
        }
        //Possible to use ternary operator: Syntax: (condition) ? value_if_true : value_if_false;
        //String ticketText =(ticket == 1) ? "ticket" : "tickets";

        System.out.println(ticket + " " + ticketText + " reserved for " + formattedDate + " under " + lastName + ", " + firstName);
    }
}
