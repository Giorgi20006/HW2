package ge.ufc.main;

public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		/*
		Rectangle rect1 = new Rectangle();
		
		
		rect1.setDimensions(4, 6);
		
		System.out.println(rect1.getDimensions());
		System.out.println("Area: " + rect1.getArea());
		System.out.println("Parameter: " + rect1.getParameter());
		*/
		
		//3-rd task: 
		
		//Rectangle rect2;
		//rect2.setDimensions(5, 10);
		//Exception: The local variable rect2 may not have been initialized
		
		//Rectangle rect2 = null;
		//rect2.setDimensions(5, 10);
		//Exception: NullPointerException
		
		//Rectangle rect3 = new Rectangle();
		//System.out.println(rect3.getDimensions());
		//System.out.println(rect3.getArea());
		//Assigned 0s as parameters(length = 0 abd width = 0);
		
		//Rectangle rect4 = new Rectangle();
		//Rectangle rect5 = new Rectangle();
		//System.out.println(rect4==rect5);
		//false
		
		//Rectangle rect4 = new Rectangle();
		//rect4.setDimensions(8, 4);
		//Rectangle rect5 = new Rectangle();
		//rect5.setDimensions(8, 4);
		//System.out.println(rect4==rect5);
		//false
		
		//Rectangle rect4 = new Rectangle();
		//Rectangle rect5 = rect4;
		//System.out.println(rect4==rect5);
		//true
		
		//Rectangle rect4 = new Rectangle();
		//rect4.setDimensions(8, 4);
		//System.out.println(rect4.getDimensions());
		// Result: Length: 8, Width: 4
		
		//Rectangle rect5 = rect4;
		//rect5.setDimensions(10, 5);
		//System.out.println(rect4.getDimensions());
		// Result: Length: 10, Width: 5
		
		// 4-th task:
		Rectangle rect6 = new Rectangle();
		rect6.setDimensions(12, 4);
		Rectangle rect7 = new Rectangle();
		rect7.setDimensions(24, 2);
		
		System.out.println(compareObjs(rect6,rect7));
		

	}
	public static int compareObjs(Rectangle rectObj1,Rectangle rectObj2) {
		int area1 = rectObj1.getArea();
		int area2 = rectObj2.getArea();
		int x = 0;
		
		if(area1 > area2){
			x += 1;
		}
		else if(area1<area2) {
			x -=1;
		}
		return x;
	}
	
	
}
