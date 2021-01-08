package endTermHomeWork.homework10.chapter11HomeworkOfOneStart.demo15;

import java.util.Scanner;

public class Area {

    public static float calculate(point vertex[], int pointNnm){
        int i=0;
        float temp=0;
        for (; i < pointNnm - 1; i++) {
            temp+=(vertex[i].x-vertex[i+1].x)*(vertex[i].y+vertex[i+1].y);
        }
        temp+=(vertex[i].x-vertex[0].x)*(vertex[i].y+vertex[0].y);
        return temp/2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        point[] vertex=new point[100];
        int pointNum=0;
        for (int i = 0; i < 100; i++) {
            vertex[i]=new point();
        }
        System.out.println("enter total vertex:");
        pointNum=scanner.nextInt();
        for (int i = 0; i < pointNum; i++) {
            System.out.println("第"+i+"个顶点的横坐标");
            vertex[i].x=scanner.nextFloat();
            System.out.println("第"+i+"个顶点的纵坐标");
            vertex[i].y=scanner.nextFloat();
        }
        System.out.println("area:"+calculate(vertex,pointNum));
    }
}
