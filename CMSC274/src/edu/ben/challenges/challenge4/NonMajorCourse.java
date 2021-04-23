package edu.ben.challenges.challenge4;

public class NonMajorCourse {
	private double project;
	private double homework;
	private double quizzes;
	private double[] exams;
	
	public NonMajorCourse(double project, double homework, double quizzes, double[] exams) {
		this.project = project;
		this.homework = homework;
		this.quizzes = quizzes;
		this.exams = exams;
	}
	
	public double calcFinalGrade() {
		return exams[0] * .15 + exams[1] * .15 + homework * .5 + quizzes * .1 + project * .1;
	}

	public double getProject() {
		return project;
	}

	public double getHomework() {
		return homework;
	}

	public double getQuizzes() {
		return quizzes;
	}

	public double[] getExams() {
		return exams;
	}
	
	
}
