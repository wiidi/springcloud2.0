package com.wudi.springcloudmember.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: 吴迪 625553347@qq.com 18040509188
 * @CreateDate: 2018/11/21 21:49
 * @UpdateUser:
 * @UpdateDate: 2018/11/21 21:49
 * @UpdateRemark:
 * @Version: 1.0
 * Copyright (c) 2018,武汉中地云申科技有限公司
 * All rights reserved.
 **/
@RestController

public class MemberApiController {
    @RequestMapping("/getMember")
    public String getMember(){
        return "this is a member";
    }

}
