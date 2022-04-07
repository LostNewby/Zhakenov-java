package com.springdemo.javasp.repository;

import com.springdemo.javasp.dto.Address;
import com.springdemo.javasp.dto.Consumer;

import java.util.ArrayList;
import java.util.List;

public class ConsumerRepositoryImplementation implements ConsumerRepository{
    public List<Consumer> getList(){
        return Consumer.getConsumers();
    }

    public Consumer findById(long id){
        List<Consumer> temp=this.getList();
        for(Consumer i:temp){
            if(i.getId()==id){
                return i;
            }
        }
        return null;
    }

    public List<Consumer> findByFullName(String f, String s){
        List<Consumer> res=new ArrayList<>();
        List<Consumer> temp=this.getList();
        for(Consumer i:temp){
            if(i.getFirstName()==f && i.getSecondName()==s){
                res.add(i);
            }
        }
        return res;
    }

    public List<Consumer> findByFirstName(String f){
        List<Consumer> res=new ArrayList<>();
        List<Consumer> temp=this.getList();
        for(Consumer i:temp){
            if(i.getFirstName()==f){
                res.add(i);
            }
        }
        return res;
    }
}
