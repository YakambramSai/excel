package com.org.excel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.excel.model.Employee;

@Controller
public class TabController {
    @RequestMapping("/login")
    public ModelAndView hello(Model model) {
       
        model.addAttribute("employee", new Employee());
        return new ModelAndView("Tab1");
    }
    
   
    
    @RequestMapping("/tab1")
    public ModelAndView tab1(Model model) {
    	model.addAttribute("employee", new Employee());
        return new ModelAndView("Tab1");
    }
    
    @RequestMapping("/tab2")
    public ModelAndView tab2(Model model) {
    	model.addAttribute("employee", new Employee());
        return new ModelAndView("Tab2");
    }
    
    @RequestMapping("/tab3")
    public ModelAndView tab3(Model model) {
        model.addAttribute("name", "sAI");
        return new ModelAndView("Tab3");
    }
    
    @RequestMapping("/tab4")
    public ModelAndView tab4(Model model) {
        model.addAttribute("name", "sAI");
        return new ModelAndView("Tab4");
    }
    
    @RequestMapping("/tab5")
    public ModelAndView tab5(Model model) {
        model.addAttribute("name", "sAI");
        return new ModelAndView("Tab5");
    }
    
    @RequestMapping("/tab6")
    public ModelAndView tab6(Model model) {
        model.addAttribute("name", "sAI");
        return new ModelAndView("Tab6");
    }
}