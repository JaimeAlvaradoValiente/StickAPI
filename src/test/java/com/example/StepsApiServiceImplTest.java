/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package com.example;

import javax.ws.rs.core.Application;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import io.swagger.api.impl.StepsApiServiceImpl;

/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class StepsApiServiceImplTest extends JerseyTest {

     @Override
    public Application configure() {
        enable(TestProperties.LOG_TRAFFIC);
        enable(TestProperties.DUMP_ENTITY);
        return new ResourceConfig(StepsApiServiceImpl.class);
    }

    @Test
    public void testApp() {
        assertTrue(true);
    }

    /*@Test
    public void testGetIt() {
        final String responseMsg = target().path("steps/20").request().get(String.class);

        assertEquals("400 pasos", responseMsg);
    }*/

     @Test
    public void testApp2() {
        assertTrue(true);
    }
}
