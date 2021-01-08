package endTermHomeWork.homework6.chapter9.demo01;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius"
        +circle1.radius+"is"+circle1.getArea());

        SimpleCircle circle2 = new SimpleCircle();
        System.out.println("The area of the circle of radius"
                +circle2.radius+"is"+circle2.getArea());

        SimpleCircle circle3 = new SimpleCircle();
        System.out.println("The area of the circle of radius"
                +circle3.radius+"is"+circle3.getArea());

        SimpleCircle circle4 = new SimpleCircle();
        System.out.println("The area of the circle of radius"
                +circle4.radius+"is "+circle4.getArea());
    }

}

class SimpleCircle{
    double radius;
    SimpleCircle(){
        radius=1;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    SimpleCircle(double newRadius){
        radius=newRadius;
    }
    double getPerimeter(){
        return 2*radius*Math.PI;
    }
    void setRadius(double newRadius){
        radius=newRadius;
    }
}
