package com.i2i.OCSProject.dgwApp.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AmountService {

    Random random;

    final int voiceUsage=50;
    final int smsUsage=1;
    final int netUsage=3;

    public AmountService() {
        random=new Random();
    }

    public int getAmount(String data){
        if(data.equalsIgnoreCase("VOICE")){
            int number=1+random.nextInt(voiceUsage);
            return number;
        }else if(data.equalsIgnoreCase("DATA")){
            int number=1+random.nextInt(netUsage);
            return number;
        }else if(data.equalsIgnoreCase("SMS")){
            return 1+smsUsage;
        }
        return -1;


    }
}
