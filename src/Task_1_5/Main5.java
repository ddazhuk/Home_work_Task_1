package Task_1_5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Please enter numbers");
        Scanner scanner = new Scanner(System.in);
        String numbers=scanner.next();
        int sum=0;
        for (int i = 0; i < numbers.length() ; i++) {
            sum = sum + Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }
        System.out.println("Sum your nambers = "+sum);

    }
}
