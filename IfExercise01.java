public class IfExercise01 {
	public static void main(String[] ags) {
		double a = 34.5;
		double b = 31.0;
		if(a > 10.0 && b < 20.0) {
			System.out.println("两个数的和是:" + (a + b));
		}
		
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("可以被整除");
		} else {
			System.out.println("不可被整除");
		}
		
		int year = 2024;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}
} 