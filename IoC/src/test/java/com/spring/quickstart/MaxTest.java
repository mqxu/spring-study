package com.spring.quickstart;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class MaxTest {

    private static Logger log = Logger.getLogger(MaxTest.class.getClass());

    @Autowired
    private Max max;

    @Test
    public void getMax() {
        log.debug("debug by mqxu");
        assertEquals(5, max.getMax());
    }
}