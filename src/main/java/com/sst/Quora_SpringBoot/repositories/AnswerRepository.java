package com.sst.Quora_SpringBoot.repositories;

import com.sst.Quora_SpringBoot.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {
}
