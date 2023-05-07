package com.xcelerateDesign.javaPrograms.sort;

/**
 * Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting
 * the smallest (or largest) element from the unsorted portion of the list and moving it to
 * the sorted portion of the list.
 * The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of
 * the list and swaps it with the first element of the unsorted portion.
 * This process is repeated for the remaining unsorted portion of the list until the entire list is sorted.
 * @author Xcelerate Design on 2023-05-07
 * @project java-programs
 */
public class Selection {

    public static void main(String[] args) {

        int[] values = {30, 25, 70, 4, 15};

        System.out.println("Input array");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] > values[j]) {
                    int swap = values[i];
                    values[i] = values[j];
                    values[j] = swap;
                }
            }
        }

        System.out.println("\nSorted array");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

    }

}
