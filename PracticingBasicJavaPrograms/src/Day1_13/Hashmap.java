package Day1_13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Book {

	public int id;
	public String author;
	public String bookname;

	public Book(int id, String author, String bookname) {
		
		this.id = id;
		this.author=author;
		this.bookname=bookname;
		
	}

}

public class Hashmap {



	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "adi");
		hm.put(2, "adit");
		hm.put(3, "aditi");
		hm.put(4, "aditya");
		hm.put(5, "ad");
		System.out.println(hm);
		hm.putIfAbsent(2, "a");
		hm.putIfAbsent(6, "ab");
		System.out.println(hm);
		hm.replaceAll((k, v) -> "ajay");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<>();
		map.put(7, "adadada");
		map.putAll(hm);
		map.remove(1);
		map.replace(7, "yoyo");
		System.out.println(map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("=========================================================================================================");
		
		HashMap<Integer, Book> hmap = new HashMap<Integer,Book>();
		Book b1 = new Book(1, "author", "bookname");
		hmap.put(1, b1);
		System.out.println(hmap);
		for (Map.Entry<Integer, Book> mp : hmap.entrySet())
		{
			int key = mp.getKey();
			Book value = mp.getValue();
			System.out.println(key+" "+value.id+" "+value.author+" "+value.bookname);
		}
		System.out.println(hmap.equals(map));
		System.out.println(hmap.hashCode());
	}

}
