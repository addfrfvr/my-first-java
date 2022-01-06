package javaBase;

public class Book {
	
	String bookName;
	
	int price;
	Book(){
		
	 }
	
	 Book(String bookName,int price){
		 this.bookName=bookName;
		 this.price=price;
	 }
	 
	 public static void main(String[]args) {
		 
		 Book  book1=new  Book("香豬豬",10000);
		 Book  book2=new  Book("臭豬豬",50000000);
		 
		 System.out.println(book1.bookName);
		 
		 System.out.println(book2.bookName);
		 
		 

	     
	 }

	 
}
