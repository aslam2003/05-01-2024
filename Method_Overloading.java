import java.util.Scanner;
public class Method_Overloading {
 public void name(int a) {
	 if (a<0) {
		 a=-a;
	 }
	 System.out.println(a);
 }
 public void name(Method_Overloading object,String name) {
	 String[] names= {"Raju","Sam","Siva"};
	 int[] y= {1,3,4,56};
	 for(String x:names) {
		 if (x==name) {
			 System.out.println("Valid name");
			 break;
		 }
	 }
	 
	 
 }
	public static void main(String args[]) {
		// TODO Auto-generated method stub
     Method_Overloading obj=new Method_Overloading();
     obj.name(-69);
     obj.name(obj,"Sam");
     obj.name(obj,"Rahul");
     
	}

}
