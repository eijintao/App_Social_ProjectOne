package com.xm.app.controller;

import com.xm.app.entity.Test;
import com.xm.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Mei Jintao
 * @date 2019/9/5 10:02
 */
@Controller
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/showTest")
    @ResponseBody
     public List<Test> showTest(Model model){
        List<Test> list= testService.getTestAll();
        model.addAttribute("list" ,list);
        return list;
    }
}
