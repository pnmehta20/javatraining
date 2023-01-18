package com.cbk.main;


import java.util.Scanner;

import com.cbk.main.domain.Circle;
import com.cbk.main.domain.Line;
import com.cbk.main.domain.Shapes;
import com.cbk.main.domain.Triangle;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Circle circle = new Circle();
//		circle.draw();
		
//		 Shapes shapes = new Circle();
//		 shapes.draw();
//		 
//		 shapes.print();
		
//		Triangle triangle = new Triangle();
//		triangle.draw();
		
		Scanner scanner = new Scanner(System.in);
		Shapes shapes =  getShape(scanner.nextInt());
		shapes.draw();
		

	}

	
	public static Shapes getShape(int i ) {
		if(i == 1) {
			Shapes shape = new Circle();
			return shape;			
		}
		if(i == 2) {
			return new Triangle(); 			
		}
		if(i == 3) {
			return new Line(); 			
		}		
		return null;
		
	}
}
