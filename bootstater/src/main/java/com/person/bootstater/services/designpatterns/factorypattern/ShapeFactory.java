package com.person.bootstater.services.designpatterns.factorypattern;

public class ShapeFactory {
	
	public static final String CIRCLE = "Circle";

	public static final String OCTAGON = "Octagon";
	
	public Shape getNewShape(final String shapeType) {
		
		if(shapeType == null) {
			throw new IllegalStateException("Method Parameter is null");
		}else if(shapeType.equals(CIRCLE)) {
			return new Circle();
		}else if(shapeType.equals(OCTAGON)) {
			return new Octagon();
		}else {
			throw new IllegalStateException("no shape for arugment passed");
		}
	}
	
	public Shape getNewShape(ShapeType shapeType) {
		
		Cloneable clone = null;
		if(shapeType == null) {
			throw new IllegalStateException("Method Parameter is null");
		}else if(shapeType.equals(ShapeType.CIRCLE)) {
			return new Circle();
		}else if(shapeType.equals(ShapeType.OCTAGON)) {
			return new Octagon();
		}else {
			throw new IllegalStateException("no shape for arugment passed");
		}
		
		
	}
	
	enum ShapeType{
		CIRCLE, OCTAGON
	}
}