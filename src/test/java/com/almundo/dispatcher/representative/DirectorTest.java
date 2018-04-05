package com.almundo.dispatcher.representative;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Director representative
 */

public class DirectorTest
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DirectorTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( DirectorTest.class );
    }

    public void testTakeCall()
    {
        String directorName = "Evaristo";
        Director director = new Director(directorName);

        assertTrue(director.getName().equals(directorName));
        assertTrue(director.getPosition().equals(Director.class.getSimpleName()));
        assertTrue(director.getAvailable());
    }
}
