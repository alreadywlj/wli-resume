package com.wli.wliresumeservicescms.controller;

import com.wli.core.rsponse.R;
import com.wli.wliresumeservicescms.model.pexp.PExpEntity;
import com.wli.wliresumeservicescms.model.skill.SkillEntity;
import com.wli.wliresumeservicescms.service.IPExpService;
import com.wli.wliresumeservicescms.service.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cms/skill")
@CrossOrigin
public class SkillController {

    @Autowired
    ISkillService skillService;

    @GetMapping
    public R qryPExp() {
        ArrayList<SkillEntity> skills = skillService.qry();
        return R.success(skills);
    }


    @PostMapping
    public R addPExp(@RequestBody PExpEntity pExpEntity) {
        boolean flag = skillService.add(pExpEntity);
        return R.success();
    }

    @PutMapping("/{id}")
    public R updPExp(@PathVariable("id") Integer id, @RequestBody PExpEntity pExpEntity) {
        boolean flag = skillService.upd(id, pExpEntity);
        return R.success();
    }

    @DeleteMapping("/{id}")
    public R delPExp(@PathVariable("id") Integer id) {
        boolean flag = skillService.del(id);
        return R.success();
    }
}
