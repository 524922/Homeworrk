package endTermHomeWork.homework4.chapter7.p31;

import java.util.Arrays;
import java.util.Scanner;

public class p31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list1 = new int[100];
        int[] list2 = new int[100];
        System.out.println("Enter list1:");
        list1[0]=scanner.nextInt();
        for (int i = 1; i <=list1[0]; i++) {
            list1[i]=scanner.nextInt();
        }
        System.out.println("Enter list2:");
        list2[0]=scanner.nextInt();
        for (int i = 1; i <=list2[0]; i++) {
            list2[i]=scanner.nextInt();
        }
        System.out.println("The merged list is:");
        int[] list3=merge(list1,list2);
        for (int i = 1; i <= (list1[0]+list2[0]); i++) {
            System.out.print(list3[i]+" ");
        }
    }
    public static int[] merge(int[] list1,int[] list2){
        int[] s=new int [2000];
        for (int i = 1; i <= list1[0]+list2[0]; i++) {
            if(i<=list1[0]){
                s[i]=list1[i];
            }else{
                s[i]=list2[i-list1[0]];
            }
        }
        Arrays.sort(s,1,list1[0]+ list2[0]+1);
        return s;
    }
}
