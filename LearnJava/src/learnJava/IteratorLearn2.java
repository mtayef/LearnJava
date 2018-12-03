package learnJava;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorLearn2{
	public static void main(String args[]) {
		List <Integer> list = new ArrayList<Integer>();
		
		//ArrayList fill 10 integers 1 - 10
		for(int i = 0; i<10; i++) {
			list.add((int)(Math.random()*10)+1);
		}
		
		System.out.println("ArrayList: ");
		for(Iterator<Integer> i = list.iterator(); i.hasNext();) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
	}
}