package com.wli.wliresumeservicescms.service.Impl;

import com.wli.wliresumeservicescms.mapper.IContentMapper;
import com.wli.wliresumeservicescms.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class ContentServiceImpl implements IContentService {

    @Resource
    IContentMapper contentMapper;




}
