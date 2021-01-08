package endTermHomeWork.homework6.chapter9.demo06;

public class TotalArea {
    public static void main(String[] args) {
        CircleWithPrivateDataFields[] circleArray;//创建一个CircleWithPrivateDataFields的数组
        circleArray=createCircleArray();//把函数createCircleArray赋予新创建的数组
        printCircleArray(circleArray);//打印数组
    }
    //创建数组
    public static CircleWithPrivateDataFields[] createCircleArray(){
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i]=new CircleWithPrivateDataFields(Math.random()*100);//赋予半径
        }
        return circleArray;
    }
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30s%-15s\n",circleArray[i].getRadius(),circleArray[i].getArea());
        }
        System.out.println("----------------------------------------------");
        System.out.printf("%-30s%-15s\n","The total area of circles is",sum(circleArray));
    }
    public static double sum(CircleWithPrivateDataFields[] circleArray){
        double sum=0;
        for (int i = 0; i < circleArray.length; i++) {
            sum+=circleArray[i].getArea();
        }
        return sum;
    }
}
