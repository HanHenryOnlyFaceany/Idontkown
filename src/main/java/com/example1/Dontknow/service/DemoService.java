package com.example1.Dontknow.service;


import com.example1.Dontknow.domain.Demo;
import com.example1.Dontknow.domain.DemoExample;
import com.example1.Dontknow.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
//    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(new DemoExample());
    }

}
