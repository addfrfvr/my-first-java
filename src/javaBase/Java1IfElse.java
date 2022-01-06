package javaBase;

public class Java1IfElse {

	public static void main(String[] args) {
		int input = 7;
		float remain = input % 2;
		String a="小豬";
		String b= new String("小豬");
		System.out.println("a="+a);
		System.out.println("b="+b);
		if (a.equals(b) ) {// 餘數為1時是奇數 "小豬"="小豬"
			System.out.printf("株株", input);
		} else {
			if (remain==0) {
				System.out.printf("不是株株,是臭豬", input);
			} else {
				System.out.println("都不是那是雞雞");
			}

			System.out.println(remain);

		}
	}
}
