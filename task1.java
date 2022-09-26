package SkyPro;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int leapyear = input.nextInt();
        checkYear(leapyear);
    }
    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("%d is a leap year\n", year);
        } else {
            System.out.printf("%d is not a leap year\n", year);
        }
    }



}
