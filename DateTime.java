/*
 * Tushar Srivastava
 * #100DaysOfCode
 * tusharsrivastava2904@gmail.com 
*/

//for a given set of dd/mm/yy identify the corresponding day

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month (in nums): ");
        int month = sc.nextInt();

        System.out.println("Enter the date: ");
        int day = sc.nextInt();

        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        String res = findDay(month, day, year);

        System.out.println(res);
        sc.close();
    }
    
    	public static String findDay(int month, int day, int year) {
 	       return LocalDate.of(year, month, day).getDayOfWeek().name();
 	    }
}
