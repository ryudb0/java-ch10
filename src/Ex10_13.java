import java.util.*;
import java.text.*;

public class Ex10_13 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 9, 3);  // 2015년 10월 3일 Month의 범위 (0~11) 
		
		Date day = cal.getTime();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf1.format(day) );
		System.out.println(sdf2.format(day) );
		System.out.println(sdf3.format(day) );
		System.out.println(sdf4.format(day) );
		
	}
}
