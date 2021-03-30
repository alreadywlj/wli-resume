package com.wli.wliresumeservicescms.service.Impl;

import com.wli.wliresumeservicescms.mapper.ISkillMapper;
import com.wli.wliresumeservicescms.model.pexp.PExpEntity;
import com.wli.wliresumeservicescms.model.skill.SkillEntity;
import com.wli.wliresumeservicescms.service.ISkillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class SkillServiceImpl implements ISkillService {

    @Resource
    ISkillMapper skillMapper;

    @Override
    public boolean add(PExpEntity pExpEntity) {
        return skillMapper.addSkill(pExpEntity);
    }

    @Override
    public boolean upd(Integer id, PExpEntity pExpEntity) {
        pExpEntity.setId(id);
        return skillMapper.updSkill(pExpEntity);
    }

    @Override
    public boolean del(Integer id) {
        return skillMapper.delSkill(id);
    }

    @Override
    public ArrayList<SkillEntity> qry() {
        return skillMapper.getSkills();
    }
}
