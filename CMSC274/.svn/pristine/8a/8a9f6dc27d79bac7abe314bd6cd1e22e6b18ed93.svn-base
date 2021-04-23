package edu.ben.challenges.challenge4;

public class ElectiveGradeCalculator {
	private double projectGrade;
	private double hmwkGrade;
	private double quizGrade;

	public ElectiveGradeCalculator(double projectGrade, double hmwkGrade, double quizGrade) {
		this.projectGrade = projectGrade;
		this.hmwkGrade = hmwkGrade;
		this.quizGrade = quizGrade;
	}

	public double computeFinalScore() {
		if (projectGrade < 50) {
			return projectGrade * .25 + hmwkGrade * .5 + quizGrade * .25 - 10;
		} else {
			return projectGrade * .25 + hmwkGrade * .5 + quizGrade * .25;
		}
	}

	public double getProjectGrade() {
		return projectGrade;
	}

	public double getHmwkGrade() {
		return hmwkGrade;
	}

	public double getQuizGrade() {
		return quizGrade;
	}

	
}
