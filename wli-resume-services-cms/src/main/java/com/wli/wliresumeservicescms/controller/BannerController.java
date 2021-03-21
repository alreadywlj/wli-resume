package com.wli.wliresumeservicescms.controller;

import com.wli.core.rsponse.R;
import com.wli.model.cms.banner.BannerDTO;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @author wli
 */
@RestController
@RequestMapping("/cms/banner")
@CrossOrigin
public class BannerController {


    @PostMapping
    public R addBanner(@RequestBody BannerDTO bannerDTO) {
        return R.success();
    }

    @PutMapping("/{id}")
    public R updateBanner(@PathVariable("id") String id) {
        return R.success();
    }

    @DeleteMapping("/{id}")
    public R delBanner(@PathVariable("id") String id, @RequestBody BannerDTO bannerDTO) {
        return R.success();
    }

    @GetMapping
    public R qryBanners(@RequestParam(value = "creTime") long creTime,
                        @RequestParam(value = "updTime") long updTime,
                        @RequestParam(value = "id") String id,
                        @RequestParam(value = "offset", defaultValue = "0") Integer offset,
                        @RequestParam(value = "limit", defaultValue = "20") Integer limit) {
        return R.success();
    }


}
