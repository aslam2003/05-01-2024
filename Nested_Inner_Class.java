
public class Nested_Inner_Class {
class In{
	public void display() {
		System.out.println("This is inner class");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("This is outer class");
     Nested_Inner_Class outer=new Nested_Inner_Class();
     Nested_Inner_Class.In inner=outer.new In();
     inner.display();
	}

}
