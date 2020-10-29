package com.springboot.springbootmybatis.service.impl;

import com.springboot.springbootmybatis.dao.IEmpDao;
import com.springboot.springbootmybatis.entity.Emp;
import com.springboot.springbootmybatis.service.IEmpInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpInfoManagerImpl implements IEmpInfoManager {
    @Autowired
    private IEmpDao iEmpDao;

    public List<Emp> allEmp(Emp emp) {
        return this.iEmpDao.allEmp(emp);
    }
}
