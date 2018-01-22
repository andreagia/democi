package com.cloudcenturion.democi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerCI {

    @RequestMapping({"/greeting","/"})
    public String greeting(@RequestParam(value="cloud", required=false, defaultValue="CIAO CLOUD") String cloud, Model model) {
        model.addAttribute("cloud", cloud);
        return "greeting";
    }

}
