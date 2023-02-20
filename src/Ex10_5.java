import java.util.*;

public class Ex10_5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 0, 31);  	// 2015년 1월 31일 
		System.out.println(toString(date));
//		roll() 메서드는 다른필드에 영향을 안미치지만 date가 말일일때 월마다 말일이 달라서 
//		변한 월에 말일로 변경이된다. add()는 다른필드에 영향을 미치지만 이런경우 똑같이 동작한다.
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));  // 2015년 2월 28일
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1) +"월 "+date.get(Calendar.DATE)+"일";
	} 
}
