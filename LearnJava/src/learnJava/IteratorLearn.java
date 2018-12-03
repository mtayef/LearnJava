package learnJava;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class IteratorLearn{
	public static void main(String args[]) {
		List <Integer> list = new ArrayList<Integer>();
		List <Double> list2 = new LinkedList<Double>();
		Set<Integer> set = new HashSet<Integer>();
		Set<Double> set2 = new TreeSet<Double>();
		
		//ArrayList fill 10 integers 1 - 10
		for(int i = 0; i<10; i++) {
			list.add((int)(Math.random()*10)+1);
		}
		
		//LinkedList fill 10 doubles 0 - .99
		for(int i = 0; i<10; i++) {
			list2.add((int)(Math.random()*100)/100.0);
		}
		
		//HashSet fill 10 (As long as no duplicates) Integers 1-10
		for(int i = 0; i<10; i++) {
			set.add((int)(Math.random()*10)+1);
		}
		
		//TreeSet fill 10 (As long as no duplicates) doubles 0 - .99
		for(int i = 0; i<10; i++) {
			set2.add((int)(Math.random()*100)/100.0);
		}
		
		Iterator<Integer> it = list.iterator(); // ArrayList Iterator 
		Iterator<Double> it2 = list2.iterator(); // LinkedList Iterator 
		Iterator<Integer> it3 = set.iterator(); // HashSet Iterator
		Iterator<Double> it4 = set2.iterator(); // TreeSet Iterator
		
		System.out.println("ArrayList: ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\nLinkedList: ");
		while(it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
		System.out.println("\nHashSet: ");
		while(it3.hasNext()) {
			System.out.print(it3.next()+" ");
		}
		System.out.println("\nTreeSet: ");
		while(it4.hasNext()) {
			System.out.print(it4.next()+" ");
		}
	}
}