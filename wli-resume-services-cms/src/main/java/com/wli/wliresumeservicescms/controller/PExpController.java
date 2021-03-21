package com.wli.wliresumeservicescms.controller;

import com.wli.core.rsponse.R;
import com.wli.wliresumeservicescms.model.pexp.PExpEntity;
import com.wli.wliresumeservicescms.service.IPExpService;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Controller
@RequestMapping("/cms/exp")
@Slf4j
public class PExpController {

    @Autowired
    IPExpService pExpService;

    @GetMapping
    public R qryPExp(@RequestParam(value = "id", required = false) Integer id,
                     @RequestParam(value = "limit", defaultValue = "0", required = false) Integer limit,
                     @RequestParam(value = "offset", defaultValue = "20", required = false) Integer offset,
                     @RequestParam(value = "desc", required = false) String desc,
                     @RequestParam(value = "conetnt", required = false) String content,
                     @RequestParam(value = "pBT", required = false) String pBT,
                     @RequestParam(value = "pET", required = false) String pEt) {



        return R.success();
    }


    @PostMapping
    public R addPExp(@RequestBody PExpEntity pExpEntity) {
        boolean flag = pExpService.addPExp(pExpEntity);
        return R.success();
    }

    @PutMapping("/{id}")
    public R updPExp(@PathVariable("id") String id, @RequestBody PExpEntity pExpEntity) {
        boolean flag = pExpService.updPExp(id, pExpEntity);
        return R.success();
    }

    @DeleteMapping("/{id}")
    public R delPExp(@PathVariable("id") String id) {
        boolean flag = pExpService.delExp(id);
        return R.success();
    }
}
