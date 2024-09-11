package com;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BinarySearch  {



    @Test
    public void test(){
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = i + 1;
        }
        int value = 750;

        System.out.println("searchBinary The index searched numbers index is: " + searchBinary(numbers,value));
        System.out.println("searchBinaryPredefined The index searched numbers index is: " + searchBinaryPredefined(numbers,value));

    }



    public int searchBinary(int[] arr, int value){
        int stepsCount = 0;
        int guess;
        int low = 0;
        int high = arr.length-1;
        int middle;

        while (low<=high){
            stepsCount++;
            middle = (low + high)/2;
            guess = arr[middle];
            if (guess == value){
                System.out.println("Searched item was find after " + stepsCount + " Steps its index = " + middle);
                System.out.println();
                return middle;
            }
            else if (guess > value) {
                System.out.println("guess: " + guess + " [" + low + " "+ high + "] ");
                high = middle-1;
            }
            else {
                System.out.println("guess: " + guess + " [" + low + " "+ high + "] ");
                low = middle+1;
            }
        }
        System.out.println("The array doesn't contain your chosen number");
        System.out.println();
        return -1;
    }


    public int searchBinaryPredefined(int[] arr, int value){
         int result = Arrays.binarySearch(arr, value);
         return result;
    }



}
