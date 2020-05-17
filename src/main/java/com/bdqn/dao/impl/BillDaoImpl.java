package com.bdqn.dao.impl;

import com.bdqn.dao.BillDao;
import com.bdqn.entity.Bill;
import com.bdqn.util.BaseDao;
import com.sun.xml.internal.messaging.saaj.util.Base64;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@Repository
public class BillDaoImpl implements BillDao {
    @Resource
    private BaseDao baseDao;
    @Override
    public List<Bill> getAll(String sql) {
        return baseDao.findAll(sql);
    }

    @Override
    public List<Bill> getByBill(String hql) {
        return baseDao.findAll(hql);
    }

    @Override
    public Serializable addBill(Bill bill) {
        return baseDao.insert(bill);
    }
}
