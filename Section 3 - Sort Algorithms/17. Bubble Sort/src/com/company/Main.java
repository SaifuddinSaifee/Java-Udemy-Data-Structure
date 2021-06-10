package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for (int lastIntSortedIndex = arr.length - 1; lastIntSortedIndex > 0; lastIntSortedIndex--) {
            for (int i = 0; i < lastIntSortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
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
