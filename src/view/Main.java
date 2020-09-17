package view;

import controller.ThreadNum;

public class Main {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		num1 = 1;
		num2 = 2;
		num3 = 3;
		num4 = 4;
		num5 = 5;
		
		Thread tNum1 = new ThreadNum(num1);
		tNum1.start();
		Thread tNum2 = new ThreadNum(num2);
		tNum2.start();
		Thread tNum3 = new ThreadNum(num3);
		tNum3.start();
		Thread tNum4 = new ThreadNum(num4);
		tNum4.start();
		Thread tNum5 = new ThreadNum(num5);
		tNum5.start();	
		
	}
}
