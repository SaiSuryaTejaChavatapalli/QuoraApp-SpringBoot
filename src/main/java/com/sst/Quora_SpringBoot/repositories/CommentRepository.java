package com.sst.Quora_SpringBoot.repositories;

import com.sst.Quora_SpringBoot.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
