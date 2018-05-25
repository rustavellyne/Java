package dz_1;
//import java.util.Scanner;
//Написать программу, создающую три целочисленных 
//переменных с произвольными значениями, 
//и выводящую на консоль сумму трёх переменных.

class task1 {
	public static void main(String args[]) {
		//правильно ли было бы если был ввод чисел?
	/*	Scanner in = new Scanner(System.in);
	System.out.println("Введите число a - ");
		int a = in.nextInt();//обьявление первой переменной
	System.out.println("Введите число b - ");
		int b = in.nextInt(); //обьявление второй переменной
	System.out.println("Введите число c - ");
		int c = in.nextInt(); //обявление третьей переменной
	int summ=a+b+c; 
	//summ=a+b+c;
	System.out.println("сумма трех чисел = " +summ );	
	*/
		
		
	//создание 3 целых чисел с произвольными значениями в интервале [-128;127]
	
		byte a = (byte) (Math.random()*(255+1)-128);
		byte b = (byte) (Math.random()*(255+1)-128);
		byte c = (byte) (Math.random()*(255+1)-128);
		// неявное приведение в int ( не понимаю почему  не работает с short?)
		int sum = a+b+c;
		System.out.println("Сумма чисел  "+a+"  "+b+"  "+c+" = "+sum);
}
}