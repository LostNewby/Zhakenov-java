package com.spring.javasp3;


import com.spring.javasp3.dto.Address;
import com.spring.javasp3.service.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class JavaSp3Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaSp3Application.class);
    }


}
