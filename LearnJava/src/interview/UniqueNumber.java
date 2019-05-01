/* Question: Print unique # from the list
1)print unique number in output 
2) unique number and how many times it's repeated.
If once, then that's a unique number. 		
Output - 4(3 times),5(3 times),6(2 times), 9(1 time)		
*/

package interview;

public class UniqueNumber {
	public static void main(String args[]){
		int a[] = {4,5,5,5,4,6,6,9,4};
		ArrayList <Integer> al = new ArrayList<Integer>();
		for (int i = 0; i<a.length; i++)
		{
			int count = 0;
      			
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				count++;
				
				for(int j = i+1; j<a.length; j++)
				{
					if (a[i] == a[j])
					{
						count++;	
					} 
				}	
			}
		/*if (!(count == 0))
		{
      			System.out.print(a[i]+" is shown "+count+ " times");
      			System.out.println();	
		}*/
    		if (count == 1){
      		System.out.println(a[i]+" is the unique number and shows up "+count+" time.");
    		
		}

    		}
	}
}
