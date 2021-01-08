package endTermHomeWork.homework3.chapter3.p22;

import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        double distance=0;
        distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        if(distance>10){
            System.out.println("not in");
        }else{
            System.out.println("in");
        }
    }
}
