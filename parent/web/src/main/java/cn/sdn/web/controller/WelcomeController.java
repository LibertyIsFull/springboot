package cn.sdn.web.controller;

import cn.sdn.pojo.User;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: lixiang
 * @Description:
 * @Date: Created in 14:44 2017/11/3
 * @Modified By:
 */
@RestController
@RequestMapping(path = "/")
public class WelcomeController {

    @PostMapping(path = "/getUser")
    public User getUser(@RequestParam(name="id") String id){
        User user = new User();
        user.setUserName("XXX");
        user.setPassword("xxxxxxxx");
        return user;
    }


}
