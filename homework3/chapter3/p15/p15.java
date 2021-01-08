package endTermHomeWork.homework3.chapter3.p15;

import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println("please input three numbers");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int bonus=0;
        if(a==1 && b==2 && c==3){
            bonus=10000;
        }
        else if(a==1 ||a==2||a==3 &&b==1 ||b==2||b==3 && c==1 ||c==2||c==3){
            bonus=3000;
        }else {
            bonus=1000;
        }
        System.out.println(bonus);

    }
}
