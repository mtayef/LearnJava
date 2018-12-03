package learnJava;
import java.util.Scanner;
import java.io.*;
public class MathClass103 {
	public static void main(String[] args) throws IOException{
		File temp = new File("C:\\Users\\Tayef\\Desktop\\file.txt");
		Scanner file = new Scanner(temp);
		System.out.println(file.nextLine());
		file.close();
	}
}
