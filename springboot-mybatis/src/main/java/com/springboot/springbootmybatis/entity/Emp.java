package com.springboot.springbootmybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("员工信息")
public class Emp {
    @ApiModelProperty("员工编号")
    private int empno;
    @ApiModelProperty("员工姓名")
    private String ename;
    @ApiModelProperty("职位")
    private String job;
    @ApiModelProperty("上级领导")
    private int mgr;
    @ApiModelProperty("入职日期")
    private String hiredate;
    @ApiModelProperty("薪资")
    private double sal;
    @ApiModelProperty("奖金")
    private double comm;
    @ApiModelProperty("部门编号")
    private Dept deptno;
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Dept getDeptno() {
        return deptno;
    }

    public void setDeptno(Dept deptno) {
        this.deptno = deptno;
    }

}
