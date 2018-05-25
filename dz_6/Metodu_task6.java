package dz_6;

import java.util.HashMap;
import java.util.HashSet;


/*Написать метод, который принимает на вход строку 
и подсчитывает кол-во уникальных символов в строке.* 
использовать структуру данных из Collection framework.

Написать метод, который принимает на вход строку, 
и подсчитывает кол-во вхождений каждого из символов в строке.* 
использовать структуру данных из Collection framework.*/
public class Metodu_task6 {

	public static void main(String [] args) {
		String stroka = "mama";
		Metodu_task6 test = new Metodu_task6();
		test.countUniqAll(stroka);
		test.countUniqSigns(stroka);
	} 
	
	void countUniqAll(String stroka) {
		HashSet<Character> uniq = new HashSet<>();
		for(char i:stroka.toCharArray()) {
			uniq.add(i);
		}
		System.out.println("количество уникальных символов в строке = "+ uniq.size());	
	}
	
	void countUniqSigns(String stroka) {
		HashMap<Character, Integer> uniq = new HashMap<>();
		for(char i:stroka.toCharArray()) {
			if(uniq.containsKey(i)) {
				uniq.put(i, uniq.get(i)+1);
			}else uniq.put(i, 1);
		}
		for (HashMap.Entry<Character, Integer> entry : uniq.entrySet()) {
		    System.out.println("Символ: " + entry.getKey() + " количество вхождений "
		        + entry.getValue());
		}
	}
	
	
}
