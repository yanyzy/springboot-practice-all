package top.zhyee.springbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import top.zhyee.springbootmybatis.dao.UserMapper;
import top.zhyee.springbootmybatis.entity.User;

/**
 * @author zhyee
 * @date 2018/7/20 下午6:18
 */
@RequestMapping("/users")
@RestController
public class UserController {

    private UserMapper userMapper;

    @Autowired
    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userMapper.insert(user);
    }

    @Scheduled(fixedRate = 30000)
    public void task(){
        System.out.println(userMapper.selectByPrimaryKey(1).getName());
    }
}
