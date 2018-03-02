package Task_1_3;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter quantity of number in one row");
        Scanner scanner = new Scanner(System.in);
        int col=Integer.parseInt(scanner.next());
        Random rand=new Random();
        for (int i = 0; i < col; i++) {
            System.out.print(rand.nextInt(100)+", ");
       }
        System.out.println("\nEnter quantity of number in different row");
        col=Integer.parseInt(scanner.next());
        for (int i = 0; i < col; i++) {
            System.out.print(rand.nextInt(100)+"\n");
        }

    }
}
