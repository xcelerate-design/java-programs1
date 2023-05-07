package com.xcelerateDesign.javaPrograms.common;

import java.util.Scanner;

/**
 * @author Xcelerate Design on 2023-07-17
 * @project java-programs
 */

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input valid year: ");
        int year = Integer.parseInt(scanner.next());

        boolean isLeapYear = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);

        if (isLeapYear) {
            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(year + " is not Leap Year");
        }

    }

}
