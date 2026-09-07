package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quiz {
	
	@Id
	private Long quizId;
	private String quizName;
	
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
	public String getQuizName() {
		return quizName;
	}
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}
	public Quiz(Long quizId, String quizName) {
		super();
		this.quizId = quizId;
		this.quizName = quizName;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
