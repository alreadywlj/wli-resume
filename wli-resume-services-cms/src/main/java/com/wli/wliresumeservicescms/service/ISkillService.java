package com.wli.wliresumeservicescms.service;

import com.wli.wliresumeservicescms.model.pexp.PExpEntity;
import com.wli.wliresumeservicescms.model.skill.SkillEntity;

import java.util.ArrayList;

public interface ISkillService {
    boolean add(PExpEntity pExpEntity);


    boolean upd(Integer id, PExpEntity pExpEntity);

    boolean del(Integer id);

    ArrayList<SkillEntity> qry();
}
