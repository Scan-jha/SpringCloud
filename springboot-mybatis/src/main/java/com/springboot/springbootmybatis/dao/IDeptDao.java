package com.springboot.springbootmybatis.dao;

import com.springboot.springbootmybatis.entity.Dept;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
@Transactional
public interface IDeptDao {

    /**
     * 查询所有信息
     * @param dept
     * @return
     */
    @Select("select * from dept")
    List<Dept> selectDeptList(Dept dept);

    /**
     * 根据部门编号查询部门信息
     * @param dept
     * @return
     */
    @Select("select * from dept where deptno=#{deptno}")
    Dept selectDeptById(Dept deptno);

    /**
     * 添加
     * @param dept
     */
    @Insert("insert into dept(deptno,dname,loc) values(#{deptno},#{dname},#{loc})")
    void insertDept(Dept dept);

    /**
     * 更新
     * @param dept
     */
    @Update("update dept set dname=#{dname},loc=#{loc} where deptno=#{deptno}")
    void updateDept(Dept dept);

    @Delete("delete from dept where deptno=#{deptno}")
    void deleteDeptById(int deptno);

}
