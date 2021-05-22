package com.ellsom.controller;

import com.ellsom.pojo.employee;
import com.ellsom.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class empController {
    @Autowired
    @Qualifier("empServiceImp")
    private empService empService;

    @RequestMapping("/allemp")
    public String list(Model model) {
        List<employee> list = empService.findAll();
        model.addAttribute("list", list);
        return "allemp";
    }
    @RequestMapping("toaddemp")
    public String toadd(){
        return "add";
    }
    @PostMapping("add")
    public String adde(employee e){
        empService.addEmp(e);
        System.out.println(e);
        return "redirect:/emp/allemp";
    }
    @RequestMapping("toUpdateemp")
    public  String toupdate(Model model,int id){
        employee e=empService.findEmp(id);
        model.addAttribute(e);
        return "update";
    }
    @PostMapping("update")
    public String updateEmp(Model model,employee e){
        System.out.println(e);
        empService.upDateEmp(e);
        return "redirect:/emp/allemp";
    }
    @RequestMapping("delete/{no}")
    public String deleteEmp(@PathVariable("no") int no){
        empService.deleteEmp(no);
        return "redirect:/emp/allemp";
    }
    @PostMapping("select")
    public String selectbyName(String name,Model model){
        List<employee> list = empService.SelectByName(name);
        System.out.println(name);
        model.addAttribute("list", list);
        return "allemp";
    }
}
