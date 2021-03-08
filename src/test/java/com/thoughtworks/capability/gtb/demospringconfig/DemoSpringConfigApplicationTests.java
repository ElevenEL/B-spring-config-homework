package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"levelNumber=0"})
class DemoSpringConfigApplicationTests {

    @Autowired
    private LevelController levelController;

    @Test
    void shouldSpringBootTestAnnotation_overridePropertyValues() {
        Assertions.assertEquals("basic",levelController.getLevel());
    }

}
