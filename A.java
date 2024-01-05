
public class A {
    protected void divide(int a,int b) {
    	int quotient=a/b;
    	int remainder=a-(b*quotient);
    	System.out.println("Quotient :"+quotient +" Remainder :" +remainder);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a=new A();
         a.divide(765,234);
	}

}
