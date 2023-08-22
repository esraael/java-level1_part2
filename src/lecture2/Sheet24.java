package Lecture2;

import java.util.Scanner;

public class Sheet24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfMin = input.nextInt();
        int numOfYears = numOfMin / 525600;
        int remOfYears = numOfMin % 525600;
        int numOfDays = remOfYears / 1440;
        System.out.println(numOfMin + "=");
        System.out.println(numOfYears + "years and");
        System.out.println(numOfDays + "days");

    }

}
