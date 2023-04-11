package com.example1.Dontknow.service;


import com.example1.Dontknow.domain.Ebook;
import com.example1.Dontknow.domain.EbookExample;
import com.example1.Dontknow.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
//    @Autowired
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(new EbookExample());
    }

}
