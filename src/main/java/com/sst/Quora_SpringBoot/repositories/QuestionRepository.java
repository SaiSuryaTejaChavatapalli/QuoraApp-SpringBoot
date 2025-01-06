package com.sst.Quora_SpringBoot.repositories;

import com.sst.Quora_SpringBoot.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
}
