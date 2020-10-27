package com.springboot.springbootmybatis.service;

import com.springboot.springbootmybatis.entity.Emp;

import java.util.List;

public interface IEmpInfoManager {
    //查询所有员工信息
    public List<Emp> allEmp(Emp emp);
}
