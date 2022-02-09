package com.optimagrowth.configserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/* Use native profile to look for configs on disk */
@ActiveProfiles("native")
@SpringBootTest
class ConfigurationServerApplicationTests {

    @Test
    void contextLoads() {
    }

}
