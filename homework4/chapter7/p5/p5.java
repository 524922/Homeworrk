package endTermHomeWork.homework4.chapter7.p5;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[10];
        int[] ints1 = new int[10];
        int[] ints2 = new int[10];
        int n;
        int n1=0,n2=0;
        for (int i = 0; i < ints.length; i++) {
            n=scanner.nextInt();
            ints[n]++;
        }
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]==1){
                ints1[n1]=ints[i];
                n1++;
            }
            if(ints[i]!=1){
                ints2[n2]=ints[i];
                n2++;
            }
        }
        System.out.print("the number of distinct number is:");
        for (int i = 0; i < ints2.length; i++) {
            System.out.print(ints2[i]);
        }
        System.out.println();
        System.out.print("the distinct number are:");
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]);
        }
    }
}
