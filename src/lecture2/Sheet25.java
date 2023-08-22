package Lecture2;

import java.util.Scanner;

public class Sheet25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter inversment = ");
        double investment = sc.nextDouble();
        System.out.println(" enter annual_interest_rate = ");
        double annual_interest_rate = sc.nextDouble();
        double monthaly_interest_rate = annual_interest_rate / 12.00;
        System.out.println(" monthly_interest_rate = " + monthaly_interest_rate);
        System.out.println(" enter number_ of_ years = ");
        double number_of_years = sc.nextDouble();
        double future_investment_value = investment * Math.pow((1 + monthaly_interest_rate), (number_of_years * 12));
        System.out.println("future_investment_value = " + future_investment_value);

    }

}
