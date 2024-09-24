package com;

import org.apache.commons.lang3.RandomStringUtils;
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
    // A prime number is a natural number greater than 1 that has no divisors other than 1 and itself

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
            if ("aeiou" .contains(Character.toString(c))) {
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
        a = a - b;

//        a = a * b;  // a = 2 b = 3  --> a = 6
//        b = a / b;  // b = 6/3=2
//        a = a / b ; // a = 6/2=3


        System.out.println("a : " + a + "  b : " + b);

    }


    //Print Pascals Triangle  >>>>>>>>>>>>>>>>>>>>>>>>>>
    @Test
    public void printPascalsTriangleRun() {
        printPascalsTriangle(4);

    }

    public void printPascalsTriangle(int rowsCount) {

        for (int i = 1; i < rowsCount; i++) {
            int num = 1;
            System.out.format("%" + (rowsCount - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", num);
                num = num * (i - j) / (j + 1);
            }

            System.out.println();


        }
    }

    // Function to generate Pascal's Triangle up to the given number of rows
    public static List<List<Integer>> printPascalsTriangle2(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case: If no rows are requested, return an empty list
        if (numRows == 0) {
            return triangle;
        }

        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Generate the subsequent rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1); // Get the previous row
            List<Integer> currentRow = new ArrayList<>();

            // First element of each row is always 1
            currentRow.add(1);

            // Calculate the inner elements as the sum of the two numbers above
            for (int j = 1; j < i; j++) {
                int num = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(num);
            }

            // Last element of each row is always 1
            currentRow.add(1);

            // Add the current row to the triangle
            triangle.add(currentRow);
        }

        return triangle;
    }


    @Test
    public void printPascalsTriangle2Run() {
        int numRows = 5; // Number of rows to generate
        List<List<Integer>> triangle = printPascalsTriangle2(numRows);

        // Print Pascal's Triangle
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }


    //Find the missing Number in Array
    @Test
    public void findMissingNumRun() {
        int[] arr = {8, 4, 5, 1, 2, 6};
        findMissingNumR(arr);
        findMissingNums(arr);
    }

    public void findMissingNumR(int[] arr) {

        int n = arr.length + 1; // 6
        int total = n * (n + 1) / 2;  // 21

        for (int num : arr) {
            total -= num;  // 10 - 1 -2 - 4
        }
        System.out.println(total);

    }

    public void findMissingNums(int[] arr) {

        List<Integer> arrList = new ArrayList<>();
        for (int a : arr) {
            arrList.add(a);
        }


        for (int i = 1; i <= arrList.size() + 1; i++) {
            if (!arrList.contains(i)) {
                System.out.println("Missing element: " + i);
//                break;
            }


        }


    }


    //Convert decimal to Binary
    @Test
    public void convertDecimalToBinaryRun() {
        int num = 158;
        convertDecimalToBinary(num);

    }

    public void convertDecimalToBinary(int num) {

        String binary = Integer.toBinaryString(num);
        System.out.println("Binary: " + binary);
    }


    //Check for Perfect Number   //The divisors of 28 (excluding 28 itself) are 1, 2, 4, 7, and 14, and: 1 + 2 + 4 + 7 + 14 = 28
    @Test
    public void checkForPerfectNumberRun() {
        int num = 28; //28
        checkForPerfectNumber(num);

    }

    public void checkForPerfectNumber(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " Is Perfect number");
        } else {
            System.out.println(num + " Is Not Perfect number");
        }


    }


    //Simple Calculator
    @Test
    public void simpleCalculatorRun() {
//        simpleCalculator();
        simpleScanner();
    }

