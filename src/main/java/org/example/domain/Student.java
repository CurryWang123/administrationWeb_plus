package org.example.domain;

public class Student {
    private Integer sid;
    private String sname;
    private String ssex;
    private String dname;
    private String smajor;
    private String password;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", dname='" + dname + '\'' +
                ", smajor='" + smajor + '\'' +
                '}';
    }

    public Student() {
    }
public void start()
{
    System.out.println("对象执行了初始化方法");
}
    public Student(Integer sid, String sname, String ssex, String dname, String smajor, String password) {
        this.sid = sid;
        this.sname = sname;
        this.ssex = ssex;
        this.dname = dname;
        this.smajor = smajor;
        this.password = password;
    }

    public Student(String sname, String ssex, String dname, String smajor) {
        this.sname = sname;
        this.ssex = ssex;
        this.dname = dname;
        this.smajor = smajor;
    }

    public Student(String sname, String ssex, String dname, String smajor, String password) {
        this.sname = sname;
        this.ssex = ssex;
        this.dname = dname;
        this.smajor = smajor;
        this.password = password;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
