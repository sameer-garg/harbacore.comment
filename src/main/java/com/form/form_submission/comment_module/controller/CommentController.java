package com.form.form_submission.comment_module.controller;

import com.form.form_submission.comment_module.beans.requestVO.CommentRequestVO;
import com.form.form_submission.comment_module.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentController {
    @Autowired
    private CommentService service;

    @RequestMapping(value = "/show-form")
    public ModelAndView getForm(@RequestParam("pg-id") String pageid) {   // the url being localhost:8080/show-form?pg-id={the page id}
        CommentRequestVO comment= new CommentRequestVO();               // creating an object to store data from UI
        ModelAndView mav= new ModelAndView();
        mav.addObject
                ("Comments", service.getListOfPageComments(pageid));
        mav.addObject("Comment", comment);                  // sending the comment object to store the required user details and the comment
        mav.addObject("pageid",pageid);                         //sending  the  page id as an attribute to store in comment object
        mav.setViewName("form");                                        // rendering the form template where the user enter details
        return mav;
    }

    @PostMapping(value = "/auto-form")
    public String postForm(@ModelAttribute("comment") CommentRequestVO comment) {
        if(service.dataPersistObject(comment))                          // calling service methods to persist data which return true if persist was a success
            return "redirect:/show-form?pg-id="+ comment.page;                             // redirecting to the comment page if the post is added
        else
                return "fail";
}

}
