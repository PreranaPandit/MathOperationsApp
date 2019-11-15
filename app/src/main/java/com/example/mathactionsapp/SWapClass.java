package com.example.mathactionsapp;

public class SWapClass {

    int first, second;

    public SWapClass(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int [] swapNUmbers()
    {
        first = first + second;
        second = first - second;
        first = first - second;
        return new int[]{first ,second};
    }
}
