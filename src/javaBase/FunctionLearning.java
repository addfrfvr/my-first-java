package javaBase;

import java.util.ArrayList;
import java.util.List;

public class FunctionLearning {

	
	public int add(int i ,int j) {
		return i+j;
	};
	
	//寫成法
	public int adds(int i ,int j) {
		return i*j;
	};
	
	

	
	
	//回傳 開始到結束的數字集合
	public List<Integer> myArrayList(int i ,int j) {
		
		// 物件宣告的變數不要大寫開頭
		int k;	
		
		List<Integer> arrayList=new ArrayList<Integer>(); 

		for(k=i;k<j;k++) {
			
			System.out.println("裡面:"+k);
			arrayList.add(k);
		}

		return arrayList;
		
	} 
   
      
	
}
