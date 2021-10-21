package polymorphism;

//Method Overloading
//Inheritance is not applied. same class name sum () different parameters
public class MethodOverloading {
	//Same class name sum() with 3 different parameters,and can be used in different ways
    public void sum(int a,int b) {
    	System.out.println(a+b);
    }
	
    public void sum(int x,int y,int z) {
    	System.out.println(x+y+z);
    }
	
    public void sum(double d,double e) {
    	System.out.println(d+e);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object
		MethodOverloading s =new MethodOverloading();
		s.sum(10,20);
		s.sum(100,200,80);
		s.sum(1.9, 2.1);

	}

}
