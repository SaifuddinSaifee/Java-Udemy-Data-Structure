package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {14, 18, 19, 37, 23, 40, 29, 30, 11};
//        System.out.println(Arrays.toString(anotherApproach(arr)));
        for (int gap = arr.length/2; gap>0; gap/=2){

        }

    }







    public static int[] anotherApproach(int[] arr) {
        int N = arr.length;
        int gap = (int) Math.floor(N / 2);
        for (int i = 0; i >= 0; i++) {
            int j = i + gap;
            while (j < N) {
                if(arr[i] >= arr[j]){
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
