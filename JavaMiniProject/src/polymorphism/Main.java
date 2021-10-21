package polymorphism;

public class Main {
	 //Method Overriding
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Creating the object for each class
       India p1 =new India();
       India p2 =new Delhi();
       India p3 =new TamilNadu();
       India p4 =new kerala();
       
        //Acessing the method speaking() using different objects    
       p1.speaking();
       p2.speaking();
       p3.speaking();
       p4.speaking();
	}

}
//Method in the parent class speaking() overriden to child class and by changing its body