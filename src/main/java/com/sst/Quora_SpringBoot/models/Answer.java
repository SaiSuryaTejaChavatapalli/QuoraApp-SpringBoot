package com.sst.Quora_SpringBoot.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Answer extends  BaseModel{

  private String content;

  @ManyToOne
  @JoinColumn(name = "question_id")
  private Question question;

  //Many side has foreign key
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;


  @OneToMany(mappedBy = "answer")
  private Comment comments;

  @ManyToMany
  @JoinTable(
       name = "answer_likes",
       joinColumns = @JoinColumn(name = "answer_id"),
       inverseJoinColumns = @JoinColumn(name = "user_id")
  )
  private Set<User> likedBy;


}
