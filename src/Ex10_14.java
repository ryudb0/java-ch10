import java.util.*;
import java.text.*;

public class Ex10_14 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2015년 11월 23일");
			System.out.println(d);
			System.out.println();
			System.out.println(df.format(d));
			System.out.println(df2.format(d));
		} catch (Exception e) {		}
		
		
	}
}
