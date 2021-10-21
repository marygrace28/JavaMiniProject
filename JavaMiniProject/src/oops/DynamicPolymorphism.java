package oops;

class Animal{
	//parent class
	public void move() {
		System.out.println("Animals can move");
	}
}
 
class Dog extends Animal{
	//child class
	public void move() {
		System.out.println("Dogs can walk and run");
	}
}


public class DynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Animal a = new Animal(); // Animal Reference and object
      Animal b = new Dog(); // Animal Reference but Dog Object
      a.move(); //runs the method in Animal class
      b.move();//runs the method in Dog class
	}

}
