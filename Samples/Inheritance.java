package Samples;

class Inheritance1 {
            int num1 = 50;
            Inheritance1() {
           System.out.println("New A");
  }
}
class Inheritance extends Inheritance1 {
	       int num1 = 100;
	        Inheritance() {
	    	   System.out.println("New B");
	    	   System.out.println(num1);
	    	   System.out.println(super.num1);
 /* }
}

class Inheritance { */
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance obj = new Inheritance(); 
		

	}
}
