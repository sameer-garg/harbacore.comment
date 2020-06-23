package com.form.form_submission.comment_module;

import org.hibernate.tool.schema.internal.ExceptionHandlerLoggedImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository repo;

    public boolean dataPersistObject(CommentRequestVO comment) {
        CommentEntity savecomment=new CommentEntity();
        savecomment.name=comment.name;
        savecomment.email=comment.email;
        savecomment.newcomment=comment.newcomment;
        savecomment.page=comment.page;
         return dataPersistObjectPopulate(savecomment);
    }

    public  boolean  dataPersistObjectPopulate(CommentEntity savecomment){
        return save(savecomment);
    }

    public boolean save(CommentEntity savecomment){
        try{
            repo.save(savecomment);
            return true;
        }
        catch (Exception Submitfailed)
        {
            return false;
        }
    }
}
