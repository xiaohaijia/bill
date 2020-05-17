package com.bdqn.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "BILL_TYPE", schema = "CHEN", catalog = "")
public class BillType {
    private int id;
    private String name;
   /* private Set<Bill> billList = new HashSet<>();

    @OneToMany(targetEntity = Bill.class)
    @JoinColumn(name = "id")
    public Set<Bill> getBillList() {
        return billList;
    }

    public void setBillList(Set<Bill> billList) {
        this.billList = billList;
    }*/

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BillTypeDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
