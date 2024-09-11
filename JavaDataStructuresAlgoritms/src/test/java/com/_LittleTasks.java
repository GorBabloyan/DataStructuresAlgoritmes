package com;
import org.testng.annotations.Test;

public class _LittleTasks extends Base {


    // Reverse String

    @Test
    public void reverseStringRun() {
        String needBeReversed = "Automation";

        System.out.println(reverseString(needBeReversed));
        System.out.println(reverseStringShort(needBeReversed));
    }

    public String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder(str.length());
        if (str == null || str.length() <= 1) {
            return str;
        } else {
            char[] strChars = str.toCharArray();
            char[] reversedStrChars = new char[str.length()];
            int j = 0;
            for (int i = strChars.length - 1; i >= 0; i--) {
                reversedStrChars[j] = strChars[i];
                reversedStr.append(reversedStrChars[j]);
                j++;
            }
            return reversedStr.toString();
        }
    }

    public String reverseStringShort(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        } else {
            StringBuilder reversedStr = new StringBuilder(str);
            reversedStr.reverse();
            return reversedStr.toString();
        }

    }




    // Reverse Palindrome (Input String is equal to Reversed String)

    @Test
    public void checkPalindromeRun() {
//        String str = "Automation";
//        String str = "";
//        String str = null;
        String str = "Bob";
        System.out.println(">> " + str + " <<" + " isPalindrome = " + checkPalindromeShort(str));
    }

    public boolean checkPalindromeShort(String str) {

        if (str == null) {
            return false;
        } else {
            String strLocal = str.toLowerCase();
            StringBuilder reversedStr = new StringBuilder(strLocal).reverse();
            if (reversedStr.toString().equals(strLocal)) {
                return true;
            } else {
                return false;
            }
        }
    }




    // Fibonacci  (input num1, num2, n -> fibonacci length )

    @Test
    public void createFibonacciListRun() {

        int num1 = 2;
        int num2 = 8;
        int n = 10;
        System.out.println(createFibonacciList(num1, num2, n));

    }

    public String createFibonacciList(int num1, int num2, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num1).append(" ");
        stringBuilder.append(num2).append(" ");
        int next;
        for (int i = 0; i < n-2; i++) {
            next = num1 + num2;
            num1 = num2;
            num2 = next;
            stringBuilder.append(next).append(" ");
        }
        return  stringBuilder.toString();

    }




    // Factorial of number  (input num)

    @Test
    public void findFactorialRun() {

        int num = 4;
        System.out.println("Factorial of " + num + "! = " + findFactorial(num));

    }

    public Integer findFactorial(int num) {
        int factorial = 1;
        for (int i=1; i<=num; i++){
            factorial = factorial*i;
        }
        return factorial;
    }





    // Prime number check  (input num1, num2, n -> fibonacci length )

    @Test
    public void isPrimeNumberRun() {

        int num = 17647177;
        System.out.println("Number " + num + " isPrimeNumber = " +isPrimeNumber(num));
    }

    public boolean isPrimeNumber(int num) {

        for (int i =2; i < num; i++){
            if (num % i == 0){
                System.out.println("Its dividing on " + i);
                return false;
            }
        }
        return true;
    }






    // Count vowels and consonants (input String str )

    @Test
    public void vowelsConsonantsRun() {

        String src = "Automation";
        vowelsConsonants(src);

    }

    public void vowelsConsonants(String src) {

        int vowels = 0;
        int consonants = 0;
        StringBuilder stringBuilderVowels = new StringBuilder(src);

        for (char c : stringBuilderVowels.toString().toLowerCase().toCharArray()){
            if ("aeiou".contains(Character.toString(c))){
                vowels ++;
                System.out.println(c + " Is vowel");
            }
            else {
                consonants++;
                System.out.println(c + " Is consonants");
            }
        }

        System.out.println( "Vowels count = " + vowels);
        System.out.println( "Consonants count = " + consonants);

    }



















}
