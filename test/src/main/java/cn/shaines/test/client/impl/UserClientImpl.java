package cn.shaines.test.client.impl;

import cn.shaines.test.client.UserClient;
import entity.Result;
import org.springframework.stereotype.Component;

/**
 * @author houyu
 * @createTime 2019/4/6 9:24
 */
@Component
public class UserClientImpl implements UserClient {

    @Override
    public Result hello(String id) {
        return Result.error("调用失败,启用熔断器机制");
    }
}
