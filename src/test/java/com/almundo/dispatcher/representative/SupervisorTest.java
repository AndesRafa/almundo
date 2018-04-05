package com.almundo.dispatcher.representative;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Supervisor representative
 */

public class SupervisorTest
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SupervisorTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( SupervisorTest.class );
    }

    public void testTakeCall()
    {
        String supervisorName = "Evaristo";
        Supervisor supervisor = new Supervisor(supervisorName);

        assertTrue(supervisor.getName().equals(supervisorName));
        assertTrue(supervisor.getPosition().equals(Supervisor.class.getSimpleName()));
        assertTrue(supervisor.getAvailable());
    }
}
