package com.sst.Quora_SpringBoot.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Answer extends  BaseModel{
    // Answer belongs to one question
    @OneToOne
    private String question;

    private String content;

    // Answer has many comments
    @OneToMany
    private String comments;
}
