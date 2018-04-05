package com.almundo.dispatcher;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.almundo.dispatcher.representative.*;

/**
 * Unit test for Dispatcher.
 */
public class DispatcherTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DispatcherTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DispatcherTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
      new Dispatcher(new AbsRepresentative[] {
          new Operator("Juancho"),
          new Operator("Eparquio"),
          new Operator("Antoliano")
      }).dispatchCall();
        assertTrue( true );
    }
}
