package com;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {


    @Test(description = "Recursion")
    public void testRecursion(){
        recursionMethod(10);
        recursionMethodFactorial(10);
        whileLoopFactorial(10);
    }


    public void recursionMethod(int n){

        if (n<=1){
            System.out.println("Step " + n + "  FINISH");
        }else{
            System.out.println("Step " + n);
            recursionMethod(n-1);
        }
    }


    static long factorial = 1;
    static boolean isFirstTime = true;
    int num;
    public void recursionMethodFactorial(int n){
        if (isFirstTime){
            num = n;
            isFirstTime = false;
        }

        if (n<=1){
            System.out.println("Factorial of " + num + "! = " + factorial);
        }else{
            factorial = factorial * n;
            recursionMethodFactorial(n-1);
        }

    }

    public void whileLoopFactorial(int n){
        if (isFirstTime){
            num = n;
            isFirstTime = false;
        }
        int factorial = 1;

        while (n>=1){
            factorial = factorial * n;
            n--;
        }
        System.out.println("Factorial of " + num + "! = " + factorial);


    }




}
