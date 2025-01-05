package com.sst.Quora_SpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User extends BaseModel{

    private String username;

    private String password;

    @ManyToMany
    @JoinTable(
            name="user_tags",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns=@JoinColumn(name="tag_id")
    )
    private Set<Tag> followedTags;
}
