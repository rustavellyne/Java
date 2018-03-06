package dz_1;

//Создать программу, конвертирующую более узкий тип к более широкому.


public class task3 {
	public static void main(String args[]) {
	byte uzk = 127;	
	double wide = uzk;//неявное преобразование
	int narrow = 14;
	float wides = (float)narrow;//явное преобразование
	System.out.println("неявное преобразование byte "+uzk+"  в double   "+wide+" а теперь явное преобразование int "+narrow+" в float "+wides);
	}

}
