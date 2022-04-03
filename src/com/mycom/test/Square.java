package com.mycom.test;
public class Square {

	private int squareArea;

	public Square() {
		System.out.println("Constructor of Class");
		}

	// Method of Square Class performing Area Calculation
	public void calculateArea(int lengthOfaSide) {

		System.out.println("Input of one Side of Sqaure" + lengthOfaSide);

		squareArea = lengthOfaSide * lengthOfaSide;

		System.out.println("Area of Square Class:" + squareArea);

		}
	
	public static void main(String[] args) {
		Square obj = new Square();
		obj.calculateArea(5);
	}


}
