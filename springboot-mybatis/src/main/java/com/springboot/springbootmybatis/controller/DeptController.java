package com.springboot.springbootmybatis.controller;

import com.springboot.springbootmybatis.entity.Dept;
import com.springboot.springbootmybatis.service.IDeptInfoManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("部门信息")
@RequestMapping("/dept")
@CrossOrigin(origins = "http://10.1.91.114:8098", maxAge =3600)
public class DeptController {
    @Autowired
    private IDeptInfoManager iDeptInfoManager;
    /**
     * 查询所有
     * @param dept
     * @return
     */
    @ApiOperation("查询所有")
    @GetMapping(value = "/all")
    public ResponseEntity<List<Dept>> selectDeptList(Dept dept){
        try{
            List<Dept> list=this.iDeptInfoManager.selectDeptList(dept);
            return ResponseEntity.ok(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    @ApiOperation("根据deptno查询部门信息")
    @GetMapping(value = "/selectId/{deptno}")
    @ResponseBody
    public ResponseEntity<Dept> selectDeptById(@PathVariable("deptno") int deptno){
          try{
              Dept d=new Dept();
              d.setDeptno(deptno);
              return ResponseEntity.ok(this.iDeptInfoManager.selectDeptById(d));
          }catch (Exception e){
              e.printStackTrace();
          }
          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    @ApiOperation("添加")
    @PostMapping(value = "/insert")
    public ResponseEntity<Void> inserDept(Dept dept){
        try{
            this.iDeptInfoManager.insertDept(dept);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @ApiOperation("更新")
    @PutMapping(value = "/update")
    public ResponseEntity<Void> updateDept(Dept dept){
        try{
            this.iDeptInfoManager.updateDept(dept);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @ApiOperation("删除")
    @DeleteMapping(value = "/delete/{deptno}")
    public ResponseEntity<Void> deleteDept(@PathVariable("deptno") int deptno){
        try{
           this.iDeptInfoManager.deleteDept(deptno);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
