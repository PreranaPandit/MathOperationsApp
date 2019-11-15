package com.example.mathactionsapp;

public class PalindromeClass {

    private int palindromeNum;

    public PalindromeClass(int palindromeNum) {
        this.palindromeNum = palindromeNum;
    }

    public boolean checkPalin()

    {
        int r, sum=0, temp;
        temp = palindromeNum;
        while(palindromeNum > 0)
        {
            r = palindromeNum % 10;
            sum = (sum * 10) +r;
            palindromeNum = palindromeNum / 10;
        }

        if(temp == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
