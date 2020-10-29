package com.springboot.springbootribbon.controller;

import com.springboot.springbootribbon.sevice.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ComputeService computeService;
    @GetMapping(value = "/dept/all")
    public String selectDeptList(){
        return computeService.selectDeptList();
    }

    @GetMapping("/emp/all")
    public String selectAllEmp(){
        return computeService.selectAllEmp();
    }
}
