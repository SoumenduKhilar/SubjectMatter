package Samples;

class MyThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());

	}

}
