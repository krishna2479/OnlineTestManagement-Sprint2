package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(name="myTable")
public class Test {

	
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int testId;
	
	@Column
	private String testTitle;
	
	@Column
	private int testTotalMarks;
	@Column
	private String timeAllowed;
	

	public long getTestId() {
		return testId;
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

	public String getTimeAllowed() {
		return timeAllowed;
	}



	public void setTimeAllowed(String timeAllowed) {
		this.timeAllowed = timeAllowed;
	}

	
}
