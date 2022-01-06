package javaBase;

import java.util.ArrayList;
import java.util.List;

public class GetFunctionLearning {

	public static void main(String[] args) {
		
		FunctionLearning fl = new FunctionLearning();
		int result = fl.add(1, 2);
		
		System.out.println("fl add result:"+result);
		
		FunctionLearning f2 = new FunctionLearning();
		int result1 = f2.adds(1, 2);
		
		System.out.println("fl adds result1:"+result1);
	    
		//先實體化再拿方法

		List<Integer> result3=f2.myArrayList(1, 10);
		
		for(Integer gf3:result3) {
			System.out.println("外面:"+gf3);
			
		}
		
	}

}
