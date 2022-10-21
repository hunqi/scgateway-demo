package com.rs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述
 *
 * @auhtor sunlei
 * @since 2022/10/21 11:55
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SCGatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(SCGatewayApp.class, args);
    }

}
