package com.spring.javasp2;

import com.spring.javasp2.dto.Address;
import com.spring.javasp2.dto.Costumer;
import com.spring.javasp2.dto.Product;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import java.util.Arrays;

@Aspect
@Component
public class Aspects {
    @Before("execution(* com.spring.javasp2.service.Service.*(..))")
    public void init(JoinPoint joinPoint){
        System.out.print(joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object signatureArg: args) {
            if(signatureArg instanceof Address){
                System.out.println(" method is Address related operation");
            }else if(signatureArg instanceof Product || signatureArg instanceof Long){
                System.out.println(" method is Product related operation");
            }else if(signatureArg instanceof Costumer){
                System.out.println(" method is Costumer related operation");
            }

        }
    }

    @After(value = "execution(* com.spring.javasp2.service.Service.*(..))")
    public void fin(JoinPoint joinPoint){
        System.out.println("Operation completed!?");
    }
}
