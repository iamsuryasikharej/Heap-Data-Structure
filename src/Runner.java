
public class Runner {
	public static void main(String[] args) {
		int[]a = {40,35,30,15,10,25} ;
		Heap h=new Heap();
		int x[]=h.insert(a);
		h.arryfinal=x;
		h.delete();
//		h.delete();
//		h.delete();
//		h.delete();
//		h.delete();
//		h.delete();
//		h.delete();
		
		for(int temp:h.arryfinal)
		{
			System.out.println(temp);
		}
		
	}

}
