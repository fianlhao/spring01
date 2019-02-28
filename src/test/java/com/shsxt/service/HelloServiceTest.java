package com.shsxt.service;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/2/28.
 */
public class HelloServiceTest {
    @Test
    public void hello() throws Exception {
        new HelloService().hello();
    }

}