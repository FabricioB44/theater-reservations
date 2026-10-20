package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String fullName = myScanner.nextLine().strip();
        System.out.print("What date will you be coming? (MM/dd/yyyy): ");
        String showDate = myScanner.nextLine().strip();
        System.out.print("How many tickets would you like?: ");
        int ticketAmount = myScanner.nextInt();

        fullName = flipName(fullName);
        showDate = formatDate(showDate);
        String ticketOutput = formatTicket(ticketAmount);

        System.out.println();
        System.out.println(ticketOutput + " reserved for " + showDate + " under " + fullName);
    }

    public static String flipName(String name) {
        String[] parts = name.trim().split("\\s+", 2);
        String firstName = parts[0];
        String lastName = parts[1];
        return lastName + ", " + firstName;
    }

    public static String formatDate(String showDate) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate date = LocalDate.parse(showDate, inputFormatter);
        return date.format(outputFormatter);
    }

    public static String formatTicket(int ticketAmount) {
        if (ticketAmount == 1) {
            return "1 ticket";
        } else {
            return ticketAmount + " tickets";
        }
    }
}
