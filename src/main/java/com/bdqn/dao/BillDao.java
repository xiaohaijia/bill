package com.bdqn.dao;

import com.bdqn.entity.Bill;

import java.io.Serializable;
import java.util.List;

public interface BillDao {
    public List<Bill> getAll(String sql);
    public List<Bill> getByBill(String hql);
    public Serializable addBill(Bill bill);
}
