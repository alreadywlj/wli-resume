package com.wli.wliresumeservicescms.service;

import com.wli.wliresumeservicescms.model.pexp.PExpEntity;

public interface IPExpService {
    boolean delExp(String id);

    boolean addPExp(PExpEntity pExpEntity);

    boolean updPExp(String id, PExpEntity pExpEntity);
}
