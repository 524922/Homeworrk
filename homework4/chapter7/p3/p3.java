package endTermHomeWork.homework4.chapter7.p3;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[10];
        int n;
        int max=0;
        for (int i = 0; i < ints.length; i++) {
            n=scanner.nextInt();
            if(n>max){
                max=n;
            }
            if(n==0) break;
            ints[n]++;
        }

        for (int i = 0;i<=max; i++) {
            if(ints[i]!=0){
                if(ints[i]==1){
                    System.out.println(i+ " occurs "+ ints[i]+" time");
                }
                System.out.println(i+ " occurs "+ ints[i]+" times");
            }
        }
    }
}
