package com.cake;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env",havingValue = "dev")
public class Strawberry implements Frosting,Syrup{
    @Override
    public String getfrosting() {
        return "StrawberryFrost";
    }

    @Override
    public String getsyrup() {
        return "StrawberrySyrup";
    }
}
