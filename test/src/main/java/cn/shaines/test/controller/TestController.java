package cn.shaines.test.controller;

import cn.shaines.test.client.UserClient;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author houyu
 * @createTime 2019/4/6 0:14
 */
@RestController
public class TestController {

    @Autowired
    private UserClient userClient;

    @RequestMapping("/test/user/{id}")
    public Result hello(@PathVariable("id") String id){
        Result hello = userClient.hello(id);
        return hello.setData("我是调用其他微服务添加的数据.");
    }


}
