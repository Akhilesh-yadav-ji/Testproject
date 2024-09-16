package com.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller2 {

    @GetMapping("demopage,login")
    public ModelAndView disp(@RequestParam("name") String n, @RequestParam ("Password")String p)
             {
    	ModelAndView login=new ModelAndView();
	     login.addObject("name",n);
	     login.addObject("password",p);
	     login.setViewName("demopage,login");
        System.out.println(n);
        System.out.println(p);
        return  login;
    }
}
