package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by rickiecashwell on 4/18/17.
 */
@Controller
public class MyController {

    @GetMapping("/")
    public String Home(){

        return "index";
    }
}
