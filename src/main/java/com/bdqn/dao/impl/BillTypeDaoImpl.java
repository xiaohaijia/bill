package com.bdqn.dao.impl;

import com.bdqn.dao.BillTypeDao;
import com.bdqn.entity.BillType;
import com.bdqn.util.BaseDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BillTypeDaoImpl implements BillTypeDao {
    @Resource
    private BaseDao baseDao;
    @Override
    public List<BillType> getAllbillTyoe(String sql) {
        return baseDao.findAll(sql);
    }
}
