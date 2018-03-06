package dz_1;

//Создать переменную с произвольным символом. 
//Конвертировать символ в число, и вывести результат на консоль.  

public class task2 {
	public static void main(String args[]) {
		char symbol = 'A';
		int conv = symbol;//неявное преобразование
		int yavnConv=Integer.valueOf(symbol);// неявная конвертация
		System.out.println("символ "+"\'"+symbol+ "\'"+" преобразовывается в  "+conv+" неявная конвертация  "+yavnConv);
	}
}
