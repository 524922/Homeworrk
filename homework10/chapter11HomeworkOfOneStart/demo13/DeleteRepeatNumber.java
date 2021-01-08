package endTermHomeWork.homework10.chapter11HomeworkOfOneStart.demo13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DeleteRepeatNumber {
    ArrayList<Integer> list=new ArrayList<>();
    int n;
    void createList(){
        System.out.println("enter ten numbers:");
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            n=input.nextInt();
            list.add(n);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i)+",");
        }
    }
//    void deleteRepeatNum(){
//        for (int i = 0; i < list.size()-1; i++) {
//            for (int j = list.size()-1; j >i; j--) {
//                if(list.get(j).equals(list.get(i))){
//                    list.remove(j);
//                }
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.print(list.get(i)+",");
//        }
//    }
    void deleteRepeatNum(){
        HashSet<Integer> temp = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            int element=list.get(i);
            if(!temp.contains(element)) temp.add(element);
        }
        list.clear();
        list.addAll(temp);
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i)+",");
        }
    }
}
