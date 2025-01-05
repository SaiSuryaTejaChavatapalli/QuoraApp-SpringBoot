package com.sst.Quora_SpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Question extends  BaseModel{
    // Question has many answers
    @OneToMany
    private String answers;

    private String content;
}
