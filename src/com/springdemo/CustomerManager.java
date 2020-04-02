package com.springdemo;

public class CustomerManager implements ICustomerService{

    private IcustomerDal icustomerDal;

    public CustomerManager(IcustomerDal icustomerDal) {

        this.icustomerDal = icustomerDal;

    }
    public void setIcustomerDal(IcustomerDal icustomerDal) {
        this.icustomerDal = icustomerDal;
    }

    public void add(){

           icustomerDal.add();
    }
}
