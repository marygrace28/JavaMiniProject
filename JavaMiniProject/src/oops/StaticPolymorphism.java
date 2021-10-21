package oops;

class MyClass {
	int height;
	
	
	MyClass(){ 
		//same class name MyClass() with different methods
		System.out.println("bricks");
		height=0;
	}
	
	MyClass(int i){
		//same class name MyClass with different methods
		System.out.println("Building new house that is "+i +"feet tall");
		height=i;
	}
	
	void info() {
		//same class name info() with different parameters
		System.out.println("House is"  + height + "feet tall");
	}
	
	void info(String s) {
		//same class name info() with different parameters
		System.out.println(s+ ":House is " + height + "feet tall");
	}
}


public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyClass t = new MyClass(0);
    t.info();
    t.info("overload method");
    
    //Overloaded constructor
    new MyClass();
	}

}
