package com.yadavweb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {

    @GetMapping("/demopage")
    public ModelAndView disp(@RequestParam("name") String n,
                             @RequestParam("roll") String r,
                             @RequestParam("marks") String m) {
        ModelAndView modelAndView = new ModelAndView("demopage");
        modelAndView.addObject("name", n);
        modelAndView.addObject("roll", r);
        modelAndView.addObject("marks", m);
        
        System.out.println(n);
        System.out.println(r);
        System.out.println(m);
        
        return modelAndView;
    }
}
