package com.example.mathactionsapp;

public class ReverseClass {

    private int reverseNum;

    public ReverseClass(int reverseNum) {
        this.reverseNum = reverseNum;
    }

    public int getReverseNum()
    {

        int reversed = 0;

        while(reverseNum != 0)
        {
            int digit = reverseNum % 10;
            reversed = reversed * 10 + digit;
            reverseNum /= 10;

        }
        return reversed;
    }
}
