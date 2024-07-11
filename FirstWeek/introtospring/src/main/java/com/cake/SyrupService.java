package com.cake;


import org.springframework.stereotype.Service;

@Service
public class SyrupService {



    Syrup sr;

    public SyrupService(Syrup sr) {
        this.sr = sr;
    }

    public String getdata(){
        return sr.getsyrup();
    }
}
