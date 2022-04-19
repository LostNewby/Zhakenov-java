package com.spring.javasp3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Costumer {
    @Id
    @GeneratedValue()
    private long id;
    private String firstName;
    private String secondName;
    private int moneyHave;
    @OneToMany
    private List<Product> productList=new ArrayList<>();
    @OneToOne
    private Address address;
}
