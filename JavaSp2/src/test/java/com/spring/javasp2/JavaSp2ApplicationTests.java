package com.spring.javasp2;

import com.spring.javasp2.dto.Address;
import com.spring.javasp2.dto.Costumer;
import com.spring.javasp2.dto.Product;
import com.spring.javasp2.service.Service;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JavaSp2ApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void testProduct1(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Product apple=new Product("apple", 50, 's');
        Product banana=new Product("banana", 60, 'm');
        apple=service.insertOrUpdate(apple);
        banana=service.insertOrUpdate(banana);

        assertNotEquals(apple.getPid(),0);


    }

    @Test
    void testProduct2(){

        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Product apple=new Product("apple", 50, 's');
        Product banana=new Product("banana", 60, 'm');
        apple=service.insertOrUpdate(apple);
        banana=service.insertOrUpdate(banana);

        assertEquals(service.findByPid(apple.getPid()).getName(), apple.getName());
    }

    @Test
    void testProduct3(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Product apple=new Product("apple", 50, 's');
        Product banana=new Product("banana", 60, 'm');
        apple=service.insertOrUpdate(apple);
        banana=service.insertOrUpdate(banana);

        assertEquals(service.deleteProduct(apple), 1);
    }

    @Test
    void testProduct4(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Product apple=new Product("apple", 50, 's');
        Product banana=new Product("banana", 60, 'm');
        apple=service.insertOrUpdate(apple);
        banana=service.insertOrUpdate(banana);

        List res=new ArrayList<>();
        res.add(apple);
        res.add(banana);
        assertEquals(service.findAllProducts().size(), res.size());
    }
    @Test
    void testProduct5(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Product apple=new Product("apple", 50, 's');
        Product banana=new Product("banana", 60, 'm');
        apple=service.insertOrUpdate(apple);
        banana=service.insertOrUpdate(banana);

        List<Product> comp=service.affProdPrice(55);
        List res=new ArrayList<>();
        res.add(apple);
        res.add(banana);
        assertEquals(comp.size(), 1);
    }

    @Test
    void testProduct6(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Product apple=new Product("apple", 50, 's');
        Product banana=new Product("banana", 60, 'm');
        apple=service.insertOrUpdate(apple);
        banana=service.insertOrUpdate(banana);

        List<Product> comp=service.affProdSize('s');
        List res=new ArrayList<>();
        res.add(apple);
        res.add(banana);
        assertEquals(comp.size(), 1);
    }

    @Test
    void testAddress1(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Address add=new Address("Afgo", "Nono","ter");
        add=service.insertOrUpdate(add);

        assertNotEquals(add.getStreet(), null);
    }

    @Test
    void testAddress2(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Address add=new Address("Afgo", "Nono","ter");
        Address add1=new Address("Fort", "Mortt","Hito");
        add=service.insertOrUpdate(add);
        add1=service.insertOrUpdate(add1);

        List res=new ArrayList<>();
        res.add(add);
        res.add(add1);

        assertEquals(service.findAllAddresses().size(), 2);
    }

    @Test
    void testAddress3(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Address add=new Address("Afgo", "Nono","ter");
        Address add1=new Address("Fort", "Mortt","Hito");
        add=service.insertOrUpdate(add);
        add1=service.insertOrUpdate(add1);



        assertEquals(service.deleteAddress(add), 1);
    }

    @Test
    void testAddress4(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Address add=new Address("Afgo", "Nono","ter");
        Address add1=new Address("Fort", "Mortt","Hito");
        add=service.insertOrUpdate(add);
        add1=service.insertOrUpdate(add1);



        assertEquals(service.findAddressByCity(add.getCity()).get(0).getCountry(), add.getCountry());
    }

    @Test
    void testAddress5(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Address add=new Address("Afgo", "Nono","ter");
        Address add1=new Address("Fort", "Mortt","Hito");
        add=service.insertOrUpdate(add);
        add1=service.insertOrUpdate(add1);



        assertEquals(service.findAddressByCountry(add.getCountry()).get(0).getStreet(), add.getStreet());
    }

    @Test
    void testAddress6(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Address add=new Address("Afgo", "Nono","ter");
        Address add1=new Address("Fort", "Mortt","Hito");
        add=service.insertOrUpdate(add);
        add1=service.insertOrUpdate(add1);



        assertEquals(service.findAddressByStreet(add.getStreet()).getCity(), add.getCity());
    }

    @Test
    void testCostumer1(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Address add=new Address("Afgo", "Nono","ter");
        Address add1=new Address("Fort", "Mortt","Hito");
        add=service.insertOrUpdate(add);
        add1=service.insertOrUpdate(add1);

        Costumer cos1=new Costumer("Allen", "Smith", 5000, add);
        Costumer cos2=new Costumer("Ben", "Kroll", 3000, add1);

        cos1=service.insertOrUpdate(cos1);
        cos2=service.insertOrUpdate(cos2);

        assertEquals(service.findAllCostumers().size(), 2);

    }

    @Test
    void testCostumer2(){
        ConfigurableApplicationContext configurableApplicationContext=
                SpringApplication.run(JavaSp2Application.class);
        Service service=configurableApplicationContext.getBean(Service.class);

        Address add=new Address("Afgo", "Nono","ter");
        Address add1=new Address("Fort", "Mortt","Hito");
        add=service.insertOrUpdate(add);
        add1=service.insertOrUpdate(add1);

        Costumer cos1=new Costumer("Allen", "Smith", 5000, add);
        Costumer cos2=new Costumer("Ben", "Kroll", 3000, add1);

        cos1=service.insertOrUpdate(cos1);
        cos2=service.insertOrUpdate(cos2);

        service.deleteCostumer(cos1);

        assertEquals(service.findAllCostumers().size(), 1);

    }

}
