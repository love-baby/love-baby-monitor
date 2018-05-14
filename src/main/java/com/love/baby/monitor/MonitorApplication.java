package com.love.baby.monitor;

/**
 * Created by liangbc on 2017/8/26.
 */

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liangbc on 2017/7/25.
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class MonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
}
