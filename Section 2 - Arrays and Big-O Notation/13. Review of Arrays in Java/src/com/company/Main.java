package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[7];

        intArray[0] = -20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 44;
        intArray[4] = 60;
        intArray[5] = -21;
        intArray[6] = 89;

        for (int i = 0; i<intArray.length; i++){
            System.out.println(i +"-> "+ intArray[i]);
        }



    }
}
