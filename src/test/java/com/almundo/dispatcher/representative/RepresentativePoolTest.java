package com.almundo.dispatcher.representative;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for RepresentativePool
 */

public class RepresentativePoolTest
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RepresentativePoolTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( RepresentativePoolTest.class );
    }

    public void testCreateRepresentativePool()
    {
        AbsRepresentative[] pool = new AbsRepresentative[] {
                new Operator("Joaquin"),
                new Supervisor("Teodocio"),
                new Director("Evaristo")
        };

        RepresentativePool repPool = new RepresentativePool(pool);
        assertTrue(pool.length == repPool.getResourcePool().length);
    }
}
