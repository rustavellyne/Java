package dz_1;

//Запомнить 8 примитивных типов данных, их свойства и особенности. 
//Создать по одной переменной каждого типа.

public class task5 {
	public static void main(String args[]) {
		//примитивный целочисельный тип данных
		byte b = 127; 
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775807L;
		
		//примитивный тип с плавающей точкой
		
		float f =3.4e+38f;
		double d = 1.7e+308;
		
		//логический тип
		
		boolean boo = true;
		
		//символ тип данных
		
		char symbol = '￿';
		
		System.out.println("целочисельный тип данных byte, размер 8 бит, диапазон -128;"+b);
		System.out.println("целочисельный тип данных short, размер 16 бит, диапазон -32768;"+s);
		System.out.println("целочисельный тип данных int, размер 32 бит, диапазон -2147483648;"+i);
		System.out.println("целочисельный тип данных long,  размер 64 бит, диапазон -9223372036854775808;"+l);
		System.out.println("тип данных дробные float, размер 32 бит, диапазон -1.4e-45f;"+f);
		System.out.println("тип данных дробные double, размер 64 бит, диапазон -4.9e-324;"+d);
		System.out.println("логический тип данных boolean, размер 1 бит, может быть только false или  "+boo);
		System.out.println("тип данных символ char, размер 16 бит диапазон 0 - "+Integer.valueOf(symbol));
	}

}
