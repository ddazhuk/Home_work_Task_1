package Task_1_4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Enter login");
        Scanner scanner = new Scanner(System.in);
        String login=scanner.next();
        System.out.println("Please confirm login");
            String next_log = scanner.next();
            if (login.equals(next_log)) {
                System.out.println("Login is correct");
            }
            else {
                System.out.println("Please try again");
            }
        }

    }
