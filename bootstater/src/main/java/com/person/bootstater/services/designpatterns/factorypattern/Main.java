package com.person.bootstater.services.designpatterns.factorypattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circle = shapeFactory.getNewShape(ShapeFactory.CIRCLE);
		circle.draw();

		Shape octagon = shapeFactory.getNewShape(ShapeFactory.OCTAGON);
		octagon.draw();
		
		System.out.println("--------------Handled with Enum--------------------");
		circle = shapeFactory.getNewShape(ShapeFactory.ShapeType.CIRCLE);
		circle.draw();
	}

}
