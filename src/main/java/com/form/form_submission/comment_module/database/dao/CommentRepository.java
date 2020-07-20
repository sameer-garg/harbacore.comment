package com.form.form_submission.comment_module.database.dao;

import com.form.form_submission.comment_module.database.model.CommentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<CommentEntity, Integer> {
    List<CommentEntity> findByPage(String pageid);
}
