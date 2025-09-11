package ObjectsAndClass;

public class classobject {
	
	int a, b, c; 


classobject(int a, int b) {
    this.a = a; 
    this.b = b;
}

void add() {
    String s = "Local variable"; 
    c = a + b;
    System.out.println("Sum = " + c);
}

public static void main(String[] args) {
	classobject obj1 = new classobject(4, 5);
    obj1.add();

    classobject obj2 = new classobject(5, 6);
    obj2.add();
}
}
