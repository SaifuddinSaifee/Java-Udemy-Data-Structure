package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(fact(3));

        System.out.println(recursiveFact(3));
    }

    public static int recursiveFact(int num) {
        if (num == 0) {
            return 1;
        }

        return num * recursiveFact(num - 1);
    }

    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
