package dz_3;

import java.util.Arrays;
import java.util.Random;

//Создать метод, принимающий на вход массив, и возвращающий массив содержащий 
//в качестве индексов значения входного массива, а в качестве значений - кол-во вхождений 
//данного элемента во входном массиве.
//Значения входного массива не могут быть меньше 0 или больше 100.

public class task5 {
	
		
	int [] cifra = {5,3,7,3,1,9,2,9,0,4,9};
	             //[5]
	static int max;
	int [] NewArr(int size) {   // создание масива
		int [] array = new int[size];
		//System.out.println("Входящий масив ");
		Random r = new Random();
		int Low = 0;
		int High = 10;//  верхнюю границу я уменьшил до 10 так как чтобы увидеть результат нужно создавать масив в 100 елементов
		for(int i = 0; i<size;i++) {
			array[i]=r.nextInt(High-Low) + Low;  //инициализация случайными числами
		}
		return array; //возврат масива
	}
	 //int findMax(int [] array) {
	 //       Arrays.sort(array);
	  //      max = array[array.length - 1];
	  //      return max+1;
	  //  }
	/*
	public  int [] PreobrazArr(int [] array) { //преобразование масива
		System.out.println("Исходящий масив ");
		Arrays.sort(array);
		max = array[array.length - 1];
		     max=max+1;
		int[]PreArr = new int [max]; // игициализация нового масива куда запишем новые значения
		for(int i = 0; i<max;i++) {  // цикл исходящего масива
			int count=0;                      // счетчик подсчета повторений
			for(int j=0;j<array.length;j++) {  // цикл входящего масива
				if(array[j]==i) {count++;}// если значение вход масива равно индексу исход масива, счетчик +1
			}//loop in  		    конец масива передача управления циклу исходящего масива
			PreArr[i]=count; // где значению присваеватся количество повторений
		}//loop out
		return PreArr;
	}//metod
	*/
	public  int [] PreobrazArr(int [] array) { //преобразование масива
		System.out.println("Исходящий масив ");
		Arrays.sort(array);
		max = array[array.length - 1];
		     max=max+1;
		int[]PreArr = new int [max]; // игициализация нового масива куда запишем новые значения
		for (int i = 0; i< array.length;i++) {
			PreArr[array[i]]+=1;
		}
		return PreArr;
	}//metod
	
	
	void Print1dArray(int [] arr) {
	
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}//class
