
public class Runner {
	public static void main(String[] args) {
		int[]a = {40,35,30,15,10,25,5} ;
		Heap h=new Heap();
		int x[]=h.insert(a);
		h.arryfinal=x;
		System.out.println("heap boundary=="+h.heapboundary);
		h.delete();
		System.out.println("heap boundary=="+h.heapboundary);
		h.delete();
//		h.delete();
	
		
		for(int temp:h.arryfinal)
		{
			System.out.println(temp);
		}
//		
	}

}
