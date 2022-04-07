package com.springdemo.javasp;

import com.springdemo.javasp.dto.Product;
import com.springdemo.javasp.service.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSpApplicationTest {

    @Test
    void test1(){
        Service service=new Service();
        int t=service.prodNum(180, Product.getProducts().get(0));
        assertEquals(t, 6);
    }

}