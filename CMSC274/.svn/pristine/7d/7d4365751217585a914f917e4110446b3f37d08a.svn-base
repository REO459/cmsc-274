package edu.ben.challenges.challenge4;

public class CoreCourseGradeCalc {
	private double[] exams;
	private double hmwk;
	private double quiz;

	public CoreCourseGradeCalc(double[] exams, double hmwk, double quiz) {
		this.exams = exams;
		this.hmwk = hmwk;
		this.quiz = quiz;
	}

	public double calcFinalScore() {
		if (exams[2] > 90) {
			exams[2] += 10;
		}
		return exams[0] * .15 + exams[1] * .15 + exams[2] * .3 + hmwk * .3 + quiz * .1;
	}

	public double[] getExams() {
		return exams;
	}

	public double getHmwk() {
		return hmwk;
	}

	public double getQuiz() {
		return quiz;
	}
	
	
}
