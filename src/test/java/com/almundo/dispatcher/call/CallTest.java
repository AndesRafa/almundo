package com.almundo.dispatcher.call;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Call
 */

public class CallTest
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CallTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( CallTest.class );
    }

    public void testCreateCall()
    {
        int duration = 7;
        Call call = new Call(duration);

        assertTrue(call.getDuration() == duration);
    }
}
