package com.almundo.dispatcher;

import com.almundo.dispatcher.representative.AbsRepresentative;
/**
 * Developed by Rafael Bustamante
 *
 */

public class Dispatcher
{
    private AbsRepresentative[] reps;


    public Dispatcher(AbsRepresentative[] reps)
    {
        this.reps = reps;
    }


    public void dispatchCall()
    {
        System.out.println( "Dispatching . . ." );
    }
}
