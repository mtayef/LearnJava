package learnJava;
import java.io.File;
import java.util.Scanner;
public class ScanPractice {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(new File("C:\\Users\\Tayef\\Desktop\\file.txt"));
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i<n; i++) {
			int sum = 0; 
			int count = 0;
			String split[] = scan.nextLine().split(" ");
			for(int j=0; j<split.length; j++) {
				sum += Integer.parseInt(split[j]);
				count++;
			}
			System.out.println("Average is: "+(double)sum/count);
		}
		scan.close();
	}

}
