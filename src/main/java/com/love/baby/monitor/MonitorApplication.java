package com.love.baby.monitor;

/**
 * Created by liangbc on 2017/8/26.
 */

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liangbc on 2017/7/25.
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class MonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
}
