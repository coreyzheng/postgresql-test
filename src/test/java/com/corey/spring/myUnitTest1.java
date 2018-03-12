package com.corey.spring;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class myUnitTest1 {

    @Test
    public void shouldAdd_AppUser_ToDb() {

        String l_str ="my-test";
        Assertions.assertThat(l_str).isEqualTo("my-test");
    }
}