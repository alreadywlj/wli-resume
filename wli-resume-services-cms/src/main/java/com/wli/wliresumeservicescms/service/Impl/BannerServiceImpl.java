package com.wli.wliresumeservicescms.service.Impl;

import com.wli.wliresumeservicescms.mapper.IBannerMapper;
import com.wli.wliresumeservicescms.service.IBannerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class BannerServiceImpl  implements IBannerService {

    @Resource
    IBannerMapper bannerMapper;

}
