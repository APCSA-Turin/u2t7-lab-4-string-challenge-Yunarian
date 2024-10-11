package com.example.project;

public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
        int len = x.length();

        if (len >= 2) {
            String lastTwoLetters = x.substring(len - 2);
            if (lastTwoLetters.toLowerCase().equals("ly")) {
                return true;
            }
        }

        return false;
    }


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();
        String s1LastChar = "";
        String s2FirstChar = "";
        if (s1Length != 0) {
            s1LastChar = s1.substring(s1Length - 1);
        }
        if (s2Length != 0) {
           s2FirstChar = s2.substring(0, 1); 
        }
        
        if (s1LastChar.equals(s2FirstChar)) {
            s1 = s1.substring(0, s1Length - 1);
        }
        return s1 + s2;
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    public String deFont(String s1){
        String firstChar = s1.substring(0, 1);
        String secondChar = s1.substring(1, 2);
        String pastSecondChar = s1.substring(2);

        if (firstChar.equals("a")) {

            if (secondChar.equals("b")) {
                return s1;

            } else {
                return firstChar + pastSecondChar;

            } 
        } else if (secondChar.equals("b")) {
            return s1.substring(1);

        }
        return pastSecondChar;
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        int s1Length = s1.length();
        if (s1.substring(0, 1).equals("x")) {
            s1 = s1.substring(1);
            s1Length--;
        } 

        if (s1.substring(s1Length - 1).equals("x")) {
            s1 = s1.substring(0, s1Length - 1);
        }
        return s1;
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1){
        String returnedString = "";
        if (s1.substring(0, 1).equals("f")) {
            returnedString += "Fizz";
        } 
        if (s1.substring(s1.length() - 1).equals("b")) {
            returnedString += "Buzz";
        }
        return returnedString;
    }

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x){
        String returnedString = "";
        if (x % 3 == 0) {
            returnedString += "Fizz";
        }
        if (x % 5 == 0) {
            returnedString += "Buzz";

        } 
        if (x % 3 != 0 & x % 5 != 0) {
            return x + "!";

        }
        return returnedString + "!";
    }
}