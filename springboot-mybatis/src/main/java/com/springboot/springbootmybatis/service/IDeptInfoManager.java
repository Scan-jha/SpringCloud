package com.springboot.springbootmybatis.service;

import com.springboot.springbootmybatis.entity.Dept;

import java.util.List;

public interface IDeptInfoManager {
    /**
     * 查询所有
     * @param dept
     * @return
     */
    List<Dept> selectDeptList(Dept dept);

    /**
     * 根据id查询部门信息
     * @param dept
     * @return
     */
     Dept selectDeptById(Dept dept);

    //添加
   void insertDept(Dept dept);
    //更新
    void updateDept(Dept dept);
    //删除
     void deleteDept(int deptno);

     void set();
}
