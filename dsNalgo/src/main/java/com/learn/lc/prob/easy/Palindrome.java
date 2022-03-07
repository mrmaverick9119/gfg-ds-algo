package com.learn.lc.prob.easy;

/* @author -- Kishan C
    ****** Palindrome *****
* */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeChecker(10002));
    }

    public static boolean palindromeChecker(int number){
        int revNumber = reverseInteger(number);
        if( number <0 || (number !=0 && number%10==0)) return false;
        if(number == revNumber) return true;
        return false;
    }

    public static int reverseInteger(int number){
        int rev = 0;
        for(;number!=0;number = number/10){
            int remainder = number % 10;
            rev = rev * 10 + remainder ;
        }
        return rev;
    }
}
