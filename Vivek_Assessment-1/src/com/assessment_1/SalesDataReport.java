package com.assessment_1;

import java.util.Scanner;

/*
 * <h1> Sales Data Report </h1>
 * 
 * <p> You are working for a retail company and have been tasked with analyzing sales
 * data for different products across several stores.</p>
 * 
 * <p> Steps : </p>
 * <ul>
 * 	<li>Get the row(store) and column(prodcut) size from the user</li>
 * 	<li>Get the row(store) and column(prodcut) value from the user</li>
 * 	<li>based on that follow some steps to calculate based on condition : 
 * 		<ul>
 * 			<li>a. Display the total sales for each store.</li>
 * 			<li>b. Display the total sales for each product.</li>
 * 			<li>c. Display the store with the highest total sales.</li>
 * 			<li>d. Display the product with the highest total sales.</li>
 * 			<li>e. Display the average sales for each store.</li>
 * 			<li>f. Display the average sales for each product.</li></li>
 * 		</ul>
 *  </li>
 * 		
 * 	<li>Finally display all the steps that is asked</li>
 * </ul>
 * 
 */

public class SalesDataReport {

	
	/*
	 *<p> main method to execute the Sales Data Report
	 *
	 * <p>. You have been provided with an
	 * array representing sales data for each product in each store. Each row represents
	 * a store, and each column represents a product.
	 * </p>
	 * 
	 * @params args command-line argument (not given for the method)
	 */
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Please enter the number of rows (stores):");
        int row = sc.nextInt();

        System.out.println("Please enter the number of columns (products):");
        int col = sc.nextInt();

        // Initialize arrays
        int[][] array = new int[row][col];
        int[] store = new int[row];
        int[] product = new int[col];
        int[] storeAvg = new int[row];
        int[] productAvg = new int[col];

        // Input for sales data
        System.out.println("Enter the sales data:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
               
            }
        }

        // Calculate total sales for each store
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                store[i] += array[i][j];
            }
        }

        // Display total sales for each store
        System.out.println("\nTotal sales for each store:");
        for (int i = 0; i < row; i++) {
            System.out.println("Store " + (i + 1) + ": " + store[i]);
        }

        // Calculate total sales for each product
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                product[j] += array[i][j];
            }
        }

        // Display total sales for each product
        System.out.println("\nTotal sales for each product:");
        for (int j = 0; j < col; j++) {
            System.out.println("Product " + (j + 1) + ": " + product[j]);
        }

        // Find the store with the highest total sales
        int maxStoreSales = store[0];
        int maxStoreIndex = 0;
        for (int i = 1; i < store.length; i++) {
            if (store[i] > maxStoreSales) {
                maxStoreSales = store[i];
                maxStoreIndex = i;
            }
        }
        System.out.println("\nStore with the highest sales: Store " + (maxStoreIndex + 1) + " with sales of " + maxStoreSales);

        // Find the product with the highest total sales
        int maxProductSales = product[0];
        int maxProductIndex = 0;
        for (int j = 1; j < product.length; j++) {
            if (product[j] > maxProductSales) {
                maxProductSales = product[j];
                maxProductIndex = j;
            }
        }
        System.out.println("Product with the highest sales: Product " + (maxProductIndex + 1) + " with sales of " + maxProductSales);

        // Calculate average sales for each store
        System.out.println("\nAverage sales for each store:");
        for (int i = 0; i < row; i++) {
            storeAvg[i] = store[i] / col; // Average is total sales divided by number of products
            System.out.println("Store " + (i + 1) + ": " + storeAvg[i]);
        }

        // Calculate average sales for each product
        System.out.println("\nAverage sales for each product:");
        for (int j = 0; j < col; j++) {
            productAvg[j] = product[j] / row; // Average is total sales divided by number of stores
            System.out.println("Product " + (j + 1) + ": " + productAvg[j]);
        }

       
    }
}
