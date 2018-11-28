package com.wudi.springcloudorder.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: 吴迪 625553347@qq.com 18040509188
 * @CreateDate: 2018/11/28 16:33
 * @UpdateUser:
 * @UpdateDate: 2018/11/28 16:33
 * @UpdateRemark:
 * @Version: 1.0
 * Copyright (c) 2018,武汉中地云申科技有限公司
 * All rights reserved.
 **/
@FeignClient(name = "springcloud-member")
public interface MemberApiFeign {
    //feign 书写方式以springMVC接口形式书写
    @RequestMapping("/getMember")
    public String getMember();

}
