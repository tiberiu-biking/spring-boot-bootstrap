package com.tpo.spring.boot.bootstrap.controller;

import com.tpo.spring.boot.bootstrap.domain.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/services")
    public ModelAndView services() {

        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Service 1", "Description about service 1"));
        messages.add(new Message("Service 2", "Description about service 2"));
        messages.add(new Message("Service 3", "Description about service 3"));
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("title", "Services");
        modelAndView.addObject("messages", messages);
        return modelAndView;
    }

}
