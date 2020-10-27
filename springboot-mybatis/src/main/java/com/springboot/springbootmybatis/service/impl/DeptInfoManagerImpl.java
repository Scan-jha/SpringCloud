package com.springboot.springbootmybatis.service.impl;

import com.springboot.springbootmybatis.dao.IDeptDao;
import com.springboot.springbootmybatis.entity.Dept;
import com.springboot.springbootmybatis.service.IDeptInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptInfoManagerImpl  implements IDeptInfoManager {
    @Autowired
    private IDeptDao iDeptInfoDao;

    public IDeptDao getiDeptInfoDao() {
        return iDeptInfoDao;
    }

    public void setiDeptInfoDao(IDeptDao iDeptInfoDao) {
        this.iDeptInfoDao = iDeptInfoDao;
    }

    @Override
    public List<Dept> selectDeptList(Dept dept) {
        return this.getiDeptInfoDao().selectDeptList(dept);
    }


    public Dept selectDeptById(Dept dept) {
        System.out.print(dept.getDeptno());
        return this.getiDeptInfoDao().selectDeptById(dept);
    }


    public void insertDept(Dept dept) {
        this.getiDeptInfoDao().insertDept(dept);
    }


    public void updateDept(Dept dept) {
        this.getiDeptInfoDao().updateDept(dept);
    }


    public void deleteDept(int deptno) {
        this.getiDeptInfoDao().deleteDeptById(deptno);
    }

    @Override
    public void set() {

    }
}
