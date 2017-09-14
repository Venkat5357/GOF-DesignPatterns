package com.practise.designpatterns.creational.factory;

/*

 Let subclass to decide to which class to instantiate

 Basic principle is at runtime get an object of similar type based on parameter we pass

 Examples are : Calender,ResourceBundle and NumberFormat.getInstance()
 */

public class ShapeFactory {


    //use getShape method to get object of type shape
    public ShapeInterface getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
