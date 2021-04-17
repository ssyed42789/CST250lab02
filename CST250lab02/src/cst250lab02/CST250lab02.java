/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250lab02;

import java.util.Arrays;

/**
 *
 * @author ssyed
 */
public class CST250lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[] = { 1, 5, 100, 40, 80, 50 };

        int length = a.length;
        int temp;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        
        }
        /*public static int Sort(String[] args) {*/
       int[] array = {10, 2, 10, 3, 1, 2, 5};
System.out.println(Arrays.toString(array));
for (int left = 0; left < array.length; left++) {
	// Get an element
	int value = array[left];
	// Iterate through the elements that are in front of this element
	int i = left - 1;
	for (; i >= 0; i--) {
		// If the current element is smaller, then move the larger element to the right.
		if (value < array[i]) {
			array[i + 1] = array[i];
		} else {
			// If the current element is larger, we stop
			break;
		}
	}
	// Insert the current value in the empty space
	array[i + 1] = value;
   }
System.out.println(Arrays.toString(array));
       
}
}
