package com;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListVsArray  {

    int arrSize = 10;
    Object[] numbersArr = new Object[arrSize];
    List<Integer> numbersList ;


    @Test(description = "Array to List")
    public void arrToList(){
        for (int i = 0; i < arrSize; i++) {
            numbersArr[i] = i + 1;
        }
        numbersList = new ArrayList(Arrays.asList(numbersArr)); // Arr to List

        for (Object a :numbersList ){
            System.out.print(a + " ");
        }
    }

    @Test(description = "List to Array")
    public void listToArray(){
        numbersList.clear();
        for (int i = 0; i < arrSize; i++) {
            numbersList.add(i+1);
        }
        numbersArr = numbersList.toArray();    // List to Arr
        for (Object a :numbersArr ){
            System.out.print(a + " ");
        }
    }


}
