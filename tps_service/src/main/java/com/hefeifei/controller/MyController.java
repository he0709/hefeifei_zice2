package com.hefeifei.controller;

import com.hefeifei.service.MyService;
import com.hefeifei.vo.TPSVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController {
    @Autowired
    private MyService service;
    @RequestMapping("list")
    public Page getList(TPSVo tpsVo){
        return service.getList(tpsVo);
    }
}
