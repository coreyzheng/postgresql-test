package com.corey.controller;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by haibinzheng on 2018-03-13.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomersTest {

    @Test
    public void CustomersTest1() {

        String l_str ="my-test";
        Assertions.assertThat(l_str).isEqualTo("my-test");
    }
}