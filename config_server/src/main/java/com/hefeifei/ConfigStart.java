package com.hefeifei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigStart.class,args);
    }
}
