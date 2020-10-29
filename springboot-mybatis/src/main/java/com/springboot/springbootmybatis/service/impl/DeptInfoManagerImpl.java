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

    public List<Dept> selectDeptList(Dept dept) {
        return this.iDeptInfoDao.selectDeptList(dept);
    }

    public Dept selectDeptById(Dept dept) { return this.iDeptInfoDao.selectDeptById(dept); }

    public void insertDept(Dept dept) {
        this.iDeptInfoDao.insertDept(dept);
    }

    public void updateDept(Dept dept) {
        this.iDeptInfoDao.updateDept(dept);
    }

    public void deleteDept(int deptno) {
        this.iDeptInfoDao.deleteDeptById(deptno);
    }


}
