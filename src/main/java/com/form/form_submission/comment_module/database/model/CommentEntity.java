package com.form.form_submission.comment_module.database.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comment_entity")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer id;

    @Column(name="name")
    public String name;

    @Column(name="email")
    public String email;

    @Column(name="newcomment")
    public String  newcomment;

    @Column(name="page")
    public String page;                // to store the pageid

}
