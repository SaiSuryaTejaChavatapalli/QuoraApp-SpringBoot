package com.sst.Quora_SpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment extends BaseModel{
    // Comment can also have more comments

    // A comment belongs to another comment
    private String content;
    // A comment belongs to an answer
    @OneToOne
    private String answer;

}
