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
    public ModelAndView GetForm(@RequestParam("pg-id") String pageid, Model model) {
        CommentRequestVO comment= new CommentRequestVO();
        comment.page=pageid;
        System.out.println(comment.page);
        ModelAndView mav= new ModelAndView();
        mav.addObject("comment", comment);
        mav.setViewName("form");
        return mav;
    }

    @PostMapping(value = "/auto-form")
    public String PostForm(@ModelAttribute("comment") CommentRequestVO comment) {
        if(service.dataPersistObject(comment))
        {
            System.out.println(comment.page);
            return "success";
        }
        else
            return "fail";
    }

}
