package com.zrui.road.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zrui on 2016/7/10.
 */
@Controller
public class Index {

    @RequestMapping("/index")
    public String index(){

        return  "index";
    }

}
