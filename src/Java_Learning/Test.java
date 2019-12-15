package Java_Learning;
 class ClassParent extends ClassChild1{
	public void show() {
		System.out.println("Parent Class");
	}
	ClassParent(int x){
		super();
		System.out.println("Parent Class Constructor"  +x);
	}
	ClassParent(){
		//super();
		System.out.println("Parent Class Constructor");
	}
}
 class ClassChild extends ClassParent {
	  
		public void show() {
			System.out.println("Child Class");
		}
		ClassChild(int y){
			super(10);
			System.out.println("Child`Class constructor"+y);
		}
		ClassChild(){
			
		}
}
public class Test {

	public static void main(String[] args) {
		ClassChild	 obj=new ClassChild();
		ClassChild	 obj1=new ClassChild(10);
		obj.show();
		

	}

}
