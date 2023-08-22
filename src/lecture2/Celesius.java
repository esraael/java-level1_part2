package Lecture2;

import java.util.Scanner;

public class Celesius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        celsius = 100;
        double fahrenheit = sc.nextDouble();
        fahrenheit = 170;
        fahrenheit = 9.0 / 5.0 * celsius + 32;
        System.out.println("fahrenheit is=" + fahrenheit);
        celsius = 5.0 / 9.0 * (fahrenheit + 32);
        System.out.println(" celsius is=" + celsius);
    }
}
