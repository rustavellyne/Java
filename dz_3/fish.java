package dz_3;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
public class fish extends Animal  {

	public fish(String name, double age) {
		super(name, age);
	}
	public void voice() {       //реализация метод голос
		throw new NotImplementedException();
	}

}
