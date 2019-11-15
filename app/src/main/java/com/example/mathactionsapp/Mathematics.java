package com.example.mathactionsapp;

public class Mathematics {

    private float radius;


    //generating constructors
    public Mathematics(float radius)
    {
        this.radius = radius;
    }


    public float area()
    {
        return (float) (Math.PI*radius*radius);
    }
}
