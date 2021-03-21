package com.wli.wliresumeservicescms.model.pexp;

import lombok.Data;
import lombok.ToString;

//项目经验实体类
@Data
@ToString
public class PExpDTO {

    //id PK
    private Integer id;

    //项目名称
    private String title;

    //项目时间
    private long pBegTime;

    //项目结束时间
    private long pEndTime;

    //创建时间
    private long creTime;

    //结束时间
    private long updTime;

    //创建人
    private String creUser;

    //更新人
    private String updUser;

    //项目描述
    private String desc;

    //项目职责
    private String duty;


}
