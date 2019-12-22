package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String userInput = scanner.nextLine();
        
        int length = userInput.length();

        for (int i = 0; i < length; i++) {
            System.out.println(userInput.charAt(i));
        }
    }
}
