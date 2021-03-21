package com.wli.wliresumeservicescms.controller;


import com.wli.core.rsponse.R;
import com.wli.model.cms.content.ContentDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author wli
 */
@RestController
@RequestMapping("/cms/content")
public class ContentController {

    @GetMapping
    public R qryContents() {
        return R.success();
    }

    @PostMapping
    public R addContent(@RequestBody ContentDTO contentDTO) {
        return R.success();
    }

    @DeleteMapping("/{id}")
    public R delContent(@PathVariable("id") String id) {
        return R.success();
    }

    @PutMapping("/{id}")
    public R updContent(@PathVariable("id") String id, @RequestBody ContentDTO contentDTO) {
        return R.success();
    }


}