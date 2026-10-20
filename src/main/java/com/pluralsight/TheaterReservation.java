package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TeatherReservation {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = myScanner.nextLine().strip();
        System.out.print("What date will you be coming? (MM/dd/yyyy): ");
        String showDate = myScanner.nextLine().strip();
        System.out.print("How many tickets would you like?: ");
        int ticketAmount = myScanner.nextInt();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate date = LocalDate.parse(showDate, inputFormatter);
        showDate = date.format(outputFormatter);

        System.out.println("You have " + count + " item" + (count == 1 ? "" : "s") + ".");

    }
}
