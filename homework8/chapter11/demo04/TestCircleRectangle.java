package endTermHomeWork.homework8.chapter11.demo04;

import endTermHomeWork.homework8.chapter11.demo02.CircleFromSimpleGeometricObject;
import endTermHomeWork.homework8.chapter11.demo03.RectangleFromSimpleGeometricObject;

public class TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle= new CircleFromSimpleGeometricObject(1);
        System.out.println("circle: "+circle.toString());
        System.out.println("color"+circle.getColor());
        System.out.println("radius:"+circle.getRadius());
        System.out.println("area:"+circle.getArea());
        System.out.println("diameter:"+circle.getDiameter());

        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2,4);
        System.out.println("rectangle:"+rectangle.toString());
        System.out.println("area:"+ rectangle.getArea());
        System.out.println("perimeter:"+rectangle.getPerimeter());

    }
}
