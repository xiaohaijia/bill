package com.bdqn.service;

import com.bdqn.entity.Bill;

import java.io.Serializable;
import java.util.List;

public interface BillsService {

    public List<Bill> getAll();
    public List<Bill> getByBill(String type,String oneBillTimes,String toBillTimesl);
    public Serializable addBill(Bill bill);
}
