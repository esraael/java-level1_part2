package lecture2;

import java.util.Scanner;

public class computingLoanPayments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your interestrate");
        double interestrate = sc.nextDouble();
        System.out.println("enter your numofyears");
        double numofyears = sc.nextDouble();
        System.out.println("enter your loanamount");
        double loanamount = sc.nextDouble();
        System.out.println("enter your totalpayment");
        double totalpayment = sc.nextDouble();
        double monthlyinterestrate = interestrate / 1200;
        double monthlypayment = (loanamount * monthlyinterestrate) / (1 - 1 / Math.pow(1 + monthlyinterestrate, numofyears * 12));
        System.out.println("monthlypayment is"+monthlypayment);

    }
}
