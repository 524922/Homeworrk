package endTermHomeWork.homework3.chapter3.p29;

import java.util.Scanner;

public class p29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input the first circle info:");
        float x1=scanner.nextFloat();
        float y1=scanner.nextFloat();
        float r1 =scanner.nextFloat();


        System.out.println("please input the second circle info:");
        float x2=scanner.nextFloat();
        float y2=scanner.nextFloat();
        float w2=scanner.nextFloat();

        //judge
        double inXMin=x1-(r1 -w2)/2;
        double inXMax=x1+(r1 -w2)/2;

        double outXMin=x1-(r1 +w2)/2;
        double outXMax=x1+(r1 +w2)/2;

        if(x2>=inXMin&&x2<=inXMax){
            System.out.println("小园大园里面!");
        }else if(x2<=outXMin||x2>=outXMax){
            System.out.println("小园在大园外面!");
        }else{
            System.out.println("小园和大园相交!");
        }
    }
}
