package com.hefeifei.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class TPSServer implements Serializable {
    private static final long serialVersionUID = 6025206356157577324L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date outDate;
    private String outId;
    private int salary;
    private String jobNum;
    private String name;
    private String expName;
    private String phone;
    private String imgUrl;
    private String remark;
    @ManyToOne
    @JoinColumn(name="tid")
    private ProType proType;

    @Override
    public String toString() {
        return "TPSServer{" +
                "id=" + id +
                ", outDate=" + outDate +
                ", outId='" + outId + '\'' +
                ", salary=" + salary +
                ", jobNum='" + jobNum + '\'' +
                ", name='" + name + '\'' +
                ", expName='" + expName + '\'' +
                ", phone='" + phone + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", remark='" + remark + '\'' +
                ", proType=" + proType +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ProType getProType() {
        return proType;
    }

    public void setProType(ProType proType) {
        this.proType = proType;
    }
}
