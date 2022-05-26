package ge.ufc.main;

public class Rectangle {
	int length;
	int width;
	int parameter;
	int area;
	
	public void setDimensions(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public String getDimensions() {
		String text = "Length: "+length+", Width: " + width;
		return text;
	}
	
	public int getParameter() {
		parameter = (length+width)*2;
		return parameter;
	}
	
	public int getArea() {
		area = length*width;
		return area;
	}
	
}
