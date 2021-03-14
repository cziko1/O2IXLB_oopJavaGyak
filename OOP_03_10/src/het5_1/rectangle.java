package het5_1;



public class rectangle {

	private int a;
	private int b;
	
	public rectangle (int a, int b) {
			this.a=a;
			this.b=b;
	}
	public rectangle(int a) {
		this.a=a;
		this.b=a;
	}
	
	public int getArea() {
		return a*b;
	}
	public String toString () {
		return " a: "+this.a +" b: "+this.b+" Area: "+this.getArea();
	}
	
	public void setSide(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int getA() {
		return a;
	}
	public void setA() {
		this.a=a;
	}
	public int getB() {
		return b;
	}
	public void setB() {
		this.b=b;
	}
	public boolean getBiggerArea(rectangle other) {
		if(this.getArea() > other.getArea()) {
			return true;
		}
		return false;
	}
	public boolean getAreTheseSidesSame(rectangle other) {
		if(this.a == other.a && this.a == other.b) {
			return true;
		}
		return false;
	}
	
	

}
