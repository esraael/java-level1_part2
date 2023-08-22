package Lecture2;

import java.util.Scanner;

public class Sheet26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double fuelofficiency = sc.nextDouble();
        double price = sc.nextDouble();
        double cost = (distance / fuelofficiency) * price;
        System.out.println("the cost of trip=" + cost);

    }

}
