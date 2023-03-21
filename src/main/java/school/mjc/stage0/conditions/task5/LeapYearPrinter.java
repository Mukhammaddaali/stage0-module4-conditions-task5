package school.mjc.stage0.conditions.task5;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year%4){
            case 0:if (year%100==0&& year%400!=0) System.out.println("not leap");else System.out.println("leap"); break;
            default:
                System.out.println("not leap");
        }
    }
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        isLeapYear(x);
    }
}
