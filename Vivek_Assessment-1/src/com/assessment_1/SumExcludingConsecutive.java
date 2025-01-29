package com.assessment_1;
import java.util.Scanner;

/*
 * <h1> Sum Excluding Numbers Between Consecutive Elements </h1>
 * 
 * <p> Write a Java program that accepts N integers from the console and stores them in
 * an array.</p>
 * 
 * <p> Calculate the sum of the elements in the array with the following condition:</p>
 * <ul>
 * 	<li> Get two consecutive numbers a and b from the user.</li>
 * 	<li> Sum all the numbers that are between a and b (exclusive of a and b).</li>
 * 	<li> Exclude a, b, and all numbers between them from the sum.</li>
 * </ul>
 * 
 * <p> Finally, print the total sum of the remaining numbers in the array after applying this
 * condition.</p>
 * 
 */

public class SumExcludingConsecutive {

    /*
     *<p> main method to execute the Sum Excluding Consecutive
     *
     * <p>
     * Write a Java program that accepts N integers from the console and stores them in
     * an array.
     * </p>
     * 
     * @params args command-line argument (not given for the method)
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        int sum = 0;

       
        boolean inRange = false;

       
        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                inRange = true;  
            } else if (arr[i] == b) {
                inRange = false; 
            }

         
            if (!inRange) {
                sum += arr[i];
            }
        }

       
        System.out.println("Sum of elements excluding numbers between " + a + " and " + b + ": " + sum);

     
    }
}
