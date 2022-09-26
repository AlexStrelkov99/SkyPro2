package SkyPro;

public class task6 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        double averageArr = getAverage(arr);
        System.out.printf("The average expenditure was %.2f rubles. \n", averageArr);
        }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static double getAverage(int[] arr) {
        double sum = getSum(arr);
        double averageValue = sum / arr.length;
        return averageValue;
    }
    public static double getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
