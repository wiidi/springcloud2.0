package com.wudi.springcloudorder.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @Autowired
    private RestTemplate restTemplate;

    /**
     * springcloud 提供两张调用方式rest、fegin
     *
     * @return
     */
    @RequestMapping("/getOrder")
    public String getMember() throws Exception {
        String url="http://springcloud-member:8000/getMember";
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }

//    //    注入容器
//    @Bean
//    @LoadBalanced  //能让这个RestTemplate在请求时拥有客户端负载均衡的能力
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

}
