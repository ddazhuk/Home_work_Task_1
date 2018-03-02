package Task_1_6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner scanner = new Scanner(System.in);
        String numbers=scanner.next();
        String even="";
        String odd="";
        int num;
        for (int i = 0; i < numbers.length() ; i++) {
            num=Integer.parseInt(String.valueOf(numbers.charAt(i)));
            if (num%2==0){
                even=even+Integer.toString(num);
            }
            else {
                odd=odd+Integer.toString(num);
            }
        }
        System.out.println("Please see\neven numbers: "+even+"\nodd numbers: "+odd);

    }
}
