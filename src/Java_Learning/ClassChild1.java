package Java_Learning;

public class ClassChild1  {
	public void show() {
		System.out.println("SuperMostClass");
	}
	ClassChild1(){
		System.out.println("SuperMostClass");
	}
	public static void main(String[] args) {
		
ClassChild	 obj=new ClassChild();
		obj.show();
	}
}
