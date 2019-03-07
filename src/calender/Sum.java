package calender;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 입력: 키보드, 출력: 화면
		Scanner scanner = new Scanner(System.in);
		int a,b;
		String s1, s2;
		System.out.print("두 수를 입력하라: ");
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1 + ", "+ s2);

		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a + ", "+ b);
		//System.out.println("두 수의 합은" + (a+b) +"입니다");
		System.out.printf("%d와 %d의 의 합은 %d 입니다", a, b, a+b);
		
		scanner.close();
	}
}
