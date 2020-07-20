package com.form.form_submission.comment_module.service;

import com.form.form_submission.comment_module.beans.responseVo.CommentResponseVO;
import com.form.form_submission.comment_module.database.dao.CommentRepository;
import com.form.form_submission.comment_module.database.model.CommentEntity;
import com.form.form_submission.comment_module.beans.requestVO.CommentRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository repo;

    public boolean dataPersistObject(CommentRequestVO comment) {
        CommentEntity savecomment=new CommentEntity();                  // creating an object of entity class  for persisting it into database
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
    public List<CommentResponseVO> getListOfPageComments(String pageid) {
        List<CommentResponseVO> commentResponseVOList = new ArrayList<>();
        repo.findByPage(pageid).stream().forEach(
                entity -> commentResponseVOList.add(new CommentResponseVO( entity.getName(),entity.getEmail(),entity.getNewcomment())));

        return commentResponseVOList;
    }
}
