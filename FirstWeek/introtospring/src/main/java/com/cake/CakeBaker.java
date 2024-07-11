package com.cake;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    @Autowired
    FrostService frost;
     @Autowired
    SyrupService syrup;


    @PostConstruct
    void callThisBeforeAppleIsUsed() {
        System.out.println("Creating the bean before use");
    }

    @PreDestroy
    void callThisBeforeDestroy() {
        System.out.println("Destroying the  bean");
    }

    public String CakeBaker(){
        String a=frost.getdata();
        String b=syrup.getdata();
        return a+" "+b;
    }
}
