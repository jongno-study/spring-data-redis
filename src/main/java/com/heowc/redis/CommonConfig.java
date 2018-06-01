package com.heowc.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.CountDownLatch;

@Configuration
public class CommonConfig {

    @Bean
    public CountDownLatch latch() {
        return new CountDownLatch(1);
    }

}
