package Java_Learning;

public class TestThis {
	String name1;
	int age;
	TestThis(String name,int age){
		//this();
		this.name1=name;
		this.age=age;
		System.out.println("From Constrauctor"+name1+"====="+age);
		
	}
	TestThis(){
		//this("JimKerry");
		this("king",54);
		System.out.println("No arg Constructor");
	}
	TestThis(String a){
		System.out.println("One arguement===>"+a);
		
	}

	public static void main(String[] args) {
		
		//TestThis t1=new TestThis("Tom",25);
		TestThis t2=new TestThis();
		System.out.println("From Main Method====>"+t2.name1+"==="+t2.age);
		

	}

}
