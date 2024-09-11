package com;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class SortArr extends Base {




    @Test
    public void sortArrayJava(){

        Integer[] numbers = {5, 2, 8, 1, 4};

        // Sort the array in descending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));


    }

    @Test
    public void sortArrayJavaReverse(){

        Integer[] numbers = {5, 2, 8, 1, 4};

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));


    }




    @Test
    public void test(){
        int[] numbers = {10,3,8,78,9,1};

        int[] sortedNumbers = sortArrayInt(numbers);

        for (int i=0;i<sortedNumbers.length;i++){
            System.out.print(sortArrayInt(numbers)[i] + " ");
        }

    }



    public int[] sortArrayInt(int arrayInt[]){
        int sortedArray[] = new int[arrayInt.length];
        int smallest ;

        for (int j=0; j < sortedArray.length;j++ ){
            smallest = arrayInt[j];
            for (int i =1; i<arrayInt.length; i++) {
                if (smallest > arrayInt[i]){
                    smallest = arrayInt[i];
                }
            }
            System.out.println("smallest " +smallest);
            sortedArray[j] = smallest;
        }

        return sortedArray;
    }



}
