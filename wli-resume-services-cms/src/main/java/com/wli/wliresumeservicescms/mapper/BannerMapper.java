package com.wli.wliresumeservicescms.mapper;

import com.wli.model.cms.banner.BannerDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BannerMapper {

    Integer addBanner(BannerDTO bannerDTO);

}
