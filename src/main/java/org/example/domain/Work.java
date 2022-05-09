package org.example.domain;

import javax.xml.soap.SAAJResult;

public class Work {
    private Integer wid;
    private String wname;
    private String depID;
    private String wperson;
    private String start;
    private String end;
    private Integer status;

    public Work() {
    }

    public Work(String wname, String depID, String wperson, String start, String end, Integer status) {
        this.wname = wname;
        this.depID = depID;
        this.wperson = wperson;
        this.start = start;
        this.end = end;
        this.status = status;
    }

    public Work(String wname, String depID, String wperson, String start, String end) {
        this.wname = wname;
        this.depID = depID;
        this.wperson = wperson;
        this.start = start;
        this.end = end;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getWperson() {
        return wperson;
    }

    public void setWperson(String wperson) {
        this.wperson = wperson;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
