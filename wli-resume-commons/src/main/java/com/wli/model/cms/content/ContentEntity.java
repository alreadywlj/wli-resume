package com.wli.model.cms.content;

import lombok.*;

//文章实体类
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ContentEntity {

    private Integer id;  //文章id

    private String title; //文章标题

    private String detail;//文章内容

    private String tag;//文章标签

    private String uri;//文章外链

    private String desc;//文章描述

    private long creTime; //创建时间

    private long updTime; //更新时间

    private String creUser;  //创建人

    private String updUser;  //更新人

    private Integer active; //是否生效

}
