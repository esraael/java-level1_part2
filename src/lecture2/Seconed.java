package Lecture2;

import java.util.Scanner;

public class Seconed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int second = sc.nextInt();
        int min = second / 60;
        int remainingsecond = second % 60;
        System.out.println(second + "second" + min + "min" + remainingsecond + "second");

    }

}
