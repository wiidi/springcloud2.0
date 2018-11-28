package com.wudi.springcloudorder.api.Controller;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.beans.Transient;
import java.util.List;

/**
 * @Description: 纯手写ribbon本地负载均衡效果
 * @Author: 吴迪 625553347@qq.com 18040509188
 * @CreateDate: 2018/11/28 15:16
 * @UpdateUser:
 * @UpdateDate: 2018/11/28 15:16
 * @UpdateRemark:
 * @Version: 1.0
 * Copyright (c) 2018,武汉中地云申科技有限公司
 * All rights reserved.
 **/
@RestController
public class ExtRibbonController {
    //可以获取注册中心上的服务列表
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;

    //初始化请求数
    private int reqSize = 1;

    @RequestMapping("/ribbonMember")
    public String ribbonMember() {
        String instance = getInstances() + "/getMember";
        System.out.println("instanceUri" + instance);
        String result = restTemplate.getForObject(instance, String.class);

        return result;
    }

    private String getInstances() {
        //获取在注册中心 名称为springcloud-member的服务列表，所以在客户端集群向注册中心注册时名称需要一样
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("springcloud-member");
        if (serviceInstanceList.size() <= 0 || serviceInstanceList == null) {
            return "";
        }
        //服务器集群个数
        int instanceSize = serviceInstanceList.size();
        //取模
        int index = reqSize % instanceSize;
        //请求数加1，该处应该用原子操作
        reqSize++;
        return serviceInstanceList.get(index).getUri().toString();
    }
//    //    注入容器
//    @Bean
////    @LoadBalanced  //能让这个RestTemplate在请求时拥有客户端负载均衡的能力
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

}
