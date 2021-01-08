package endTermHomeWork.homework8.chapter11.demo09;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            value=scanner.nextInt();
            if(!list.contains(value)&& value!=0){
                list.add(value);
            }
        }while (value!=0);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
