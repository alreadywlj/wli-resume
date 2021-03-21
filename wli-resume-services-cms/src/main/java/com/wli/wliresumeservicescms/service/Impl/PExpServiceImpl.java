package com.wli.wliresumeservicescms.service.Impl;


import com.wli.wliresumeservicescms.mapper.IPExpMapper;
import com.wli.wliresumeservicescms.model.pexp.PExpEntity;
import com.wli.wliresumeservicescms.service.IPExpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Service
@Transactional
public class PExpServiceImpl implements IPExpService {

    @Resource
    IPExpMapper expMapper;

    @Override
    public boolean delExp(String id) {
        return  expMapper.delExp(id)>0;
    }

    @Override
    public boolean addPExp(PExpEntity pExpEntity) {
        return expMapper.addExp(pExpEntity)>0;
    }

    @Override
    public boolean updPExp(String id, PExpEntity pExpEntity) {
        return expMapper.updPExp( id,  pExpEntity)>0;
    }



}
