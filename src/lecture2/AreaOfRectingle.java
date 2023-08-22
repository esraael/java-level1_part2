package Lecture2;

import java.util.Scanner;

public class AreaOfRectingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        double area = length * width;
        if (area < 5) {
            System.out.println("area is =" + area);
        } else {
            System.out.println("false");
        }

    }

}
