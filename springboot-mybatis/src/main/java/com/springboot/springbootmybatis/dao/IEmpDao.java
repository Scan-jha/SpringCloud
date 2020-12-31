package com.springboot.springbootmybatis.dao;

import com.springboot.springbootmybatis.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IEmpDao {
    //查询所有员工信息
   @Select("select * from dept,emp where dept.deptno=emp.deptno")
   public List<Emp> allEmp(Emp emp);
}
