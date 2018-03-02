package Tesk_1_1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hi "+name+"!");
    }
}
