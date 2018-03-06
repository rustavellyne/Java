package dz_1;

//Создать программу, конвертирующую более широкий тип к более узкому. 
//Создать ситуацию, в которой часть данных более широкого типа теряется.

public class task4 {
	public static void main(String args[]) {
		double wide = 3.1415926535897932384626433832;//
		byte narrow = (byte) wide;
		System.out.println(" число Пи утратит свое значение при преобразовании с double "+wide+" в byte "+narrow);
	}
}
