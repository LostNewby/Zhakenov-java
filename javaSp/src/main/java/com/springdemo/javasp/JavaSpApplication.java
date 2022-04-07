package com.springdemo.javasp;

import com.springdemo.javasp.dto.Consumer;
import com.springdemo.javasp.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class JavaSpApplication {



    public static void main(String[] args) {



        SpringApplication.run(JavaSpApplication.class, args);


        Service service;

    }

}
