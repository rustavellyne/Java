package dz_4;
import dz_3.Animal;
import dz_3.Cat;
import dz_3.Dog;
import dz_3.fish;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DZ_4 {
	public static void main(String [] args) throws NotImplementedException {
		System.out.println("#############################");
	  	System.out.println("задание номер 1  ");
	  	System.out.println("#############################");
	  	
	  	//Сделать так, чтобы животные одинакового типа и с одинаковым возрастом и именем 
	  	//при проверке на equals были распознаны, как одинаковые.
	  	
	  	Dog dog3 = new Dog("Мухтар", 3 );
	  	Dog dog4 = new Dog("Мухтар", 3 );
	  
	  	
	  	if(dog4.equals(dog3)) {System.out.println("одно и тоже животное");}
	  	else {System.out.println("разные твари");}
	  			
	  	System.out.println("#############################");
	  	System.out.println("задание номер 2  ");
	  	System.out.println("#############################");
	  	
//Реализовать метод toString() в супертипе, 
//чтобы он печатал информацию о типе животного, возрасте и имени.
	  	
	  	System.out.println(dog3.toString());
	  	
	  	System.out.println("#############################");
	  	System.out.println("задание номер 3  ");
	  	System.out.println("#############################");
	  	//Создать реализации метода void dyingVoice() в Cat и Dog. 
	  	//Метод должен печатать на консоль звук, издаваемый животным перед смертью.
	  	//Сделать так, чтобы метод вызывался на животном перед его уничтожением сборщиком мусора. 
	  	//Спровоцировать выполнение сборщика мусора(создать очень много объектов, на которые нет ссылок). 
	  	//Убедиться, что животных слышно перед смертью.
	  	for (int i=1;i<999999;i++) {  //генеририуем
	  		new Dog("qwe", 2);
	  		new Cat("sss", 3 );
	  		//break; //поставил временно чтобы другое глянуть
	  	}
	  	
	  	System.out.println("#############################");
	  	System.out.println("задание номер 4  ");
	  	System.out.println("#############################");
	  	
	  	//Создать статический метод, который принимает на вход объект, 
	  	//и возвращает строку, содержащую имя класса данного объекта.
	  	System.out.print(name(dog3));
	  	
	  	Cat cat3 = new Cat("barsik",5);
	  	System.out.println(" "+name(cat3));
	  	
	  	System.out.println("#############################");
	  	System.out.println("задание номер 5  ");
	  	System.out.println("#############################");
	  	//Создать класс Fish, который будет наследовать Animal. 
	  	//При вызове метода voice, рыба должна выбрасывать NotImplementedException.
	  	//Добавить несколько рыб в массив с разными животными. 
	  	//Проитерироваться по массиву, и вызвать метод voice на каждом животном.
	  	//Подсчитать, сколько раз выпадет NotImplementedException, и вывести кол-во на консоль.
	  	fish fish0 = new fish("окунь",4);
	  	fish fish1 = new fish("карась",2);
	  	fish fish2 = new fish("щука",3);
	  	fish fish3 = new fish("толстолоб",6);
	  	Cat cat4 = new Cat("кейси",2);
	  	Cat cat5 = new Cat("бодя",1.5);
	  	Animal [] anim  = new Animal[7];
	  	anim[0] = dog4;
	  	anim[1] = fish0;
	  	anim[2] = cat4;
	  	anim[3] = fish1;
	  	anim[4] = cat5;
	  	anim[5] = fish2;
	  	anim[6] = fish3;
	  	
	  	int count = 0;
        for (int i = 0; i < anim.length; i++) {
            try {
                anim[i].voice();
            } catch (NotImplementedException error) {
                count++;
            }
        }
        System.out.println("молчит "+count);
    
	  	
	  	}//main
	public static String name(Object obj) {   //Class<?> я не использовал так как .getSimpleName(
  		String simpleName = obj.getClass().getSimpleName();//obj.getClass() выводит не красивую надпись
  		return simpleName;
	}
}//class
