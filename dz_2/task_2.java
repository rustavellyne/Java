package dz_2;

//Написать метод, который принимает на вход массив целых чисел и
//возвращает сумму тех, которые делятся на 2 без остатка.

public class task_2 {
	public static void main(String[] args) {
		int [] arrayN = {10,-21,12,-13,11,-4};//масив целых чисел с значениями
		int sumDel2 = GetSumDiv(arrayN);
		System.out.println("сумма целых чисел масива которые делятся на 2 без остатка равна = "+sumDel2);
	}
	//описываем метод в которое запихиваем масив а возвращаем число int
public static int GetSumDiv(int [] array) {
	int result = 0;
	for (int i = 0; i < array.length; i++) { //цикл чтобы пройтись по каждому элементу масива
		if (array[i]%2==0) { // условие если результат деления по модулю равен 0(тоесть остаток будет 0) то приплюсовать в результат
			result+=array[i];
		}
	}
		return result;//возвращаем результат
		
	}
}


