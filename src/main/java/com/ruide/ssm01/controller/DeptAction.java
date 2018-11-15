package com.ruide.ssm01.controller;
import com.ruide.ssm01.po.Dept;
import com.ruide.ssm01.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DeptAction {
    @Resource
    private DeptService deptService;

    @RequestMapping(value = "show")
    public  String findAll(HttpServletRequest request){
        List<Dept> list=deptService.findAll();
        request.setAttribute("dept",list);
        return  "hhhh";
    }
}
