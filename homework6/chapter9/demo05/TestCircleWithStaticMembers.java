package endTermHomeWork.homework6.chapter9.demo05;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println(CircleWithStaticMembers.numberOfObjects);

        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("c1:");
        System.out.println("c1:"+c1.radius+" num:"+c1.numberOfObjects);

        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        c1.radius=9;
        System.out.println("create c2 and modifying c1");
        System.out.println("c1:"+c1.radius+" num:"+c1.numberOfObjects);
        System.out.println("c2:"+c2.radius+" num:"+c2.numberOfObjects);


    }
}
