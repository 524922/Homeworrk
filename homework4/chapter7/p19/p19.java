package endTermHomeWork.homework4.chapter7.p19;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        System.out.println("Enter list:");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] lst=new int[n];
        int flag=1;
        for (int i = 0; i < n; i++) {
            lst[i]=scanner.nextInt();
        }
        for (int i = 0; i < lst.length; i++) {
            for (int j = i; j < lst.length; j++) {
                if(lst[i]<lst[j]) flag=0;
            }
        }
        if(flag==1){
            System.out.println("The list is already sorted");
        }else {
            System.out.println("The list is not sorted");
        }
    }
}
