import java.text.*;

public class Ex10_16 {
	public static void main(String[] args) {
		double[] limits = {60, 70, 80, 90 };
//		limits, grades간의 순서와 개수를 맞추어야한다.
		String[] grades = { "D", "C", "B", "A" };
		
		int[] score = {100, 95, 88, 70, 52, 60, 70 };
		
		ChoiceFormat form = new ChoiceFormat(limits, grades);
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i] + ":"+form.format(score[i]));
		}
		
		
	}
}
