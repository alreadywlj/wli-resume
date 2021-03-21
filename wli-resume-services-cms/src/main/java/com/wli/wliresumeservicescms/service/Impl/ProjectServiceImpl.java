package com.wli.wliresumeservicescms.service.Impl;

import com.wli.wliresumeservicescms.mapper.IContentMapper;
import com.wli.wliresumeservicescms.mapper.IProjectMapper;
import com.wli.wliresumeservicescms.service.IProjectService;
import org.apache.ibatis.annotations.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Service
@Transactional
public class ProjectServiceImpl implements IProjectService {

    @Resource
    IProjectMapper projectMapper;




}
