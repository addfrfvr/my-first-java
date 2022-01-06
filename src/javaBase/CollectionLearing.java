package javaBase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionLearing {

	public static void main(String[] args) {
		
		//Set List queue
		List<Book> testList = new ArrayList<Book>();
		Book book = new Book();
		book.bookName = "小豬書書";
		Book book2 = new Book();
		book2.bookName = "098665751";
		testList.add(book);
		testList.add(book2);
		for(Book b:testList) {
			System.out.println(b.bookName);
		}
	
		
		List<Book> likedList = new LinkedList<Book>();
	
	}
	

}
