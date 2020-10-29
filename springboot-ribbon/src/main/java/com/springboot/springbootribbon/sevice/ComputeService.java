package com.springboot.springbootribbon.sevice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComputeService {
    @Autowired
    RestTemplate restTemplate;

    //Hystrix断路器
    @HystrixCommand(fallbackMethod = "serviceFallback")
    public String selectDeptList(){
        return restTemplate.getForEntity("http://springboot-mybatis/dept/all", String.class).getBody();  //url地址的格式：http：//程序名/接口连接
    }
    public String serviceFallback(){
        return "error";
    }
}
