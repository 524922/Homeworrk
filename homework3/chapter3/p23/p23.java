package endTermHomeWork.homework3.chapter3.p23;

import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x=scanner.nextFloat();
        float y=scanner.nextFloat();
        if(Math.abs(x)>5 || Math.abs(y)>2.5){
            System.out.println("out");
        }else {
            System.out.println("in");
        }
    }
}
