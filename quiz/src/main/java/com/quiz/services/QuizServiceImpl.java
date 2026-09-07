package com.quiz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepositories;


@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
    private QuizRepositories quizRepositories;	
	
	
	@Override
	public Quiz save(Quiz quiz) {
		
		Quiz save = quizRepositories.save(quiz);
		
		return save;
	}

	@Override
	public List<Quiz> getAll() {
		List<Quiz> all = quizRepositories.findAll();
		return all;
	}

	@Override
	public Quiz getById(Long id) {
		
		Quiz byId = quizRepositories.findById(id).orElseThrow(() -> new RuntimeException("quiz not found"));
		
		return byId;
	}

}
