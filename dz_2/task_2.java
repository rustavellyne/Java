package dz_2;

//Написать метод, который принимает на вход массив целых чисел и
//возвращает сумму тех, которые делятся на 2 без остатка.

public class task_2 {
	public static void main(String[] args) {
		int [] arrayN = {10,-21,12,-13,11,-4};
		int sumDel2 = GetSumDiv(arrayN);
		System.out.println("сумма целых чисел масива которые делятся на 2 без остатка равна = "+sumDel2);
	}
public static int GetSumDiv(int [] array) {
	int result = 0;
	for (int i = 0; i < array.length; i++) {
		if (array[i]%2==0) {
			result+=array[i];
		}
	}
		return result;
		
	}
}


