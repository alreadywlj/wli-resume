package com.wli.wliresumeservicescms.service.Impl;

import com.wli.wliresumeservicescms.mapper.BannerMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class BannerServiceImpl {

    @Resource
    BannerMapper bannerDao;

}
