package com.example1.Dontknow.service;


import com.example1.Dontknow.domain.Test;
import com.example1.Dontknow.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
//    @Autowired
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }

}
