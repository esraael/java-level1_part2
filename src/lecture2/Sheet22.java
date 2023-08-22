package Lecture2;

import java.util.Scanner;

public class Sheet22{

    public static void main(String[] args) {
   
      Scanner input=new Scanner(System.in);
             System.out.println("enter radius");
                double radius=input.nextDouble();
                System.out.println("enter length");
                double length=input.nextDouble();
                double area=radius *radius *Math.PI;
                double volume=area*length;
                System.out.println("area= "+area);
                System.out.println("volume="+volume);
      
    }
    
}
