package dz_3;

import java.util.ArrayList;

/*Создать класс питомник, который будет хранить массив животных. 
Реализовать метод по добавлению животных в питомник, 
а также по получению всех животных по типу и диапазону лет включительно
(метод должен принимать три аргумента - тип животного, число,
соответствующее старту диапазона и число, соответствующее его концу).
*/
public class Pitomnik {
	ArrayList <Animal> PitomnikD = new ArrayList<>();
	
	private Animal [] pitomnik = new Animal [10];// создаем масив зверей 
	private static int N = 0; //переменная для счетчика индекса масива животных
	
	
	
	void AnimalToPitomnik(Animal Animal) {	//метод добавления обьектов
		if (N < pitomnik.length) {
        pitomnik[N] = Animal;    //животное добавляется на 0 позицию
        N++;}
        // при добавлению следуюшего счтетчик работает
		}//addtopitomnik

	void PrArray() {
		System.out.println();
		System.out.println("в питомнике всего "+pitomnik.length+ " мест");
		System.out.println("животные добавлены  ");
		System.out.println();
		for(int i=0; i < pitomnik.length; i++) {
			if(pitomnik[i]!=null)
		System.out.println(pitomnik[i]);
			}//loop j
		}//prarray
	
	void PitomnikFilter(Object pet,double start, double finish) { //метод фильтрации где получаем обьект и начальные и конечные результаты диапазона
		System.out.println();
		System.out.println("выборка животных ");
		
		for(int i=0; i<pitomnik.length; i++) {
			if (pitomnik[i]!=null) {
				if(pitomnik[i].getClass().equals(pet)) {// условие совпадения по классу, Instanceof тут не работает
					if (pitomnik[i].getAge()>=start && pitomnik[i].getAge()<=finish) { //проверка попадания возраста в диапазон
						System.out.println(pitomnik[i]);
					}
			      }
			}
		}//loop for
	}//pitomnikFilter
}//class
