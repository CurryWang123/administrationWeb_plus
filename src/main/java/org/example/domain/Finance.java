package org.example.domain;

public class Finance {
    private Integer fid;
    private String affair;
    private String money;
    private String dname;
    private String date;
    private Integer status;

    public Finance() {
    }

    public Finance(String affair, String money, String dname, String date) {
        this.affair = affair;
        this.money = money;
        this.dname = dname;
        this.date = date;
    }

    public Finance(String affair, String money, String dname, String date, Integer status) {
        this.affair = affair;
        this.money = money;
        this.dname = dname;
        this.date = date;
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getAffair() {
        return affair;
    }

    public void setAffair(String affair) {
        this.affair = affair;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
