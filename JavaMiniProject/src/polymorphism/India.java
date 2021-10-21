package polymorphism;

//Method Overriding

//Created a class India()
public class India {
	//Created a function Speaking() and print a message
	public void speaking() {
		System.out.println("I can speak Indian Languages");
	}

}
//created a child class Delhi() using extends keyword from parent class India.After inheriting we can access the parent class
class Delhi extends India{
	 //Method Overriding
	 
	 public void speaking() {
		 System.out.println("I can speak Hindi");
	 }
}


//created a child class Tamil Nadu() using extends keyword from parent class India.After inheriting we can access the parent class
class TamilNadu extends India{
	 //Method Overriding
	 
	 public void speaking() {
		 System.out.println("I can speak Tamil");
	 }
}
//created a child class kerala() using extends keyword from parent class India.After inheriting we can access the parent class
class kerala extends India{
	 //Method Overriding
	 
	 public void speaking() {
		 System.out.println("I can speak Malayalam");
	 }
	 
}