package com.almundo.dispatcher.call;

import java.util.Random;

public class Call
{
    private int duration;

    public Call()
    {
        this.duration = new Random().nextInt(5) + 5;
    }

    public Call(int duration)
    {
        if (duration > 10) {
            duration = new Random().nextInt(5) + 5;
        }
        this.duration = duration;
    }

    public int getDuration()
    {
        return this.duration;
    }
}
