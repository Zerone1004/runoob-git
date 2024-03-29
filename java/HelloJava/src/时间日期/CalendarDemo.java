package 时间日期;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2009, 6, 12);
        System.out.println(c1.getTime());
        c1.set(Calendar.DATE, 10);
        System.out.println(c1.getTime());
        System.out.println(c1.get(Calendar.YEAR));
        c1.set(Calendar.YEAR, 2008);
        System.out.println(c1.getTime());
    }
}
