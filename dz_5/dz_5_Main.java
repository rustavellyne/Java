package dz_5;

import java.util.Arrays;
import java.util.LinkedList;

public class dz_5_Main {
	public static void main(String [] args) {
System.out.println("#############################");
System.out.println("задание номер 1  ");
System.out.println("#############################");
		task1 t1 = new task1();
		int [] array = {0,3,3 -4, 32, 8, -45,5,5, 5, 3, 202, 18, 17,-1};
		int [] array1 = {5,5,5,5,5,5,4,5,4,5,5,5,6,7};
		Arrays.sort(array1);//сортируем
		printArray(array1); 
		int poisk =7;//поисковое значение
		System.out.println("результат поиска = "+t1.binarySearch(array1, poisk)); //вызываем метод
System.out.println("#############################");
System.out.println("задание номер 2  ");
System.out.println("#############################");


		
		
		
		
		
		
		
	
	     } //main
	static void printArray(int [] somearr) {
		for(int i=0; i<somearr.length; i++) {
			System.out.print(somearr[i]+"  ");
		}System.out.println();
		  
	  }
	} //class
		
  