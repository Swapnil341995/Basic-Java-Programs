package Day1_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class student implements Comparable<student>{
	int rollno ;
	String studname ;
	
	student(int rollno,String studname){
		this.rollno = rollno;
		this.studname = studname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}
	
	public int compareTo(student st) {	
		if(st.rollno == rollno)
			return 0;
		else if(st.rollno < rollno)
			return 1;
		else 
			return -1;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}

public class Experiment {
	
	public static void main(String[] args) {
		
		student st1 = new student(1, "abc");
		student st2 = new student(2, "def");
		student st3 = new student(3, "ghi");
		student st4 = new student(4, "jkl");
		List<student> li = new ArrayList<student>();
		li.add(st1);
		li.add(st2);
		li.add(st3);
		li.add(st4);
		
		Collections.sort(li);
		
		System.out.println(li);
		
		for(student st : li) {
			System.out.println(st.rollno+" "+st.studname+" ");
		}
		
	}

}
