package com.wli.wliresumeservicescms.model.banner;

import lombok.*;

import java.io.Serializable;


/**
 * 轮播实体类
 */
@Data
@ToString
public class BannerEntity implements Serializable {

    private static final long seriaVersionUID = 1L;


    private Integer id;  //Id PK

    private long creTime; //创建时间

    private long updTime; //更新时间

    private String title; //标题

    private String desc; //描述

    private String photoUrl; //图片存储路径

    private String uri;  //跳转路径

    private String updUser; //更新人

    private String creUser; //创建人

    private String showTim; //轮播播放时间

    private Integer active;//是否启用


}
