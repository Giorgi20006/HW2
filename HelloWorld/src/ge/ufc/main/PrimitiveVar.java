package ge.ufc.main;

public class PrimitiveVar {
	
	public static int x;
	
	

	public static void main(String[] args) {
		System.out.println(x);
		
		x = 15;
		System.out.println(x);
		System.out.println(secMeth());
		
	}
	static int secMeth() {
		int x = 20;
		return x;
	}
	

}
