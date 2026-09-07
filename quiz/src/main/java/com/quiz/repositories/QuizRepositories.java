package com.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.entities.Quiz;


@Repository
public interface QuizRepositories extends JpaRepository<Quiz, Long> {

}
