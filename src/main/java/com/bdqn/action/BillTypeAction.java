package com.bdqn.action;

import com.bdqn.dao.BillTypeDao;
import com.bdqn.entity.Bill;
import com.bdqn.entity.BillType;
import com.bdqn.service.BillTypeService;
import com.bdqn.service.BillsService;

import javax.annotation.Resource;
import java.util.List;

public class BillTypeAction {
    @Resource
    private BillTypeService billTypeService;

    private List<BillType> billTypeList;

    public List<BillType> getBillTypeList() {
        return billTypeList;
    }

    public void setBillTypeList(List<BillType> billTypeList) {
        this.billTypeList = billTypeList;
    }

    public String getAll(){
        billTypeList= billTypeService.getAllbillTyoe();
        return "success";
    }
}
