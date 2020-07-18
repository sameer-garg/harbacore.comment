package com.form.form_submission.comment_module.Database.DAO;

import com.form.form_submission.comment_module.Beans.ResponseVO.CommentResponseVO;
import com.form.form_submission.comment_module.Database.Model.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<CommentEntity, Integer> {
    List<CommentEntity> findByPage(String pageid);
}
