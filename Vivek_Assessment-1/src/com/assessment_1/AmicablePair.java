package com.assessment_1;

import java.util.Scanner;

/*
 * <h1> AmicablePair </h1>
 * 
 * <p> The sum of all proper divisor of x and the sum of all proper divisor y should be equal to
 * the opposite number.</p>
 * 
 * <p> Steps : </p>
 * <ul>
 * 	<li>Enter the x value and the y values (get from user)</li>
 * 	<li>All the divisors of the x will be summed and stored</li>
 * 	<li>All the divisors of the y will be summed and stored</li>
 * 	<li>Finally the two opposite value and the sum value is cross checked and amicable or not is printed</li>
 * </ul>
 */
public class AmicablePair {

	/*
	 *<p> main method to execute the amicable number problem
	 *
	 * <p>check whether the pair is amicable pair. If amicable pair code
	 * should output true else false</p>
	 * 
	 * @params args command-line argument (not given for the method)
	 */
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, sumX = 0, sumY = 0;

        System.out.println("Enter the x value: ");
        x = sc.nextInt();

        System.out.println("Enter the y value: ");
        y = sc.nextInt();

       
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sumX += i;
            }
        }

       
        for (int i = 1; i <= y / 2; i++) {
            if (y % i == 0) {
                sumY += i;
            }
        }

      
        if (sumX == y && sumY == x) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

      
    }
}
