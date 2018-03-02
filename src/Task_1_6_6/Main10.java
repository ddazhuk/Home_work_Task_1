package Task_1_6_6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("Enter Lucky number");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        boolean Lucky = true;
        if (number.length() % 2 == 0) {
            int[] arr = new int[number.length()];
            for (int i = 0; i < number.length(); i++) {
                arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            }
            int[] arrtepmp = new int[arr.length / 2];
            int[] arrtepmp1 = new int[arr.length / 2];
            for (int i = 0; i < (arr.length / 2); i++) {
                arrtepmp[i] = arr[(arr.length / 2) - i - 1];
                arrtepmp1[i] = arr[(arr.length / 2) + i];
            }
            for (int i = 0; i < arrtepmp.length; i++) {
                if (arrtepmp[i] != arrtepmp1[i]) {
                    Lucky = false;
                }
            }
            if (Lucky == true) {
                System.out.println("Your number is Lucky!!!");
            }
            else System.out.println("Try again))");
        } else System.out.println("Enter even quentity symbols");
    }
}

