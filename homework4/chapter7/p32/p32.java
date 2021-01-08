package endTermHomeWork.homework4.chapter7.p32;

import java.util.Scanner;

public class p32 {
    static int n;
    static int b;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int maxn = 10000;
        n = input.nextInt()-1;
        int [] a = new int[maxn];
        b = input.nextInt();
        for(int i = 0;i < n;++ i){
            a[i] = input.nextInt();
        }
        System.out.print("After the partition,the list is ");
        partition(a);
    }
    public static void partition(int[] list){
        for(int i = 0;i < n;++i){
            if(list[i] <= b){
                System.out.print(list[i]+" ");
            }
        }
        System.out.print(b+" ");
        for(int i = 0;i < n;++i){
            if(list[i] > b){
                System.out.print(list[i]+" ");
            }
        }
    }
}
