package cn.shaines.user.controller;

import entity.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author houyu
 * @createTime 2019/4/5 23:22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/{id}")
    public Result hello(@PathVariable("id") String id){
        return Result.success("userId:" + id);
    }

}
