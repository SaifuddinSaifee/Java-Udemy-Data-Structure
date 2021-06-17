package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
//        System.out.println(Arrays.toString(anotherApproach(arr)));
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];

                int j = i;

                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
        System.out.println(Arrays.toString(arr));



    }

    public static int[] anotherApproach(int[] arr) {
        int N = arr.length;
        int gap = (int) Math.floor(N / 2);
        for (int i = 0; i >= 0; i++) {
            int j = i + gap;
            while (j < N) {
                if (arr[i] >= arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            gap = (int) Math.floor(gap / 2);
        }
        return arr;
    }
}
