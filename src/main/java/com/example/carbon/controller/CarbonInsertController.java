package com.example.carbon.controller;

import com.example.carbon.service.CarbonInsertService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/***
 * @author yansong chen
 * @time 2021-11-16 15:05
 * @description:
 */
@RestController
@RequestMapping(value = "/carbon/insert", produces = "application/json;charset=UTF-8")
public class CarbonInsertController {
    private static final Logger logger = LoggerFactory.getLogger(CarbonInsertController.class);

    //@Autowired
    //private  HttpServletResponse httpServletResponse;

    private CarbonInsertService carbonInsertService;

    @GetMapping("/fatory1")
    public void factoryInsert1()
    {

    }
}
