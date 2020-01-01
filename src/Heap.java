
public class Heap {
	int arryfinal[];
	public int[] insert(int a[])
	{
		
		
		
		int []newheap=new int[a.length+1];//code to shift each element of the array to right
		for(int i=0;i<a.length;i++)
		{
			newheap[i+1]=a[i];
		}
		int boundary=1;
		
		insert(boundary,newheap);
		return newheap;//returns the heap
		
	
	}

	private void insert(int boundary, int[] array) {
		if(boundary==array.length-1)
		{
			return;
		}
		boundary++;
		
		checkandput(boundary,array);
		insert(boundary,array);
		
		
		
		
	}

	private void checkandput(int boundary, int[] array) {
		if(boundary==1)//recursion terminating condition
		{
			return;
			
		}
		
		
		
		if(array[boundary]>array[boundary/2])//swapping function
		{
			
			int temp=array[boundary];
			array[boundary]=array[boundary/2];
			array[boundary/2]=temp;
			checkandput(boundary/2, array);
		}
		
		
				
	}

	public void delete() {
		arryfinal[1]=arryfinal[arryfinal.length-1];
		arryfinal[arryfinal.length-1]=0;
		arrange(1,arryfinal);
//		System.out.println("inside delete");
//		for(int temp:arryfinal)
//		{
//			System.out.println(temp);
//		}
//		System.out.println("inside delete");

	}

	private void arrange(int i, int[] array) {

		if(2*i>=array.length-1)
		{
		
			return;
		}
	
			if(array[2*i]>array[2*i+1])
		{
			int temp=array[i];
			array[i]=array[2*i];
			array[2*i]=temp;
			arrange(2*i,array);
		}
		else
		{
			int temp=array[i];
			array[i]=array[2*i+1];
			array[2*i+1]=temp;
			arrange(2*i+1,array);
		}
		
	}
	


}
