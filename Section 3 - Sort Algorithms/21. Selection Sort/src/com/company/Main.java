package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedArrayIndex = intArray.length - 1; lastUnsortedArrayIndex > 0; lastUnsortedArrayIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedArrayIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
                swap(intArray, largest, lastUnsortedArrayIndex);
            }
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
