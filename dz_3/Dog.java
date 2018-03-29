package dz_3;

// В супертипе должен быть объявлен метод void voice(), в подтипах - реализовать данный метод, 
//собака должна печатать на консоль "Гав", кот - "Мяу". 
//У собак и котов должен быть возраст и имя, и методы, позволяющие получать соответственно возраст и имя

public class Dog extends Animal {//наследование
	
	public Dog(String name,double age){ //конструктор псов
		super(name,age);
		//super.name=name;        //вызов переменных супер класса
		//super.age=age;
	}
	
	
	public void voice() {       //реализация метод голос
		System.out.println("ГАВ");
	}
	
	public void dyingVoice() {       //реализация метод голос умирания
		System.out.println("увувувувувувув");
	}
	@Override
	protected void finalize() throws Throwable {
	    dyingVoice();
	}
	

}
