package com.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.Service;

public class ServiceTest {

    @Test
    public void TestEmailOne() {
        Service service = new Service();
        assertTrue(service.validateEmail("abc@xyz.com"));
    }

    @Test
    public void TestEmailTwo() {
        Service service = new Service();
        assertFalse(service.validateEmail("abcxyz.com"));
    }

}
