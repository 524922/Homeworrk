package endTermHomeWork.homework8.chapter11.demo07;

import endTermHomeWork.homework8.chapter11.demo02.CircleFromSimpleGeometricObject;
import endTermHomeWork.homework8.chapter11.demo03.RectangleFromSimpleGeometricObject;

public class CastingDemo {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject object1 = new CircleFromSimpleGeometricObject(1);
        RectangleFromSimpleGeometricObject object2 = new RectangleFromSimpleGeometricObject(1, 1);
        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object){
        if(object instanceof CircleFromSimpleGeometricObject){
            System.out.println("circle area"+((CircleFromSimpleGeometricObject)object).getArea());
        }
        else if(object instanceof RectangleFromSimpleGeometricObject){
            System.out.println("rectangle area:"+((RectangleFromSimpleGeometricObject)object).getArea());
        }
    }
}
