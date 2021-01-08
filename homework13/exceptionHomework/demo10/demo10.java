package endTermHomeWork.homework13.exceptionHomework.demo10;

import java.util.ArrayList;

public class demo10 {
    public static void main(String[] args) {
        double i =123456;
        ArrayList<Double> list = new ArrayList<Double>();
        while (true){
            i++;
            try {
                list.add(i);
            }catch (OutOfMemoryError e){
                System.out.println("wrong!\n"+e);
                System.exit(1);
            }
        }
    }

}
