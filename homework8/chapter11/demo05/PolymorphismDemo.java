package endTermHomeWork.homework8.chapter11.demo05;

import endTermHomeWork.homework8.chapter11.demo01.SimpleGeometricObject;
import endTermHomeWork.homework8.chapter11.demo02.CircleFromSimpleGeometricObject;
import endTermHomeWork.homework8.chapter11.demo03.RectangleFromSimpleGeometricObject;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
        displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
    }
    public static void displayObject(SimpleGeometricObject object){
        System.out.println("created on "+object.getDataCreated()+". Color is "+object.getColor());
    }
}
