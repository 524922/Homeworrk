package endTermHomeWork.homework10.chapter11HomeworkOfOneStart.demo09;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxRowColumn {
    int n;
    double random;
    int max;
    Scanner input=new Scanner(System.in);
    ArrayList<Integer> listRow=new ArrayList<>();
    ArrayList<Integer>listCol=new ArrayList<>();
    int[][] a =new int[10][10];
    void init(){
        System.out.println("enter the n:");
        n=input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                random=(Math.random()>0.5?0:1);
                a[i][j]=(int)(random);
                if(j<n-1) System.out.print(a[i][j]+" ");
                else System.out.println(a[i][j]);
            }
        }
    }
    void findMaxRow(){
        int max=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = 0; j < n; j++) {
                if(a[i][j]==1) count++;
                if(count>max){
                    max=count;
                    listRow.clear();
                    listRow.add(i);
                }
                else if(count==max){
                    listRow.add(i);
                }
            }
        }
    }
    void findMaxCol(){
        int max=0;
        int count;
        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = 0; j < n; j++) {
                if(a[i][j]==1) count++;
                if(count>max){
                    max=count;
                    listCol.clear();
                    listCol.add(i);
                }
                else if (count==max){
                    listCol.add(i);
                }
            }
        }
    }
    void putout(){
        int listRowSize=listRow.size();
        int listColSize=listCol.size();

        System.out.print("row:");
        for (int i = 0; i < listRowSize; i++) {
            System.out.println(listRow.get(i)+",");
        }
        System.out.println();
        System.out.println("col");
        for (int i = 0; i < listColSize; i++) {
            System.out.println(listCol.get(i)+",");
        }
    }
}
