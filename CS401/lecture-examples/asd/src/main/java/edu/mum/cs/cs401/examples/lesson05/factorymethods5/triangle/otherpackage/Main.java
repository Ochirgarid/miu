package edu.mum.cs.cs401.examples.lesson05.factorymethods5.triangle.otherpackage;

import java.util.Arrays;

import edu.mum.cs.cs401.examples.lesson05.factorymethods5.triangle.Triangle;

public class Main {

	public static void main(String[] args) {
		Triangle myTriangle = Triangle.fromThreeSides(1, 1, 1);
		System.out.println(Arrays.toString(myTriangle.getAngles(myTriangle)));
	}

}
