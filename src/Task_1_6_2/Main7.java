package Task_1_6_2;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner scanner = new Scanner(System.in);
        String numbers=scanner.next();
        int temp=Integer.parseInt(String.valueOf(numbers.charAt(0)));
        int max=temp;
        int min=temp;
        for (int i = 1; i < numbers.length(); i++) {
            temp=Integer.parseInt(String.valueOf(numbers.charAt(i)));
            if (temp>max){
                max=temp;
            }
            else if (min>temp){
                min=temp;
            }
        }
        System.out.println("Max value = "+max+"\nMin value = "+min);

    }
}
