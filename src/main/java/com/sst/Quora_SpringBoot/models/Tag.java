package com.sst.Quora_SpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tag extends BaseModel{

    private String name;

    @ManyToMany(mappedBy = "followedTags")
    private Set<User> followers;
}
