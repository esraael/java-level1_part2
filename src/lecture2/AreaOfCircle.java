package Lecture2;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter radius");
        double radius = input.nextDouble();

        double area = radius * radius * Math.PI;

        System.out.println("area= " + area);

    }

}
