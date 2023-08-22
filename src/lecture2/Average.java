package Lecture2;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int c = sc.nextInt();
        int b = sc.nextInt();
        int a = sc.nextInt();

        double average = (a + b + c) / 3;
        System.out.println("average=" + average);

    }

}
