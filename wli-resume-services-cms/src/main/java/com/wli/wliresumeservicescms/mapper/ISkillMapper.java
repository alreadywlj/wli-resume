package com.wli.wliresumeservicescms.mapper;

import com.wli.wliresumeservicescms.model.pexp.PExpEntity;
import com.wli.wliresumeservicescms.model.skill.SkillEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ISkillMapper {


    boolean addSkill(PExpEntity pExpEntity);

    boolean updSkill(PExpEntity pExpEntity);

    boolean delSkill(Integer id);

    ArrayList<SkillEntity> getSkills();


}
