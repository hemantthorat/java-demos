//interface
interface Message{
   String greet();	
}

abstract class AnonymousInner{
   public abstract void mymethod();
}

public class Outerclass{

 //method which accepts the object of interface Message
   public void displayMessage(Message m){
      System.out.println(m.greet() +", This is an example of anonymous inner calss as an argument");	   
   }
   
   //instance method of the outer class 
   void my_Method(){
      int num = 23;
   
      //method-local inner class
      class MethodInner_Demo{
         public void print(){
            System.out.println("This is method inner class "+num);	   
         }   
      }//end of inner class
	   
      //Accessing the inner class
      MethodInner_Demo inner = new MethodInner_Demo();
      inner.print();
   }
   
   public static void main(String args[]){
      Outerclass outer = new Outerclass();
      outer.my_Method();	   	   

      AnonymousInner inner = new AnonymousInner(){
         public void mymethod(){
            System.out.println("This is an example of anonymous inner class");    	  
         }	    
      };
      inner.mymethod();	

      //Instantiating the class
      Outerclass obj = new Outerclass();
		
      //Passing an anonymous inner class as an argument
      obj.displayMessage(new Message(){
         public String greet(){
            return "Hello";  		   
         }
      });
   }
}