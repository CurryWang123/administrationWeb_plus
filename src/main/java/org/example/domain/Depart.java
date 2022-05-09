package org.example.domain;

public class Depart {
    private Integer depid;
    private String dname;
    private String depminname;
    private String depsminname;
    private int depsum;

    @Override
    public String toString() {
        return "Depart{" +
                "depid=" + depid +
                ", dname='" + dname + '\'' +
                ", depminname='" + depminname + '\'' +
                ", depsminname='" + depsminname + '\'' +
                ", depsum=" + depsum +
                '}';
    }

    public Depart(String dname, String depminname, String depsminname, int depsum) {
        this.dname = dname;
        this.depminname = depminname;
        this.depsminname = depsminname;
        this.depsum = depsum;
    }

    public Depart() {
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDepminname() {
        return depminname;
    }

    public void setDepminname(String depminname) {
        this.depminname = depminname;
    }

    public String getDepsminname() {
        return depsminname;
    }

    public void setDepsminname(String depsminname) {
        this.depsminname = depsminname;
    }

    public int getDepsum() {
        return depsum;
    }

    public void setDepsum(int depsum) {
        this.depsum = depsum;
    }
}
