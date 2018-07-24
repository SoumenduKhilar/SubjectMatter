package Samples;

class Test
{
    // This is a static method
	static int num =17;
    static void myMethod()
    {
        System.out.println("myMethod");
    }
 
    public static void main(String[] args)
    {
          /* You can see that we are calling this
           * method without creating any object. 
           */
    	  Test t = new Test();
           t.myMethod();
           System.out.println(Test.num);
    }
}