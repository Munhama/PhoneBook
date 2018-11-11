package com.example;

class Calls
{
    private String FIO1;
    private String FIO2;
    private int time;

    public Calls(String FIO1, String FIO2, int time)
    {
        this.FIO1 = FIO1;
        this.FIO2 = FIO2;
        this.time = time;
    }

    public String getFIO1()
    {
        return FIO1;
    }
    public String getFIO2()
    {
        return FIO2;
    }
    public int getTime()
    {
        return time;
    }
}