package SkyPro;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] array = {7, 4, 5, 8, 1};
        reverseArrayOrder(array);
        System.out.println("The reversed array looks like this: " + Arrays.toString(array));
    }
    public static void reverseArrayOrder(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
    }
}
