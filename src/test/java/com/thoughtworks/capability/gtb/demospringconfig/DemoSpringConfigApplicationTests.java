package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringConfigApplicationTests {

    @Autowired
    private LevelController levelController;

    @Test
    void shouldTestResourceFile_overridePropertyValues() {
        Assertions.assertEquals("advanced", levelController.getLevel());
    }

}
