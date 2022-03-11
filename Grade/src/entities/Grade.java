package entities;

public class Grade {

	public String name;
	public double p1, p2, p3;
	
	public double finalGrade() {
		return p1 + p2 + p3;
	}
	
	public double missingPoints() {
		return 60 - finalGrade();
	}
	
	public String toString() {
		if (finalGrade() >= 60) {
			return String.format("%.2f", finalGrade()) + "\nPASS";
		} else {
			return String.format("%.2f", finalGrade()) + "\nFAILED" + "\nMISSING " + String.format("%.2f", missingPoints()) + " POINTS";
		}
	}
}
