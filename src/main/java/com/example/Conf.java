package com.example;

class Conf
{
    private String[] FIO;
    private int time;

    public Conf(String[] FIO, int time)
    {
        this.FIO = FIO;
        this.time = time;
    }

    public String[] getFIO()
    {
        return FIO;
    }
    public int getTime()
    {
        return time;
    }
}