package org.example.domain;

public class Competition {
    private Integer cid;
    private String sname;
    private String type;
    private String date;

    public Competition() {
    }

    public Competition(String sname, String type, String date) {
        this.sname = sname;
        this.type = type;
        this.date = date;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
