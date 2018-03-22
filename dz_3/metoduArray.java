package dz_3;

public class metoduArray {
	
	 void PrArray(Animal[] array) {  //рапечатка масива обьектов
			for(int i=0; i < array.length; i++) {
				if (array[i]!=null) {   //если будет значение null его не распечатают
			System.out.println(array[i]+"    "+"Класс "+array[i].getClass().getSimpleName());
				array[i].voice();
				}//if
		}// loop for
	}//metod PrArray
	 /*
	 Создать метод, который из созданного в п.2 массива удалит всех котов младше 1 года или старше 8 лет,
	  а также всех собак, чьё имя содержит больше 4 согласных букв. * 
	 */
	 void FilterAn(Animal [] array) {  //метод фильтрации масива обьектов
		 for(int i=0; i <array.length;i++) {
			 if(array[i] instanceof Cat) {  //проверка на класс
				 	//достаем возраст и ставим условия с Коротким Логическим или
				 if(array[i].getAge()<1 || array[i].getAge()>8) {   
		
					System.out.println("кот удален  "+array[i]);//для наглядности роботы фильтра
					 array[i]=null;
				 }//if age
			 }//if instance cat
			if (array[i] instanceof Dog) {
				if(countSoglas(array[i].getName())>4){  //метод подсчета Гласных
					System.out.println("собака удален  "+array[i]);// для наглядности роботы фильтра
					array[i]=null; //удаление 
				}
				
			}//if instance dog
		 }//loop for
	 }//metod filterAn
	 
	 public static int countSoglas(String text) {
	 int count = 0;// счетчик
     char [] soglas = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ".toCharArray(); // инициалищация масива символов в который мы конвертируем строку
     char [] Name = text.toCharArray();  //полученый текст в символы конвертация
     for (int i = 0; i < Name.length; ++i) { //проходимся по каждой букве текста
         for (int j = 0; j < soglas.length; j++) { // прозодимся по каждой букве символьной строки
             if(Name[i] == soglas[j]) // ищем совпадения условием
                 count++; //если находим счетчик работает
         }// in loop
     }//out loop
     return count;// возврат значения счетчика
	}// metod countglass
}
