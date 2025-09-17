package Day4;

public class Derived1 extends Base1 {
    int b,tot;
Derived1(int a, int b)
{
	super(a);
	System.out.println("Inside Derived Constructor");
	this.b=b;
}
public void sum() {
	tot=a+b;
	System.out.println("Toatal="+tot);
	
}
public static void main(String[] args) {
	Derived1 obj1=new Derived1(3,4);
	obj1.sum();
	obj1.display();
	
}
}
