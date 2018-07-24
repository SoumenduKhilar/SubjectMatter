package Samples;
import java.util.ArrayList;


public class ArrayLi {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
	    al.add(1);
		al.add(2);
		al.add(3);
		al.add(4); 
		al.add(5);
		
		
	System.out.println("Content of Array List is:" +al.size());
	System.out.println(al);
	for (Integer x: al) {
		System.out.println(x);
	}
  }

}
