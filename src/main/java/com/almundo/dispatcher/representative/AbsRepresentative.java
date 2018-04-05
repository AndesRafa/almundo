package com.almundo.dispatcher.representative;

import java.lang.Runnable;
import java.lang.Thread;
import java.lang.InterruptedException;

/**
 *
 */

public abstract class AbsRepresentative
    implements Runnable
{

    protected String name;
    protected boolean available;
    protected String position;

    public AbsRepresentative(String name)
    {
        this.name = name;
        this.position = this.getClass().getSimpleName();
        this.available = true;
    }

    @Override
    public void run()
    {
        this.available = false;

        try
        {
            attendCall();
        }
        catch (InterruptedException ex)
        {
            System.out.println(ex.getLocalizedMessage());
        }

        this.available = true;
    }

    public void attendCall() throws InterruptedException
    {
        System.out.println(String.format("Agent %s is in a call", this.name));
        Thread.sleep(5000);
    }

    public String getName()
    {
        return this.name;
    }

    public boolean getAvailable()
    {
        return this.available;
    }

    public String getPosition()
    {
        return this.position;
    }
}
