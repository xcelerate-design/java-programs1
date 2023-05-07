package com.xcelerateDesign.javaPrograms.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program to -->
 * Create an ArrayList of type String,
 * Provide options add / update / delete elements
 * Option 1: Add element at the end of list
 * Option 2: Add element to the specific position
 * Option 3: Update element of the specific position
 * Option 4: Delete element from the specific position
 * Option 5: Display all the elements
 * Option 6: Exit
 * -->
 *
 * @author Xcelerate Design on 2023-08-26
 * @project java-programs
 */

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayListExample arrayListExample = new ArrayListExample();

        Integer option;
        List<String> list = new ArrayList<String>();

        do {

            System.out.println("Select options to add / update / delete elements");
            System.out.println("1 : Add element at the end of list");
            System.out.println("2 : Add element to the specific position");
            System.out.println("3 : Update element of the specific position");
            System.out.println("4 : Delete element from the specific position");
            System.out.println("5 : Display all the elements");
            System.out.println("6 : Exit");
            System.out.println("List: " + list);
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option) {
                case 1:
                    arrayListExample.add(list, sc);
                    break;
                case 2:
                    arrayListExample.addSpecific(list, sc);
                    break;
                case 3:
                    arrayListExample.update(list, sc);
                    break;
                case 4:
                    arrayListExample.delete(list, sc);
                    break;
                case 5:
                    arrayListExample.display(list);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid option!");
            }

        } while (option != 6);

    }

    void add(List<String> list, Scanner sc) {
        System.out.println("Provide element: ");
        String element = sc.next();
    }

    void addSpecific(List<String> list, Scanner sc) {
        System.out.println("Provide element : ");
        String element = sc.next();
        System.out.println("Provide index number between 0 to " + (list.size() - 1) + ": ");
        int index = sc.nextInt();
        list.add(index, element);
    }

    void update(List<String> list, Scanner sc) {
        System.out.println("Provide new element: ");
        String element = sc.next();
        System.out.println("Provide index number between 0 to " + (list.size() - 1) + ": ");
        int index = sc.nextInt();
        list.set(index, element);
    }

    void delete(List<String> list, Scanner sc) {
        System.out.println("Provide index number between 0 to " + (list.size() - 1) + ": ");
        int index = sc.nextInt();
        list.remove(index);
    }

    void display(List<String> list) {
        System.out.println(list);
    }

}
