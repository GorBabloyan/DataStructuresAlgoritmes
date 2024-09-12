package com;

import org.testng.annotations.Test;

import java.util.*;

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
        for (int i = 0; i < n - 2; i++) {
            next = num1 + num2;
            num1 = num2;
            num2 = next;
            stringBuilder.append(next).append(" ");
        }
        return stringBuilder.toString();

    }


    // Factorial of number  (input num)

    @Test
    public void findFactorialRun() {

        int num = 4;
        System.out.println("Factorial of " + num + "! = " + findFactorial(num));

    }

    public Integer findFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }


    // Prime number check  (input num1, num2, n -> fibonacci length )

    @Test
    public void isPrimeNumberRun() {

        int num = 17647177;
        System.out.println("Number " + num + " isPrimeNumber = " + isPrimeNumber(num));
    }

    public boolean isPrimeNumber(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
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

        for (char c : stringBuilderVowels.toString().toLowerCase().toCharArray()) {
            if ("aeiou".contains(Character.toString(c))) {
                vowels++;
                System.out.println(c + " Is vowel");
            } else {
                consonants++;
                System.out.println(c + " Is consonants");
            }
        }

        System.out.println("Vowels count = " + vowels);
        System.out.println("Consonants count = " + consonants);

    }


    // sortArray (input arr )

    @Test
    public void sortArrayRun() {

        int[] arr = {5, 8, 3, 5, 1, 9, 2};
        sortArray(arr);

    }

    public void sortArray(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    // merge Two Arrays (input 2x arr )

    @Test
    public void mergeArrayRun() {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        mergeArray(arr1, arr2);

    }

    public void mergeArray(int[] arr1, int[] arr2) {

        int[] mergedArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArr[i + arr1.length] = arr2[i];
        }

        Arrays.sort(mergedArr);
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }


    //find the largest element in array ( input  arr )

    @Test
    public void largestElementInArrayRun() {

        int[] arr = {2, 4, 6, 1, 777, 4, 0, 779};

        System.out.println("Largest element in arr = " + largestElementInArray(arr));


    }

    public Integer largestElementInArray(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    //remove Duplicates in array ( input  arr ) (10)

    @Test
    public void removeDuplicatesRun() {

        int[] arr = {2, 4, 6, 1, 4, 4, 0, 6, 1};
        removeDuplicates(arr);

    }

    public void removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] arr2 = new int[set.size()];
        Iterator<Integer> itr = set.iterator();

        int i = 0;
        while (itr.hasNext()) {
            arr2[i] = itr.next();
            i++;
        }

        for (int a : arr2) {
            System.out.print(a + " ");
        }

    }


    //check number is Armstrong ( input  num ) Example num = 153 (1-3 + 5-3 + 3-3 = 153)An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

    @Test
    public void isArmstrongRun() {

        int num = 153;
//        int num = 9474 ;
        isArmstrong(num);

    }

    public void isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        String number = String.valueOf(num);
        char[] digits = number.toCharArray();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits.length);
            temp = temp / 10;
        }

        System.out.println(num == sum);

    }


    //reverse the number ( input  num ) (10)

    @Test
    public void reverseNumberRun() {
        int num = 123456;
        reverseNumber(num);
        reverseNumber2(num);
    }

    public void reverseNumber(int num) {
        int temp;
        String reverseNumber = "";
        String number = String.valueOf(num);
        char[] digits = number.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            reverseNumber += digits[i];
        }
        temp = Integer.parseInt(reverseNumber);
        System.out.println("Reversed number : " + temp);

    }

    public void reverseNumber2(int num) {

        String number = String.valueOf(num);
        String reverseNumber = new StringBuilder(number).reverse().toString();

        System.out.println("Reversed number : " + Integer.parseInt(reverseNumber));

    }


    //calculate GCD of two numbers ( input  num1 num2 ) ( (Наибольший Общий Делитель) ) (Euclidean Algorithm )
    // Example: num1 = 48, num2 = 18   step 1 --> 48/18 = 2 % 12  step 2 --> 18 / 12 = 1%6  Step 3 --> 12 / 6 = 2 means the greatest Common Divider is 6
    @Test
    public void calculateGCDRun() {
        int num1 = 1000;
        int num2 = 1000;
        calculateGCD(num1, num2);
    }

    public void calculateGCD(int high, int low) {
        int num1 = high;
        int num2 = low;
        int GCD = num2;

        while (num1 % num2 != 0) {
            GCD = num1 % num2;
            if (GCD != 0) {
                num1 = num2;
                num2 = GCD;
            }
        }
        System.out.println("GCD: " + GCD);
    }


    //Check for Anagram ( input  listen silent words with same alphabet )
    @Test
    public void isAnagramRun() {
        String original = "listen";
        String anagram = "silent";

//        String original = "niin";
//        String anagram =  "nnii";
        System.out.println("isAnagram = " + isAnagram(original, anagram));
        System.out.println("isAnagram = " + isAnagram2(original, anagram));

    }

    public boolean isAnagram(String original, String anagram) {
        char[] originalChars = original.toCharArray();
        char[] anagramChars = anagram.toCharArray();

        if (originalChars.length == anagramChars.length) {


            for (int i = 0; i < originalChars.length; i++) {
                boolean contains = false;
                char c = originalChars[i];
                for (int j = 0; j < anagramChars.length; j++) {
                    if (anagramChars[j] == c) {
                        contains = true;
                        anagramChars[j] = '$';
                        break;
                    }
                }
                if (!contains) {
                    return false;
                }
            }
            return true;

        } else {
            return false;
        }

    }

    public boolean isAnagram2(String original, String anagram) {
        char[] originalChars = original.toCharArray();
        char[] anagramChars = anagram.toCharArray();
        Arrays.sort(originalChars);
        Arrays.sort(anagramChars);

        return (Arrays.equals(originalChars, anagramChars));

    }


    //count of Number of Digits in a Number
    @Test
    public void countDigitsInNumberRun() {
        int num = 2356664;

        System.out.println("Count of digits : " + countDigitsInNumber(num));

    }

    public int countDigitsInNumber(int num) {
        String number = String.valueOf(num);
        return number.length();
    }


    //Print the Prime Numbers in a Range
    @Test
    public void primeNumbersInRangeRun() {
        int start = 10;
        int end = 3000;
        primeNumbersInRange(start, end);
        for (Object a : primeNumbersInRange(start, end)) {
            System.out.print(" " + a);
        }
    }

    public List primeNumbersInRange(int low, int high) {
        List<Integer> numbers = new ArrayList();


        for (int num = low; num <= high; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                numbers.add(num);
            }
        }

        return numbers;
    }


    //Find the second-Largest Element in Array
    @Test
    public void secondLargestElementRun() {
//        int[] arr = {1,7,25,3,6,78,78,25,78,25,78,80,0,122};
        int[] arr = {20, 20, 20, 20};
        System.out.println("Second Large element : " + secondLargestElement(arr));

    }

    public Integer secondLargestElement(int[] arr) {
        Arrays.sort(arr);
        int secondMax = arr[arr.length - 2];
        if (secondMax < arr[arr.length - 1]) {
            return secondMax;
        } else {
            for (int i = arr.length - 3; i >= 0; i--) {
                if (secondMax > arr[i]) {
                    secondMax = arr[i];
                    break;
                }
            }
        }
        if (secondMax == arr[arr.length - 1]) {
            return null;
        }
        return secondMax;
    }



    //Swap two numbers
    @Test
    public void swapTwoNumbersRun() {
        swapTwoNumbers();

    }

    public void swapTwoNumbers() {
        int a = -5;
        int b = 17;
        a = a + b;
        b = a - b;
        a = a - b ;

//        a = a * b;  // a = 2 b = 3  --> a = 6
//        b = a / b;  // b = 6/3=2
//        a = a / b ; // a = 6/2=3


        System.out.println("a : " + a + "  b : " + b);

    }





    //Print Pascals Triangle  >>>>>>>>>>>>>>>>>>>>>>>>>>
    @Test
    public void printPascalsTriangleRun() {
        printPascalsTriangle();

    }

    public void printPascalsTriangle() {
        int a = -5;
        int b = 17;
        a = a + b;
        b = a - b;
        a = a - b ;

//        a = a * b;  // a = 2 b = 3  --> a = 6
//        b = a / b;  // b = 6/3=2
//        a = a / b ; // a = 6/2=3


        System.out.println("a : " + a + "  b : " + b);

    }



    //Find the missing Number in Array
    @Test
    public void findMissingNumRun() {
        findMissingNumR();

    }

    public void findMissingNumR() {
        int a = -5;
        int b = 17;
        a = a + b;
        b = a - b;
        a = a - b ;

//        a = a * b;  // a = 2 b = 3  --> a = 6
//        b = a / b;  // b = 6/3=2
//        a = a / b ; // a = 6/2=3


        System.out.println("a : " + a + "  b : " + b);

    }



    //Convert decimal to Binary
    @Test
    public void convertDecimalToBinaryRun() {
        convertDecimalToBinary();

    }

    public void convertDecimalToBinary() {
        int a = -5;
        int b = 17;
        a = a + b;
        b = a - b;
        a = a - b ;

//        a = a * b;  // a = 2 b = 3  --> a = 6
//        b = a / b;  // b = 6/3=2
//        a = a / b ; // a = 6/2=3


        System.out.println("a : " + a + "  b : " + b);

    }



    //Check for Perfect Number
    @Test
    public void checkForPerfectNumberRun() {
        checkForPerfectNumber();

    }

    public void checkForPerfectNumber() {
        int a = -5;
        int b = 17;
        a = a + b;
        b = a - b;
        a = a - b ;

//        a = a * b;  // a = 2 b = 3  --> a = 6
//        b = a / b;  // b = 6/3=2
//        a = a / b ; // a = 6/2=3


        System.out.println("a : " + a + "  b : " + b);

    }



    //Simple Calculator
    @Test
    public void simpleCalculatorRun() {
        simpleCalculator();

    }

    public void simpleCalculator() {
        int a = -5;
        int b = 17;
        a = a + b;
        b = a - b;
        a = a - b ;

//        a = a * b;  // a = 2 b = 3  --> a = 6
//        b = a / b;  // b = 6/3=2
//        a = a / b ; // a = 6/2=3


        System.out.println("a : " + a + "  b : " + b);

    }



    //Find the sum of Digits of number   (24)
    @Test
    public void findSumOfDigitsRun() {
        findSumOfDigits();

    }

    public void findSumOfDigits() {
        int a = -5;
        int b = 17;
        a = a + b;
        b = a - b;
        a = a - b ;

//        a = a * b;  // a = 2 b = 3  --> a = 6
//        b = a / b;  // b = 6/3=2
//        a = a / b ; // a = 6/2=3


        System.out.println("a : " + a + "  b : " + b);

    }










}
