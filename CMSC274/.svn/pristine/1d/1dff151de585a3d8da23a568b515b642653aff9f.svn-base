package edu.ben.challenges.challenge4;

public class ElectiveGradeCalculatorAdapter implements IGradeCalcAdapter {
	// calls the elective course calculator
	private ElectiveGradeCalculator electiveCourse = new ElectiveGradeCalculator(0, 0, 0);
	
	@Override
	public double getFinalGrade(double homework, double quiz, double[] exams, double project) {
		return electiveCourse.computeFinalScore();
	}

}
