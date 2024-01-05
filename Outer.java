//Method Local Inner Class
public class Outer {
void outerMethod() {
	System.out.println("This is outer class");
	class Inner{
		public void display() {
		System.out.println("This is inner class");
	}
	}
	Inner inner=new Inner();
	inner.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Outer outer=new Outer();
        outer.outerMethod();
	}

}
