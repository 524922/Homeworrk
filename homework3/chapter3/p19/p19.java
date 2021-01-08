package endTermHomeWork.homework3.chapter3.p19;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if((a+b>c) && (a+c>b) && (b+c>a)){
            System.out.println(a+b+c);
        }

    }
}
