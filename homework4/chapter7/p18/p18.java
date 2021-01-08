package endTermHomeWork.homework4.chapter7.p18;

import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr=new double[10];
        System.out.println("please input ten numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextDouble();
        }

        System.out.println("begin sort...");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    double t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println("sorted:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
