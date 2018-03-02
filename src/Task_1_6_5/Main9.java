package Task_1_6_5;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("Enter how much numbers");
        Scanner scanner = new Scanner(System.in);
        int col=scanner.nextInt();
        int[] arr=new int[col];
        System.out.println("Enter "+col+"numbers");
        for (int i = 0; i < col; i++) {
            arr[i]=scanner.nextInt();
        }
        String numberS="";
        String validNum="";
        for (int i = 0; i <col ; i++) {
            numberS=Integer.toString(arr[i]);
            int one=Integer.parseInt(String.valueOf(numberS.charAt(0)));
            int two=Integer.parseInt(String.valueOf(numberS.charAt(1)));
            int three=Integer.parseInt(String.valueOf(numberS.charAt(2)));
            if (one!=two&two!=three&three!=one){
                validNum=validNum+Integer.toString(arr[i])+" ";
            }
        }
        System.out.println("Valid nambers = "+validNum);
    }
}
