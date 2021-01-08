package endTermHomeWork.homework6.chapter9.demo06;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println(myCircle.getRadius()+" "+myCircle.getArea());
        System.out.println("===");
        myCircle.setRadius(myCircle.getRadius()*1.1);
        System.out.println(myCircle.getRadius()+" "+myCircle.getArea());
        System.out.println("number:"+ CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
