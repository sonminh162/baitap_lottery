package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first guess number:");
        int guessDigit1 = scanner.nextInt();
        System.out.println("Enter second guess number:");
        int guessDigit2 = scanner.nextInt();

        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);

        boolean giai_dac_biet = guessDigit1 == a && guessDigit2 == b;
        boolean giai_nhi = guessDigit1 == b && guessDigit2 == a;
        boolean giai_ba = guessDigit1 == a || guessDigit1 == b || guessDigit2 == a || guessDigit2 == b;

        System.out.println("bingo:"+a+b);
        if(giai_dac_biet) System.out.println("First Winner 10000$");
        else if(giai_nhi) System.out.println("Second Winner 3000$");
        else if(giai_ba) System.out.println("Thirst Winner 1000$");
        else System.out.println("good luck next time");
    }
}
