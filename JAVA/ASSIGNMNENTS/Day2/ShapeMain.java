
class C{
	int id;
	static String classType;
	static{ classType="C"; System.out.println("->C");}
	public String disp(){	return " id : "+id+" | ClassType : "+classType+" | "; }
}

class B{
	int id;
	static String classType;
	static{ classType="B"; System.out.println("->B"); }
	public String disp(){	return " id : "+id+" | ClassType : "+classType+" | "; }
}
class A{
	int id;
	static String classType;
	static{ classType="A"; System.out.println("->A"); }
	public String disp(){	return " id : "+id+" | ClassType : "+classType+" | "; }
}
public class ShapeMain{
	public static void main(String args[]){
		A a = new A(); a.id=10;
		B b = new B(); b.id=20;
		C c = new C(); c.id=30;

		System.out.println(a.disp());
		System.out.println(b.disp());
		System.out.println(c.disp());
	}
}