//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Please enter something:");
////
////        String input = scanner.nextLine();
////        System.out.println("You entered: " + input);
////
////        scanner.close();
//        simpleCalculator();
//
//    }

    public void simpleScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something:");

        String input = scanner.next();
        System.out.println("You entered: " + input);

        scanner.close();


    }


    public static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter Operation (+, -, /, * or 'close' to exit)");
            String operation = scanner.nextLine();

            if (operation.equals("close")) {
                break;
            }
            System.out.println("Enter second number");
            double num2 = Double.parseDouble(scanner.nextLine());

            switch (operation) {
                case "+": {
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                }
                case "-": {
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                }
                case "/": {
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                }
                case "*": {
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                }
                default: {
                    System.out.println("Invalid operation");
                }
            }
        }
        scanner.close();  // Close the scanner after the loop
    }


    //Find the sum of Digits of number   (24)
    @Test
    public void findSumOfDigitsRun() {
        int num = 1254;
        findSumOfDigits(num);
        findSumOfDigits2(num);
    }

    public void findSumOfDigits(int num) {

        String numStr = String.valueOf(num);
        char[] arr = numStr.toCharArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println("Numbers Digits sum = " + total);

    }


    public void findSumOfDigits2(int num) {
        int total = 0;
        int number = num;
        while (number != 0) {
            total += number % 10;
            number = number / 10;
        }
        System.out.println("Numbers Digits sum = " + total);
    }


    //Count the Occurrences Of a Character in a String  (27)
    @Test
    public void countCharacterRun() {
        String word = "automation";
        char ch = 'a';
        countCharacter(word, ch);
    }

    public void countCharacter(String word, char ch) {

        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        System.out.println("Char: " + ch + " Occurrences in String: " + word + " = " + count);
    }


    //Find the first non-Repeated Character in a String
    @Test
    public void findFirstNonRepeatedCharacterRun() {
        String word = "automation";
        findFirstNonRepeatedCharacter(word);
    }

    public void findFirstNonRepeatedCharacter(String word) {

        for (char c : word.toCharArray()) {
            int count = 0;
            for (int i = 0; i < word.toCharArray().length; i++) {
                if (c == word.toCharArray()[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("First Non-Repeated Character is " + c);
                break;
            }
        }
    }


    //Remove all whiteSpaces from a String
    @Test
    public void removeWhiteSpacesRun() {

        String str = " Hello World ";

        System.out.println("String >>>" + str + "<<< without white spaces >>>" + removeWhiteSpaces(str) + "<<<");
    }

    public String removeWhiteSpaces(String str) {

        return str.replace(" ", "");


    }


    //Find common elements in Two arrays
    @Test
    public void commonElementsInArraysRun() {

        int[] arr1 = {6, 1, 2, 0, 12, 1, 3, 4, 5, 3};
        int[] arr2 = {6, 3, 4, 5, 7, 8, 9, 0};
        commonElementsInArrays(arr1, arr2);
    }

    public void commonElementsInArrays(int[] arr1, int[] arr2) {

//        HashSet<Integer> commonArr = new HashSet<>() ;       //unique elements + ordering
        Set<Integer> commonArr = new LinkedHashSet<>();       //unique elements
//        ArrayList<Integer> commonArr = new ArrayList<>() ;   //ordering
//        LinkedList<Integer> commonArr = new LinkedList<>() ; //No order no Uniqueness
        for (int a : arr1) {
            for (int b : arr2) {
                if (a == b) {
                    commonArr.add(a);
                }
            }
        }
        System.out.println("Common elements: " + commonArr);
    }


    //Find the factorial of a Number using Recursion
    @Test
    public void factorialOfNumberUsingRecursionRun() {
        int num = 10;
        factorialOfNumberUsingRecursion(num);
        System.out.println("factorial of Num: " + num + " = " + factorial);
    }

    int n;
    int factorial = 1;

    public void factorialOfNumberUsingRecursion(int num) {

        n = num;
        while (n != 0) {
            factorial = factorial * num;
            n--;
            factorialOfNumberUsingRecursion(n);
        }
    }


    //Generate random numbers  (32)
    @Test
    public void generateRandomNumbersRun() {
        int i = 0;
        while (i < 20) {
            System.out.println(generateRandomNumbers(1));
            i++;
        }
    }

    public int generateRandomNumbers(int n) {

        return -Integer.parseInt(RandomStringUtils.randomNumeric(n));

    }


    //check if year is leap  (33)
    // A year is a leap year if it is divisible by 4.
    // However, if the year is also divisible by 100, it is not a leap year unless:
    // The year is divisible by 400, in which case it is a leap year.
    @Test
    public void isLeapYearRun() {

        System.out.println("IsLeapYear = " + isLeapYear(2024));
    }

    public boolean isLeapYear(int year) {
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//            return true;
//        } else {
//            return false;
//        }

        boolean isLeap;
        if ((year%4==0&&year%100!=0)||(year%400==0)){
            isLeap=true;
        }else {
            isLeap=false;
        }

        return isLeap;
    }


    //Find sum of first N natural numbers (34)
    @Test
    public void sumOfNaturalNumbersRun() {
        int num = 10;
        System.out.println("Sum of N natural numbers is equal: " + sumOfNaturalNumbers(num));

    }

    public int sumOfNaturalNumbers(int num) {

        int sum = num*(num+1)/2;
        return sum;

    }


    //Implement a simple login system (35)
    public static void main(String[] args) {
        int attempt = 1;
        while (attempt<4){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter your Username: ");
            String userName = scanner.nextLine();
            System.out.println("Please Enter your Password: ");
            String password = scanner.nextLine();

            if (simpleLoginSystem(userName,password)){
                System.out.println("Dear : " + userName + " Welcome back to your account");
                break;
            }else{
                if (attempt==3){
                    System.out.println("UserName or Password is incorrect Your account is blocked");
                }else {
                    System.out.println("UserName or Password is incorrect Please try again Max attempt = 3 your attempt " + attempt);
                }
            }
            attempt++;
        }
    }

    public static boolean simpleLoginSystem(String username, String password) {
        boolean isLogin;

        if (username.equals("Gor")&&password.equals("Test123456")){
            isLogin=true;
        }else{
            isLogin=false;
        }


        return  isLogin;
    }


    //Check if string contains another string (36)
    @Test
    public void stringContainsOtherStringRun() {
        String str = "Hello World";
        String strContains = "World";

        System.out.println("String '" + str + "' contains '" + strContains + "' is " + stringContainsOtherString(str, strContains));
    }

    public boolean stringContainsOtherString(String str, String strContain) {
        if (str.contains(strContain)){
            return true;
        }else {
            return false;
        }
    }


    //find a maximum Occurring character in a String (37)
    @Test
    public void maxOccurringCharRun() {

    }

    public int maxOccurringChar(int n) {

        return -Integer.parseInt(RandomStringUtils.randomNumeric(n));

    }



    //Bubble sort (38)
    @Test
    public void bubbleSortRun() {

    }

    public int bubbleSort(int n) {

        return -Integer.parseInt(RandomStringUtils.randomNumeric(n));

    }


}
