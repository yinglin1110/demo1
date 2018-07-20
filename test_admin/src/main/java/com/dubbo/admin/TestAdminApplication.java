package com.dubbo.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ImportResource("classpath:spring-dubbo.xml")
//@MapperScan("com.dubbo.admin.dao")
public class TestAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAdminApplication.class, args);
    }
}
