package com.springboot.springbootmybatis.dao;

import com.springboot.springbootmybatis.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IDeptDao {

    /**
     * 查询所有信息
     * @param dept
     * @return
     */
    public List<Dept> selectDeptList(Dept dept);

    /**
     * 根据部门编号查询部门信息
     * @param dept
     * @return
     */
    public Dept selectDeptById(Dept deptno);

    /**
     * 添加
     * @param dept
     */
    public void insertDept(Dept dept);

    /**
     * 更新
     * @param dept
     */
    public void updateDept(Dept dept);
   public void deleteDeptById(int deptno);

}
