package com.picture.picturebackened;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.picture.picturebackened.mapper")
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class PictureBackenedApplication {

    public static void main(String[] args) {
        SpringApplication.run(PictureBackenedApplication.class, args);
    }

}
