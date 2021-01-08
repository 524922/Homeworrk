package endTermHomeWork.homework7.problem.problem5;

import java.util.GregorianCalendar;

public class CalenderTest {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println("year: "+gregorianCalendar.get(GregorianCalendar.YEAR)+
        " month: "+gregorianCalendar.get(GregorianCalendar.MONTH)+
                " day "+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        gregorianCalendar.setTimeInMillis( 1234567898765L);
        System.out.println("year: "+gregorianCalendar.get(GregorianCalendar.YEAR)+
                " month: "+gregorianCalendar.get(GregorianCalendar.MONTH)+
                " day "+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
