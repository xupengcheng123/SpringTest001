package cn.bdqn.controller;

import cn.bdqn.entity.User;
import cn.bdqn.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        IUserService userService =(IUserService)applicationContext.getBean("userService");

        List<User> userList = new ArrayList<User>();
        userList = userService.getUserList();
    }
}
