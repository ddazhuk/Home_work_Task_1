package Task_1_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Enter charters, after see invert line");
        Scanner scanner = new Scanner(System.in);
        String line=scanner.next();
        for (int i = line.length()-1; i>=0 ; i--) {
           System.out.print(line.charAt(i));
        }

    }
}
