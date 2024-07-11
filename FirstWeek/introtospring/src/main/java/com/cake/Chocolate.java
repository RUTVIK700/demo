package com.cake;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
@ConditionalOnProperty(name="deploy.env",havingValue = "production")
//@Primary
public class Chocolate implements Frosting, Syrup {
    @Override
    public String getfrosting() {
        return "ChoclateFrost";

    }

    @Override
    public String getsyrup() {
        return "ChoclateSyrup";
    }
}
