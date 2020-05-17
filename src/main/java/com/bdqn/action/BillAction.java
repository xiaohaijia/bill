package com.bdqn.action;

import com.bdqn.dao.BillTypeDao;
import com.bdqn.entity.Bill;
import com.bdqn.entity.BillType;
import com.bdqn.service.BillTypeService;
import com.bdqn.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class BillAction {

    @Resource
    private BillsService billsService;
    @Resource
    private BillTypeService billTypeService;

    private Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    private List<Bill> billList;

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    private List<BillType> billTypeList;

    public List<BillType> getBillTypeList() {
        return billTypeList;
    }

    public void setBillTypeList(List<BillType> billTypeList) {
        this.billTypeList = billTypeList;
    }

    private String type;
    private String oneBillTimes;
    private String toBillTimesl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOneBillTimes() {
        return oneBillTimes;
    }

    public void setOneBillTimes(String oneBillTimes) {
        this.oneBillTimes = oneBillTimes;
    }

    public String getToBillTimesl() {
        return toBillTimesl;
    }

    public void setToBillTimesl(String toBillTimesl) {
        this.toBillTimesl = toBillTimesl;
    }

    public String getAll(){
        billList = billsService.getAll();
        billTypeList = billTypeService.getAllbillTyoe();
        return "success";
    }
    public String BillSeach(){
        billList = billsService.getByBill(type,oneBillTimes,toBillTimesl);
        billTypeList = billTypeService.getAllbillTyoe();
        return "success";
    }

    public String add(){
        billTypeList = billTypeService.getAllbillTyoe();
        return "success";
    }
    public String AddBill(){
        billsService.addBill(bill);
        System.out.println(bill);
        billTypeList = billTypeService.getAllbillTyoe();
        return "success";
    }


}
