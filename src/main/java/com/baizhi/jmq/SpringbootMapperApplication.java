package com.baizhi.jmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.baizhi.jmq.mapper")
public class SpringbootMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMapperApplication.class, args);
    }

}

