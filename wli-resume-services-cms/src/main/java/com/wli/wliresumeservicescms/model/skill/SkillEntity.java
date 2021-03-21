package com.wli.wliresumeservicescms.model.skill;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SkillEntity {

    //主键id
    private Integer id;

    //排序
    private Integer order;

    //技能内容
    private String content;

    //创建时间
    private long creTime;

    //更新时间
    private long updTime;

    //更新人用户
    private String updUser;

    //创建人
    private String creUser;


    
}
