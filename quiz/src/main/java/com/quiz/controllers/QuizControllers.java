package com.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;

@RestController
public class QuizControllers {
	
	@Autowired
	private QuizService quizService;
	
	@PostMapping("/save")
	public Quiz save(@RequestBody Quiz quiz){
		
		Quiz quiz1 = quizService.save(quiz);
		
		return quiz1;
	}
	
	@GetMapping("/getAll")
	public List<Quiz> getAll(){
		
	List<Quiz> all=	quizService.getAll();
	return all;
	}
	@GetMapping("/getbyid/{id}")
	public Quiz getById(@PathVariable Long id){
		
	Quiz quiz2 =	quizService.getById(id);
		
		return quiz2;
		
	}

}
