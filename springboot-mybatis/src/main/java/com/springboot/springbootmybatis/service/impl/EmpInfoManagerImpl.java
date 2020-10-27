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

    public IEmpDao getiEmpDao() {
        return iEmpDao;
    }

    public void setiEmpDao(IEmpDao iEmpDao) {
        this.iEmpDao = iEmpDao;
    }

    @Override
    public List<Emp> allEmp(Emp emp) {
        return this.getiEmpDao().allEmp(emp);
    }
}
