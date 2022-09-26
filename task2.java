package SkyPro;

import java.time.LocalDate;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year of manufacture of the device: ");
        int deviceYear = input.nextInt();
        System.out.print("Enter 0 if you have Android OS or 1 if iOS: ");
        int deviceOS = input.nextInt();
        checkOS(deviceYear, deviceOS);
    }

    public static void checkOS(int deviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            if (deviceYear < currentYear) System.out.println("Install the lite-version for iOS at the link");
            else if (deviceYear == currentYear) {
                System.out.println("Install the full-version for iOS at the link");
            } else System.out.println("Incorrect input!");
        } else if (clientOS == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Install the lite-version for Android at the link");
            } else if (deviceYear == currentYear) {
                System.out.println("Install the full-version for Android at the link");
            } else {
                System.out.println("Incorrect input!");
            }
        } else {
            System.out.println("Incorrect input!");
        }
    }


}
