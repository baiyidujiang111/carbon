package com.example.carbon.service.impl;

import com.example.carbon.service.CarbonInsertService;
import entity.FactoryMonitor;
import mapper.FactoryMonitorMapper;
import org.springframework.beans.factory.annotation.Autowired;

/***
 * @author yansong chen
 * @time 2021-11-16 15:05
 * @description:
 */

public class CarbonInsertServiceImpl implements CarbonInsertService {

    @Autowired
    private FactoryMonitorMapper factoryMonitorMapper;

    @Override
    public void factoryInsert1() {
        FactoryMonitor factoryMonitor = new FactoryMonitor();
        /*
        模拟数据算法
         */
        //factoryMonitorMapper.insert();
    }
}
