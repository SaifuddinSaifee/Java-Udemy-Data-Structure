package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;

            int x = 0;
            while (x < intArray.length) {
                System.out.println(intArray[x]);
                x++;
            }
        }
    }

    public void anotherApproach() {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int i = 1; i < intArray.length; i--) {
            int temp = intArray[i];

            int j = i - 1;
            while (j >= 0 && intArray[j] > temp) {
                intArray[j + 1] = intArray[j];
                j--;
            }
            intArray[j + 1] = temp;


        }

    }

}
