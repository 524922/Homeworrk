package endTermHomeWork.homework3.chapter3.p28;

import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input the first rectangle info:");
        float x1=scanner.nextFloat();
        float y1=scanner.nextFloat();
        float w1=scanner.nextFloat();
        float h1=scanner.nextFloat();

        System.out.println("please input the second rectangle info:");
        float x2=scanner.nextFloat();
        float y2=scanner.nextFloat();
        float w2=scanner.nextFloat();
        float h2=scanner.nextFloat();

        //judge
        double inXMin=x1-(w1-w2)/2;
        double inXMax=x1+(w1-w2)/2;
        double inYMin=y1-(h1-h2)/2;
        double inYMax=y1+(h1-h2)/2;

        double outXMin=x1-(w1+w2)/2;
        double outXMax=x1+(w1+w2)/2;
        double outYMin=y1-(h1+h2)/2;
        double outYMax=y1+(h1+h2)/2;

        if(x2>=inXMin&&x2<=inXMax&&y2>=inYMin&&y2<=inYMax){
            System.out.println("小矩形在大矩形里面!");
        }else if(x2<=outXMin||x2>=outXMax||y2<=outYMin||y2>=outYMax){
            System.out.println("小矩形在大矩形外面!");
        }else{
            System.out.println("小矩形和大矩形相交!");
        }

    }
}
