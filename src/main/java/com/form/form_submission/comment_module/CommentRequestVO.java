package com.form.form_submission.comment_module;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class CommentRequestVO {
    public Integer id;
    public String name;
    public String email;
    public String  newcomment;
    public String page;
}
