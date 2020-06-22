package com.dgut.dgrecruitingwebsite.manager.service.impl;

import com.dgut.dgrecruitingwebsite.manager.dao.TestDao;
import com.dgut.dgrecruitingwebsite.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestDao testDao;

    public void insert() {
        Map map = new HashMap();
        map.put("name","linnie");
        testDao.insert(map);
    }
}