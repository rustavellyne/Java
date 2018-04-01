package dz_3;

public class maindz3 {
	public static void main (String [] args) {
		/*     задание 1 
		 Создать иерархию: супертип Animal, реализации - Dog, Cat. 
		В супертипе должен быть объявлен метод void voice(),
		в подтипах - реализовать данный метод, 
		собака должна печатать на консоль "Гав", кот - "Мяу". 
		У собак и котов должен быть возраст и имя, и методы, 
		позволяющие получать соответственно возраст и имя.
		Должна быть возможность узнать сколько всего животных было создано.*/
		
		Dog dog0 = new Dog("Дружок",1);   //создание обьектов с отправкой данных в конструтор
		Dog dog1 = new Dog("Лордерон", 2);
		Dog dog2 = new Dog("Ярикозавр", 5.5 );
		Cat cat0 = new Cat("Барсик", 1.2);
		Cat cat1 = new Cat("Мотя", 8.5);
		Cat cat2 = new Cat("Кейqси", 1.5);
		Cat cat3 = new Cat("Кейwси", 2.5);
		Cat cat4 = new Cat("Кейeси", 3.5);
		Cat cat5 = new Cat("Кеrйси", 2.5);
		Cat cat6 = new Cat("Кеtйси", 1.5);
		Cat cat7 = new Cat("Кеyйси", 0.5);
		System.out.println("#############################");
		System.out.println("задание номер 1  ");
		System.out.println("#############################");
		System.out.println("зверей создано - "+Animal.count);
		System.out.println();
		System.out.println();
		
/* задание №2
		 Создать массив животных, и добавить туда множество котов и собак.
		  Итеративно пройтись по массиву, и 
		  распечатать на консоль вид животного, его возраст и имя.
*/
	Animal [] AnArray = new Animal[6];//создаем массив обьектов
	AnArray[0] = dog0;				//инициализация 
	AnArray[1] = dog1;
	AnArray[2] = dog2;
	AnArray[3] = cat0;
	AnArray[4] = cat1;
	AnArray[5] = cat2;
	
	metoduArray print = new metoduArray();// метод вызываем из класса 
	
	System.out.println("#############################");
	System.out.println("задание номер 2  ");
	System.out.println("#############################");
     print.PrArray(AnArray); //метод распечатки масива 
     System.out.println("#############################");
 	System.out.println("задание номер 3  ");
 	System.out.println("#############################");
     print.FilterAn(AnArray);// метод фильтрации животных
     print.PrArray(AnArray);// распечатка масива после фильтрации
     System.out.println("#############################");
  	System.out.println("задание номер 4  ");
  	System.out.println("#############################");
  	Pitomnik task4 = new Pitomnik();
  	try {
  	task4.AnimalToPitomnik(dog0); //добавляем обекты через метод
  	task4.AnimalToPitomnik(dog1);
  	task4.AnimalToPitomnik(dog2);
  	task4.AnimalToPitomnik(cat0);
  	task4.AnimalToPitomnik(cat1);
  	task4.AnimalToPitomnik(cat2);
	task4.AnimalToPitomnik(cat3);
	task4.AnimalToPitomnik(cat4);
	task4.AnimalToPitomnik(cat5);
	task4.AnimalToPitomnik(cat6);
	task4.AnimalToPitomnik(cat7);	
	} catch (ArrayIndexOutOfBoundsException e) { 
        System.out.println("в питомнике 10 мест вы превышаете количество");
	}
  	task4.PrArray();
  	
  	task4.PitomnikFilter(Dog.class, 0, 3);
  	
  	task4.PitomnikFilter(Cat.class, 1, 9);
    
  	System.out.println("#############################");
  	System.out.println("задание номер 5  ");
  	System.out.println("#############################");
  	task5 taskfive = new task5();
    taskfive.Print1dArray(taskfive.cifra);
    taskfive.Print1dArray(taskfive.PreobrazArr(taskfive.cifra));
	}//public static void main
 
		
		
	

}//public class maindz3
