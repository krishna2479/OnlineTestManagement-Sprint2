package com.cg.entity;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sun.istack.NotNull;

@Entity
@Repository
@Table(name="test_table")
@EnableTransactionManagement
public class Test {

	
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int testId;
	
	@Column
	private String testTitle;
	
	@OneToMany
	private Set<Question> testQuestions;
	@Column
	private int testTotalMarks;
	@Column
	private double testMarksScored;

	public long getTestId() {
		return testId;
	}

	

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public Set<Question> getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(Set<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}

	public int getTestTotalMarks() {
		return testTotalMarks;
	}

	public void setTestTotalMarks(int testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}

	public double getTestMarksScored() {
		return testMarksScored;
	}

	public void setTestMarksScored(double testMarksScored) {
		this.testMarksScored = testMarksScored;
	}

	
}
