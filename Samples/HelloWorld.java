package Samples;

public class HelloWorld {
	void hello() {
		System.out.println("Hello World!!!");
	}
        void welcome(){
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld obj = new HelloWorld();  //New object obj created for class HelloWorld
		obj.hello();  //Object obj calls method hello()
		obj.welcome();
	}
}
