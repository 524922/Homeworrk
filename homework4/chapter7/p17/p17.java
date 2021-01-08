package endTermHomeWork.homework4.chapter7.p17;

import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the total number of students");
        int stuNum=scanner.nextInt();

        entity objArr[] = new entity[stuNum];

        for (int i = 0; i < objArr.length; i++) {
            objArr[i]=new entity();
            System.out.println("please input "+(i+1)+" student's name");
            String name=scanner.next();
            objArr[i].setName(name);
            System.out.println("please input "+(i+1)+" student's grade");
            long grade=scanner.nextLong();
            objArr[i].setGrade(grade);
        }

        System.out.println("start to print.....");
        for (int i = 0; i < objArr.length; i++) {
            for (int j = 0; j < objArr.length; j++) {
                if(objArr[i].getGrade()<objArr[j].getGrade()){
                    entity s = new entity();
                    s=objArr[i];
                    objArr[i]=objArr[j];
                    objArr[j]=s;
                }
            }
        }

        for (int i = 0; i < objArr.length; i++) {
            System.out.println(objArr[i].getName()+"'s grade is: "+objArr[i].getGrade());
        }

    }
}
