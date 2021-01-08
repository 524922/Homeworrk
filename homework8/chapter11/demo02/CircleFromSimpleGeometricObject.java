package endTermHomeWork.homework8.chapter11.demo02;

import endTermHomeWork.homework8.chapter11.demo01.SimpleGeometricObject;

public class CircleFromSimpleGeometricObject
extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject(){

    }
    public CircleFromSimpleGeometricObject(double radius){
        this.radius=radius;
    }
    public CircleFromSimpleGeometricObject(double radius,
                                           String color,
                                           boolean filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void printCircle(){
        System.out.println("create"+getDataCreated()+" radius:"+radius);
}
}
