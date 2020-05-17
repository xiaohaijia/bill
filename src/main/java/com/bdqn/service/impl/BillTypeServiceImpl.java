package com.bdqn.service.impl;

import com.bdqn.dao.BillTypeDao;
import com.bdqn.entity.BillType;
import com.bdqn.service.BillTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillTypeServiceImpl implements BillTypeService {
    @Autowired
    private BillTypeDao billType;
    @Override
    public List<BillType> getAllbillTyoe() {
        return billType.getAllbillTyoe("from BillType");
    }
}
