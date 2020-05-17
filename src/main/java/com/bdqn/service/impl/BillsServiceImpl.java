package com.bdqn.service.impl;

import com.bdqn.dao.BillDao;
import com.bdqn.entity.Bill;
import com.bdqn.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class BillsServiceImpl implements BillsService {

    @Autowired
    private BillDao billDao;

    @Override
    public List<Bill> getAll() {

        return billDao.getAll("from Bill ");
    }

    @Override
    public List<Bill> getByBill(String type,String oneBillTimes,String toBillTimes) {
        StringBuilder sb=new StringBuilder("from Bill where 1=1");
        if (Integer.parseInt(type)!=0){
            sb.append(" and typeId ="+type);
        }
        if (oneBillTimes!=null && !oneBillTimes.equals("")){
            sb.append(" and billTimes > to_date('"+oneBillTimes+"','yyyy-mm-dd ')");
        }
        if (toBillTimes!=null && !toBillTimes.equals("")){
            sb.append(" and billTimes > to_date('"+toBillTimes+"','yyyy-mm-dd ')");
        }
        System.out.println(sb);
        return billDao.getAll(sb.toString());
    }

    @Override
    public Serializable addBill(Bill bill) {
        return billDao.addBill(bill);
    }
}
