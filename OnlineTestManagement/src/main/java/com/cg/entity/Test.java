package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="test_table")
public class Test {
	
	@Id
	private int testId;
	
	@Column
	private String testTitle;
	
	@Column
	private int testTotalMarks;
	
	@Column
	private int testMarksScored;
	
	@OneToOne
	@JoinColumn(name="questionId")
	private Question q;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public int getTestTotalMarks() {
		return testTotalMarks;
	}

	public void setTestTotalMarks(int testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}

	public int getTestMarksScored() {
		return testMarksScored;
	}

	public void setTestMarksScored(int testMarksScored) {
		this.testMarksScored = testMarksScored;
	}

	public Question getQuestions() {
		return q;
	}

	public void setQuestions(Question questions) {
		this.q = questions;
	}

	
}
