package com.springboot.springbootmybatis.controller;

import com.springboot.springbootmybatis.entity.Emp;
import com.springboot.springbootmybatis.service.IEmpInfoManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("员工信息")
@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private IEmpInfoManager iEmpInfoManager;

    @GetMapping(value = "/all")
    @ApiOperation("员工信息")
    public ResponseEntity<List<Emp>> allEmp(Emp emp){
        try{
            List<Emp> list=this.iEmpInfoManager.allEmp(emp);
            System.out.print(list);
            //成功200
            return ResponseEntity.ok(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        //异常500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
}
