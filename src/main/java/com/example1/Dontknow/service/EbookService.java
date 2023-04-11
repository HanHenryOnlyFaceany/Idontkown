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
//模糊查询如何去写
    public List<Ebook> list(String name){

        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+name+"%");

        return ebookMapper.selectByExample(ebookExample);
    }

}
