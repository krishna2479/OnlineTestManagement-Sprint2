package com.cg.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sun.istack.NotNull;

@Entity
@Table(name="QuestionsTable")
public class Question {

	
	
	@Id
	@NotNull
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer questionID;
	@Column
	private String questionOptions[]=new String[3];
	@Column
	private String questionTitle;
	@Column
	private int questionAnswer;
	@Column
	private double questionMarks;
	@Column
	private int chosenAnswer;
	@Column
	private BigDecimal marksScored;
	
	/*@ManyToOne
	@JoinColumn(name="testID")
	Test test;*/
	
	
	
	
	
	public Integer getQuestionID() {
		return questionID;
	}
	public void setQuestionID(Integer questionID) {
		this.questionID = questionID;
	}
	public String[] getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String opt1, String opt2, String opt3, String opt4) {
		this.questionOptions[0]=opt1;
		this.questionOptions[1]=opt2;
		this.questionOptions[2]=opt3;
		this.questionOptions[3]=opt4;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public double getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(double questionMarks) {
		this.questionMarks = questionMarks;
	}
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public BigDecimal getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(BigDecimal marksScored) {
		this.marksScored = marksScored;
	}
	
	/*public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}*/
	public Question() {
	}

	public Question(Integer questionID, String[] questionOptions, String questionTitle, int questionAnswer,
			double questionMarks, int chosenAnswer, BigDecimal marksScored, Test test) {
		super();
		this.questionID = questionID;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
		this.marksScored = marksScored;
		//this.test = test;
	}
	
	
	

}
