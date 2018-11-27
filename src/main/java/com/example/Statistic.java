package com.example;

public class Statistic<T>
{
    private T val;

    public Statistic(T val)
    {
        this.val = val;
    }

    public T getVal()
    {
        return this.val;
    }
}
