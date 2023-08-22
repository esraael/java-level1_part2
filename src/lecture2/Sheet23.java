package Lecture2;

import java.util.Scanner;

public class Sheet23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num between 0 and 1000");
        int num = sc.nextInt();
        int digit1 = num % 10;
        int remainingnum = num / 10;
        int digit2 = remainingnum % 10;
        remainingnum =remainingnum / 10;
        int digit3 = remainingnum % 10;
        System.out.println(digit1 + digit2 + digit3);
    }

}
