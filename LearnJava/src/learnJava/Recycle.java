package learnJava;

public interface Recycle {
	boolean isRecyclable();
	void recycle();
	default String throwAway() {
		String name = "implement";
		return name;
	}
}

interface Sound{
	boolean isSoundOn();
	void phoneSound();
	void tvSound();
}

class Paper implements Recycle, Sound {
	private int num;
	
	public Paper() {
		
	}
	
	public Paper(int n) {
		num = n;
	}
	
	@Override
	public boolean isRecyclable() {
		if (num !=1) 
			System.out.println("Paper is not recyclable.");
		return num == 1;
	}
	
	@Override
	public void recycle() {
		System.out.println("Paper has been recycled.");
	}

	@Override
	public boolean isSoundOn() {
		boolean soundOn = false;
		if(soundOn==true)
			return soundOn = true;
		return false;
	}

	@Override
	public void phoneSound() {
		System.out.println("Phone sound");
	}

	@Override
	public void tvSound() {
		System.out.println("Television sound");
	}
}
class Aluminium implements Recycle{
	
	@Override
	public boolean isRecyclable() {
		return true;
	}
	
	@Override
	public void recycle() {
		System.out.println("Aluminium can has been recycled.");
	}
}
class Plastic implements Recycle{
	private int num; // 2,5,7 - recyclable 1,2,3,4,6 - not recyclable
	
	public Plastic(int n) {
		num = n;
	}
	
	@Override
	public boolean isRecyclable() {
		if(num !=2 && num != 5 && num !=7)
			System.out.println("Plastic isn't recyclable.");
		return num == 2 || num == 5 || num == 7;
	}
	
	@Override
	public void recycle() {
		System.out.println("Plastic has been recycled.");		
	}
}
class Trash implements Recycle{
	@Override
	public boolean isRecyclable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void recycle() {
		// TODO Auto-generated method stub
		
	}
}