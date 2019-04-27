package com.lwkangpy.yysall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
//开启事物
@EnableTransactionManagement
public class YysAllApplication {

    public static void main(String[] args) {

        SpringApplication.run(YysAllApplication.class, args);

    }

}
