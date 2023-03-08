package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/111")
public class myController {

    @RequestMapping(method = RequestMethod.GET)
    public String showView(){
        System.out.println("111");
        return "first-view";
    }


}
