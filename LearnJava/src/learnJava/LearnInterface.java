package learnJava;

import java.util.ArrayList;

public class LearnInterface{
	public static void main(String args[]) {
		Recycle p = new Paper(1);
		Recycle p2 = new Paper(2); // not recyclable
		Recycle p3 = new Paper(1);
		Paper paper = new Paper();
		
		Recycle a = new Aluminium();
		Recycle a2 = new Aluminium();
		
		Recycle p0 = new Plastic(2);
		Recycle p02 = new Plastic(3); // not recyclable
		Recycle p03 = new Plastic(7);
		
		/*Trash t = new Trash();
		Trash t2 = new Trash();*/
		
		//ArrayList<Object> cycle = new ArrayList<Object>();
		ArrayList<Recycle> cycle = new ArrayList<Recycle>();
		
		cycle.add(p);
		cycle.add(p2);
		cycle.add(p3);
		cycle.add(a);
		cycle.add(a2);
		cycle.add(p0);
		cycle.add(p02);
		cycle.add(p03);
		/*cycle.add(t);
		cycle.add(t2);*/
		
		for(int i = 0; i<cycle.size(); i++) {
			if(cycle.get(i) instanceof Paper) {
				Paper p1 = (Paper)cycle.get(i);
				if(p1.isRecyclable())
					p1.recycle();
			}
			else if(cycle.get(i) instanceof Aluminium) {
				Aluminium a1 = (Aluminium)cycle.get(i);
				if(a1.isRecyclable()) {
					a1.recycle();
				}
			}
			else if (cycle.get(i) instanceof Plastic) {
				Plastic p01 = (Plastic)cycle.get(i);
				if(p01.isRecyclable()) {
					p01.recycle();
				}
			}
			else {
				System.out.println("Not recyclable.");
			}
		}
		System.out.println("<==================================>");
		
		for(int i = 0; i<cycle.size(); i++) {
				if(cycle.get(i).isRecyclable()) {
					cycle.get(i).recycle();
				}
		}
		System.out.println(paper.throwAway());
	}
}