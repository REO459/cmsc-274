package edu.ben.challenges.challenge2;

public class CodingChallenge2 {

	public static final double THRESH = 4.0;

	public double a(double val, double mu, double sigma) {
		return a((val - mu) / sigma) / sigma;
	}

	public double a(double val) {
		if (val != THRESH) {
			return c(val);
		} else {
			return 0;
		}
	}

	public double b(double z) {
		if (z < -THRESH) {
			return 0.0;
		}
		if (z > THRESH) {
			return 1.0;
		}
		return (0.5 + a(z));
	}

	private double c(double val) {
		return (-val * val) / 2;
	}

}
