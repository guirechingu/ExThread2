package controller;

public class ThreadNum extends Thread{
	private int num;
	public ThreadNum(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		printNum(num);
	}
	
	private void printNum(int num) {
		System.out.println(num);
	}
}
