package com.wudi.springcloudorder.feign.controller;

import com.wudi.springcloudorder.feign.MemberApiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 吴迪 625553347@qq.com 18040509188
 * @CreateDate: 2018/11/28 16:38
 * @UpdateUser:
 * @UpdateDate: 2018/11/28 16:38
 * @UpdateRemark:
 * @Version: 1.0
 * Copyright (c) 2018,武汉中地云申科技有限公司
 * All rights reserved.
 **/
@RestController
public class FeignController {
    @Autowired
    private MemberApiFeign memberApiFeign;

    @RequestMapping("/feignMember")
    public String feignMember() {
        return memberApiFeign.getMember();
    }

}
