package entities;

public class Rectangle {

	public double width, height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return (height*2) + (width*2);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", Area()) + "\nPERIMETER = " 
				+ String.format("%.2f", Perimeter()) 
				+ "\nDIAGONAL = " + String.format("%.2f", +Diagonal());
	}
	
}
