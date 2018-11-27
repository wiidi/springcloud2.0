package com.wudi.springserverzookeeper.api.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/ZKgetMember")
    public String getMember(){
        return "this is a zookeeper member,the port is "+ serverPort;
    }

}
