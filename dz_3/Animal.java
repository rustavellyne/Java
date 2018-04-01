package dz_3;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
//Создать иерархию: супертип Animal,в супертипе должен быть объявлен метод void voice()
//Должна быть возможность узнать сколько всего животных было создано.

abstract public class Animal {
	
	static int count; // переменная для счетчика обьявлена в статике чтобы быть членом класса, а не обьекта
	double age;		 // задаем переменную возраст (пока в дефолте не разобрался пока с приватностями)
	String name;		//	переменная для возраста   (пока в дефолте не разобрался пока с приватностями)
	
	  Animal(String name,double age ) {   // контсруктор зверей
		   this.name=name;
		   this.age=age;
		  count++; } // как только создатся обьект счетчик заработает
	
	
	String getName() { return name;}//метод получить имя
	
	double getAge()  {return age;} //метод получить Возраст
	
	@Override //нужно перезаписать метод toString который делает нам уродливую строчку
    public String toString() {
        return getClass().getSimpleName()+"   "+name + " " + age;// добавили Getclass
	}
	
	abstract public void voice() throws NotImplementedException;              // обьявление метода голос	
	
	public void dyingVoice() {}    //обьявление метода умирают голос
	      


	

	@Override    //оверайдим метод equals чтобы срaвнение было по содержанию
	public boolean equals(Object obj) {     //восопльзовался генератором eclipsa
		if (this == obj)return true;
		if (obj == null)return false;
		if (getClass() != obj.getClass())return false;
		
		Animal other = (Animal) obj;
		
		if (age != other.age)return false;
		if (name == null) {
			if (other.name != null)return false;
		} else if (!name.equals(other.name))return false;
		
		return true;
	}
	
	@Override
	protected void finalize() throws Throwable {
	    dyingVoice();
	}

	
	
    
}//class
