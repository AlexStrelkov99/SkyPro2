package SkyPro;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some line: ");
        String s = input.next();
        checkDoubles(s);
        input.close();
    }
    public static void checkDoubles(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.printf("Duplicate character '%c' found.\n", str.charAt(i));
                return;
            }
        }
        System.out.println("Duplicate characters not found.");
    }
}
