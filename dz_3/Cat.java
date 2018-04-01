package dz_3;

public class Cat extends Animal { //класс кота наследует класс зверей
	
	public Cat(String name, double age){ //конструктор котов, где должны задать
		super(name,age);
		//super.name=name;			// имя в типе стринг
	//	super.age=age;			// возраст в типе дабл
	}
	
	
	
	public void voice() {       //реализация метод голос
		System.out.println("МЯУ");
	}
	public void dyingVoice() {    //реализация метод голос умирания
		System.out.println("вииискааасссс");
	}}
	
