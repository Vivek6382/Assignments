package com.assessment_1;

import java.util.Scanner;

/**
 * <h1>Compute Grouped Index Sums of a Sequence</h1>
 * 
 * <p>
 * The legendary Kian has posed a challenge to identify a truly smart individual
 * who can solve an old and unsolved problem known as the "OLP" (Old Legendary
 * Problem).
 * </p>
 * 
 * <p>
 * Steps:
 * </p>
 * <ul>
 * <li>Get the total number of sequence from the user</li>
 * <li>Get the sequence from the user</li>
 * <li>Based on that, calculate summation for indexes (0,3,6), (1,4,7), (2,5,8)</li>
 * <li>Finally print the 3 summed values</li>
 * </ul>
 * 
 * <p>
 * Note: n should be within (1 ≤ n ≤ 10^5) and each element should be within (1 ≤
 * ai ≤ 10^9)
 * </p>
 */
public class OldLegendaryProblem {

	/*
	 *<p> main method to execute the Old Legendary Problem
	 *
	 * <p>The legendary Kian has posed a challenge to identify a truly smart individual who
	 * can solve an old and unsolved problem known as the "OLP" (Old Legendary
	 * Problem)
	 * </p>
	 * 
	 * @params args command-line argument (not given for the method)
	 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the total size of the array (1 ≤ n ≤ 10^5): ");
        int n = sc.nextInt();
        if (n < 1 || n > 100000) {
            System.out.println("Invalid size! n must be between 1 and 10^5.");
            sc.close();
            return;
        }

       
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int[] array = new int[n];

       
        System.out.println("Please enter the array values (1 ≤ ai ≤ 10^9): ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (array[i] < 1 || array[i] > 1000000000) {
                System.out.println("Invalid input! ai must be between 1 and 10^9.");
                sc.close();
                return;
            }
        }

        
        for (int i = 0; i < n; i += 3) {
            sum1 += array[i];
            if (i + 1 < n) sum2 += array[i + 1];
            if (i + 2 < n) sum3 += array[i + 2];
        }

        System.out.println("The Sums of 3 Sequence : ");
        System.out.println(sum1 + " " + sum2 + " " + sum3);

    }
}
