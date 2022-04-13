package com.company;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static String printSquareStar(int number){
        if (number<5){
            System.out.println("Invalid Value");
            return "Invalid Value";
        }

        int count = 5;

        System.out.printf("*****");
        while(number>count){
            count++;
            System.out.printf("*");
        }
        while ()


        System.out.println(count);

        return "Test";

    }

}
