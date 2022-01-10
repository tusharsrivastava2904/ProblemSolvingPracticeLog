package ProblemSolving.Hackerrank;/*
 * Tushar Srivastava
 * #100DaysOfCode
 * tusharsrivastava2904@gmail.com 
*/

//format the currency in the local formatting type as per the country of reference

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatting {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = in.format(payment);
        NumberFormat US= NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String us = US.format(payment);
        NumberFormat cn = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        String china = cn.format(payment);
        NumberFormat fr = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        String france = fr.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
