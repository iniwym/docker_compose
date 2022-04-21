package com.mobini.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description: docker 启动类
 * @Author: Mobini
 * @Date: 2022-04-20
 */
@SpringBootApplication
@MapperScan("com.mobini.docker.mapper") //import tk.mybatis.spring.annotation.MapperScan;
public class DockerBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerBootApplication.class, args);
    }
}
