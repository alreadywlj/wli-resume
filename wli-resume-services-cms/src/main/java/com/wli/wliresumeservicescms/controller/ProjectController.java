package com.wli.wliresumeservicescms.controller;

import com.wli.core.rsponse.R;
import com.wli.model.cms.project.ProjectDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wli
 */
@RestController
@RequestMapping("/cms/project")
public class ProjectController {


    @GetMapping
    public R qryProjects() {
        return R.success();
    }

    @PostMapping
    public R addProject(@RequestBody ProjectDTO projectDTO) {
        return R.success();
    }

    @DeleteMapping("/{id}")
    public R delProject(@PathVariable("id") String id) {
        return R.success();
    }

    @PutMapping("/{id}")
    public R updProject(@PathVariable("id") String id, @RequestBody ProjectDTO projectDTO) {
        return R.success();
    }

}
