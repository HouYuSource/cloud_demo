package cn.shaines.test.client;

import cn.shaines.test.client.impl.UserClientImpl;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "user",fallback = UserClientImpl.class, path = "/user")
public interface UserClient {

    @RequestMapping(value = "/{id}")
    public Result hello(@PathVariable("id") String id);

}
