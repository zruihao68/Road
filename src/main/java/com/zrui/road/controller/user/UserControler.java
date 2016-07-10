package com.zrui.road.controller.user;

import com.zrui.road.entity.User;
import com.zrui.road.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by zrui on 2016/7/1.
 */
@Controller
@RequestMapping("/user")
public class UserControler {

    @Resource
    private UserService userService;


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String selectBykey(@PathVariable("id")String id,Model model){

        User user = userService.selectByKey(id);
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/add")
    public String insertlist(){

        try{
            userService.iiiinsertUser(new User());
        }catch (Exception e){
            e.printStackTrace();
        }


        return  "success";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST ,consumes="application/json")
    public String addUser(@RequestBody  User user){

        System.out.println(user);

        return "success";
    }



}
