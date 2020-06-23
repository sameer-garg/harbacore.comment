package com.form.form_submission.comment_module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentController {
    @Autowired
    private CommentService service;

    @RequestMapping(value = "/show-form")
    public ModelAndView getForm(@RequestParam("pg-id") String page) {   // the url being localhost:8080/show-form?pg-id={the page id}
        CommentRequestVO comment= new CommentRequestVO();               // creating an object to store data from UI
        ModelAndView mav= new ModelAndView();
        mav.addObject("comment", comment);                  // sending the comment object to store the required user details and the comment
        mav.addObject("page",page);                         //sending  the  page id as an attribute to store in comment object
        mav.setViewName("form");                                        // rendering the form template where the user enter details
        return mav;
    }

    @PostMapping(value = "/auto-form")
    public String postForm(@ModelAttribute("comment") CommentRequestVO comment) {
        if(service.dataPersistObject(comment))                          // calling service methods to persist data which return true if persist was a success
            return "success";
        else
            return "fail";
    }

}
