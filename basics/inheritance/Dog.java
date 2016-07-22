interface Animal{}

class Mammal implements Animal{}

class Vehicle{}
class Speed{}

class Van extends Vehicle{
	public Speed sp = new Speed();
} 

public class Dog extends Mammal{

   public static void main(String args[]){

      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);

	Van v = new Van();
	System.out.println(v.sp instanceof Speed);
   }
} 