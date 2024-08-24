package accessModifiers;

public class ProtectedModifiers {
	protected int age = 18;
	int height;//default variable
	
	protected void proM4() {
		System.out.println("This is protected method in public class");
	}
	
	public void proM5() {
		System.out.println("This is public Method");
	}
	
	void dM1() {//default method
		System.out.println("This is default method");
		
	}

	public static void main(String[] args) {
		
		ProModifiers proObj = new ProModifiers();
		proObj.proM1();
		System.out.println(proObj.name);
	}

}

class ProModifiers {
	protected String name = "Prema";
	protected void proM1() {
		System.out.println("This is a protected method");
		System.out.println(name);
	}
	public void M2() {
		proM1();
		
	}
}
class ProChildClass extends ProModifiers{
	public void m3() {
		proM1();
		
	}
	
}