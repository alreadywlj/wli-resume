package com.wli.model.cms.banner;

import java.io.Serializable;


/**
 * 轮播实体类
 */
public class BannerEntity implements Serializable {

    private static final long seriaVersionUID = 1L;

    private Integer id;  //Id PK

    private long creTime; //创建时间

    private long updTime; //更新时间

    private String title; //标题

    private String desc; //描述

    private String url; //存储路径

    private String updUser; //更新人

    private String creUser; //创建人

    private String showTim; //轮播播放时间

    private Integer active;//是否启用

    public BannerEntity(Integer id, long creTime, long updTime, String title, String desc, String url, String updUser, String creUser, String showTim, Integer active) {
        this.id = id;
        this.creTime = creTime;
        this.updTime = updTime;
        this.title = title;
        this.desc = desc;
        this.url = url;
        this.updUser = updUser;
        this.creUser = creUser;
        this.showTim = showTim;
        this.active = active;
    }

    public BannerEntity() {
    }

    public static long getSeriaVersionUID() {
        return seriaVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getCreTime() {
        return creTime;
    }

    public void setCreTime(long creTime) {
        this.creTime = creTime;
    }

    public long getUpdTime() {
        return updTime;
    }

    public void setUpdTime(long updTime) {
        this.updTime = updTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUpdUser() {
        return updUser;
    }

    public void setUpdUser(String updUser) {
        this.updUser = updUser;
    }

    public String getCreUser() {
        return creUser;
    }

    public void setCreUser(String creUser) {
        this.creUser = creUser;
    }

    public String getShowTim() {
        return showTim;
    }

    public void setShowTim(String showTim) {
        this.showTim = showTim;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "BannerEntity{" +
                "id=" + id +
                ", creTime=" + creTime +
                ", updTime=" + updTime +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", url='" + url + '\'' +
                ", updUser='" + updUser + '\'' +
                ", creUser='" + creUser + '\'' +
                ", showTim='" + showTim + '\'' +
                ", active=" + active +
                '}';
    }
}
