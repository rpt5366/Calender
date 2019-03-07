package calender;

import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {
//		일 월 화 수 목 금 토
//		--------------------
//		 1  2  3  4  5  6  7
//		 8  9 10 11 12 13 14
//		15 16 17 18 19 20 21
//		22 23 24 25 26 27 28

		System.out.println("일   월   화   수   목   금   토");
		System.out.println("------------------------");
		System.out.println("1   2   3   4   5   6  7");
		System.out.println("8   9   10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력: ");
		int month = scanner.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d월은 %d 일 까지 있습니다.\n", month, maxDays[month-1]);
		scanner.close();
		
	}

}
