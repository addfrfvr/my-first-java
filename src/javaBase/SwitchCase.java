package javaBase;

public class SwitchCase {

	public static void main(String[] args) {
		int score=100;
		char level='\0';
		
		if(score>=90) {
			level='A';
		}
		else if(score>=80 &&score<90) {
			level='B';
		}else if(score>=70&&score<80) {
			level='C';
		}else if(score>=60&&score<70) {
			level='D';
		}else {
			level='E';
		}
		System.out.printf("得分等級:%c%n",level);
	}

}
