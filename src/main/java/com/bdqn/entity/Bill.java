package com.bdqn.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class Bill {
    private int id;
    private String title;
    private Date billTimes;
    private int typeId;
    private Long price;
    private String explain;
   /* private BillTypeDao billType;

    @OneToMany(targetEntity = BillTypeDao.class)
    @JoinColumn(name = "type_id")
    public BillTypeDao getBillType() {
        return billType;
    }

    public void setBillType(BillTypeDao billType) {
        this.billType = billType;
    }*/

    @Basic
    @Column(name = "type_id")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Id
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="bills")
    @SequenceGenerator(name="payablemoney_seq", sequenceName="HIBERNATE_SEQUENCE",allocationSize=1)*/
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "BILL_TIMES")
    public Date getBillTimes() {
        return billTimes;
    }

    public void setBillTimes(Date billTimes) {
        this.billTimes = billTimes;
    }


    @Basic
    @Column(name = "PRICE")
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Basic
    @Column(name = "EXPLAIN")
    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", billTimes=" + billTimes +
                ", price=" + price +
                ", explain='" + explain + '\'' +
                '}';
    }
}
