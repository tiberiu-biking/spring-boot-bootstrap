package com.tpo.spring.boot.bootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Tiberiu
 * @since 26/02/16.
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

}
