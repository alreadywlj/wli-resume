package com.wli.wliresumeservicescms.mapper;

import com.wli.wliresumeservicescms.model.pexp.PExpEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IPExpMapper {
    Integer delExp(String id);

    Integer addExp(PExpEntity pExpEntity);

    Integer updPExp(@Param("id") String id, @Param("pExpEntity") PExpEntity pExpEntity);
}
