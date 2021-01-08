package endTermHomeWork.homework3.chapter3.p27;

import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x=scanner.nextFloat();
        float y=scanner.nextFloat();
        if(y<=(-0.5*x+100)){
            System.out.println("in");
        }else {
            System.out.println("out");
        }
    }
}
