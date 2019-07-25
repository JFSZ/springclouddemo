package com.example.serviceribbon.web;

import com.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloControler
 * @Author chenxue
 * @Description
 * @Date 2019/7/22 11:20
 **/
@RestController
public class HelloControler {
    @Autowired
    private HelloService service;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return service.hiService(name);
    }
}
