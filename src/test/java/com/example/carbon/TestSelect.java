package com.example.carbon;

import entity.FactoryMonitor;
import entity.PlaceMonitor;
import mapper.FactoryMonitorMapper;
import mapper.PlaceMonitorMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/***
 * @author yansong chen
 * @time 2021-11-16 14:58
 * @description:
 */
@SpringBootTest
public class TestSelect {

    @Autowired
    private FactoryMonitorMapper factoryMonitorMapper;

    @Autowired
    private PlaceMonitorMapper placeMonitorMapper;

    @Test
    public void testSelect()
    {
        List<FactoryMonitor> list = new ArrayList<>();
        list = factoryMonitorMapper.selectList(null);
        for(FactoryMonitor factoryMonitor:list)
        {
            System.out.println(factoryMonitor);
        }
    }

    @Test
    public void testSelect2()
    {
        List<PlaceMonitor> list = new ArrayList<>();
        list = placeMonitorMapper.selectList(null);
        for(PlaceMonitor factoryMonitor:list)
        {
            System.out.println(factoryMonitor);
        }
    }
}
