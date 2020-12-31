package com.springboot.springbootmybatis.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("部门信息")
@TableName(value = "dept")
public class Dept implements Serializable {
    @ApiModelProperty("部门编号")
    private int deptno;
    @ApiModelProperty("部门名称")
    private String dname;
    @ApiModelProperty("部门所在地")
    private String loc;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }


}
