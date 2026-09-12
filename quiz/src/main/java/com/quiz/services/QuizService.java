
package com.quiz.services;

import java.util.List;


import com.quiz.entities.Quiz;


public interface QuizService {
	
	
	public Quiz save(Quiz quiz);
	
	public List<Quiz> getAll();
	
	public Quiz getById(Long id);

	

}
