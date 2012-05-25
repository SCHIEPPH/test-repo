package com.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by
 * User: ralph
 * Date: 12/6/11
 * Time: 2:25 PM
 */
public class BoYubbaTest extends TestCase {

    @Before
    public void setup() {
    }

    @After
    public void teardown() {
    }

    @Test
    public void  testGetMessage() {
        BoYubba     yb = new BoYubba();
        String      returnedMessage;

        returnedMessage = yb.getMessage();

        assertEquals("getMessage() returned the wrong message.", returnedMessage, "Yo Bubba!");
    }
}
