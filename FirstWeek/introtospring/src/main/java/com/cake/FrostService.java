package com.cake;

import org.springframework.stereotype.Service;

@Service
public class FrostService {

    Frosting fr;

    public FrostService(Frosting fr) {
        this.fr = fr;
    }

    public String getdata(){
        return fr.getfrosting();
    }
}
