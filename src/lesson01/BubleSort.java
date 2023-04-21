package lesson01;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double[] arr1 = new double[10];
        double temp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        arr1 = arr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
