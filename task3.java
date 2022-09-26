package SkyPro;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        int dist = input.nextInt();
        System.out.printf("Delivery will take %d days.\n", calcDeliveryTime(dist));
    }
    public static int calcDeliveryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 20) {
            deliveryTime++;
        }
        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        if (deliveryDistance <= 0) {
            System.out.println("Incorrect input!");
            return 0;
        }
        return deliveryTime;
    }
}
