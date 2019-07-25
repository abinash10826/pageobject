
public class calling_composition {
	
	public static void main(String[] args) {
		
		
		System.out.println(Device.i);
		
		System.out.println(Device.out);
		
		Device.out.print();
		Device.out.print("hello");
	}

}
