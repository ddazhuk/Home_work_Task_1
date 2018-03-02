package Task_1_6_3;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("Enter numbers\nEnter how much numbers");
        Scanner scanner = new Scanner(System.in);
        int colNumber=scanner.nextInt();
        int [] mas=new int[colNumber];
        String correcttNum_3_9="";
        String correcttNum_5_7="";
        for (int i = 0; i <colNumber ; i++) {
            mas[i]=scanner.nextInt();
        }
        for (int i = 0; i < colNumber; i++) {
            if (mas[i]%3==0||mas[i]%9==0){
                correcttNum_3_9=correcttNum_3_9+" "+Integer.toString(mas[i]);
            }
            else if (mas[i]%5==0&mas[i]%7==0){
                correcttNum_5_7=correcttNum_5_7+" "+Integer.toString(mas[i]);
            }
        }
        System.out.println("Numbers that are divided 3 or 9 :"+correcttNum_3_9+"\nNumbers that are divided 5 and 7 :"+correcttNum_5_7);
    }
}
