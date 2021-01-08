package endTermHomeWork.homework7.problem.problem3;


import java.util.Date;

public class demoData {
    public static void main(String[] args) {
        long l=10000;
        Date date = new Date(l);
        for (int i = 0; i < 7; i++) {
            date.setTime(l);
            printDate(l,date);
            l*=10;
        }
    }

    public static void printDate(long l,Date date){
        System.out.println(l+": "+date.toString());
    }

}
