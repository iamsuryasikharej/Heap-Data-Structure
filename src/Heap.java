
public class Heap {
	int arryfinal[];
	int heapboundary;
	//inserting functions
	public int[] insert(int a[])
	{
		
		
		
		int []newheap=new int[a.length+1];//code to shift each element of the array to right
		for(int i=0;i<a.length;i++)
		{
			newheap[i+1]=a[i];
		}
		int boundary=1;
		
		insert(boundary,newheap);
		heapboundary=newheap.length-1;

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
	
	
	
	//deleting function
	public void delete()
	{
		heapboundary=delete(arryfinal,heapboundary);
		
	}

	private int delete(int[] arryfinal, int heapboundary) {
		arryfinal[1]=arryfinal[heapboundary];
		arryfinal[heapboundary]=0;
		
		
		
		
		heapboundary--;
		arrange(arryfinal,heapboundary,1);
		return heapboundary;
	}

	private void arrange(int[] arryfinal, int heapboundary,int i) {
		if(2*i>heapboundary)
		{
			return;
		}
		else if(2*i==heapboundary)
		{
			if(arryfinal[2*i]>arryfinal[i])
			{
				int temp=arryfinal[i];
				arryfinal[i]=arryfinal[2*1];
				arryfinal[2*i]=temp;
				
				return;
			}
			else
			{
				return;
			}
		}
		
		else if(arryfinal[2*i]>arryfinal[2*i+1]&&arryfinal[2*i]>arryfinal[i])
		{
			
			int temp=arryfinal[i];
			arryfinal[i]=arryfinal[2*i];
			arryfinal[2*i]=temp;

			arrange(arryfinal, heapboundary, 2*i);
		}
		else if(arryfinal[2*i+1]>arryfinal[2*i]&&arryfinal[2*i+1]>arryfinal[i])

		{
			int temp=arryfinal[i];
			arryfinal[i]=arryfinal[2*1+1];
			arryfinal[2*i+1]=temp;
		
			arrange(arryfinal, heapboundary, 2*i+1);
		}
		
		
	}

	


}
