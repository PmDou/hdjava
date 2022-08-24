package vip.epss.domain;

import java.util.Date;
import java.util.List;

public class Employee {
    private Integer eid;

    private String ename;

    private String epass;

    private Integer edid;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    private Date euptime;

    //1对1 的  持有对象的表现方式
    private Info info;

    //多对多 的  持有对象的表现方式
    private List<Project> projects;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEpass() {
        return epass;
    }

    public void setEpass(String epass) {
        this.epass = epass;
    }

    public Integer getEdid() {
        return edid;
    }

    public void setEdid(Integer edid) {
        this.edid = edid;
    }

    public Date getEuptime() {
        return euptime;
    }

    public void setEuptime(Date euptime) {
        this.euptime = euptime;
    }
}