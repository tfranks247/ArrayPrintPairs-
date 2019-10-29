package com.company;

public class Main {

    public static void main(String[] args) {

        int[] Array1 = {1, 7, 6, 5, 9};
        int[] Array2 = {2, 7, 3, 6, 4};

        for (int i = 0; i < Array1.length; i++) {

            for (int j = 0; j < Array2.length; j++) {

                if (Array1[i] == Array2[j]) { // if Array1 index is the same as Array 2
                    System.out.println("(" + Array1[i] + "," + Array2[j] + ")");
                }
            }

            // write your code here
        }
    }
}

// 9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        // Write a program that will print out all matching pairs from arrays 1 and 2.
        // Expected output:
        // (7,7) and (6,6)

//  for(int i = 0; i < array.length; i++) {
//        if(array[i]==array2[i]){
//        System.out.print("(" + array[i] + "," + array[i] + ")");