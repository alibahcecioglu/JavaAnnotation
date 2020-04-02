package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class OracleCustomerDal implements IcustomerDal{

    @Value("${database.connectionString}")

    String connectingString;

    public String getConnectingString() {

        return connectingString;
    }

    public void setConnectingString(String connectingString) {

        this.connectingString = connectingString;
    }

    public void add(){
        System.out.println("connecting String :" + this.connectingString);
        System.out.println("oracle veritabanina yüklendi");
    }
}
