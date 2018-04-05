package com.almundo.dispatcher.representative;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Operator representative
 */

public class OperatorTest
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public OperatorTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( OperatorTest.class );
    }

    public void testTakeCall()
    {
        String operatorName = "Joaquin";
        Operator operator = new Operator(operatorName);

        assertTrue(operator.getName().equals(operatorName));
        assertTrue(operator.getPosition().equals(Operator.class.getSimpleName()));
        assertTrue(operator.getAvailable());
    }
}
