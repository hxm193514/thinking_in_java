package com.hxm.demo01;

public class test01 {
     static void doSomething(Shape shape){
    	shape.Erase();
    	shape.Draw();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Line line = new Line();
		doSomething(circle);
		doSomething(triangle);
		doSomething(line);
	}
	

}
