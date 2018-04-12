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

UserLinkedList<User> test = new UserLinkedList<>();

User u1 = new User("Sasha","noob");
User u2 = new User("Marina","director");
User u3 = new User("Andre","editor");
User u4 = new User("Misha","producer");
User u5 = new User("Masha","pr");

test.add(u1);
test.add(u2);
test.add(u3);
test.add(u4);
test.add(null);
test.add(u5);
System.out.println(test.remove(u3));



		
		
		
		
		
		
		
	
	     } //main
	static void printArray(int [] somearr) {
		for(int i=0; i<somearr.length; i++) {
			System.out.print(somearr[i]+"  ");
		}System.out.println();
		  
	  }
	} //class
		
  