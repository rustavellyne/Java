package dz_2;

//Написать метод, который получает на вход 3 числа 
//и возвращает сумму лишь положительных из них.
//К примеру, на вход 1, 100, -2 = 101(-2 - отрицательное).
public class task_1 { 
	public static void main(String[] args) {
	int x = -1000;
	int y = 1;
	int z = 2;
    int result = getPosSum(x,y,z); //вызов метода
    
    System.out.println("результат положительных чисел = "+result);
}
	// описываем метод
public static int getPosSum(int x, int y, int z) {
	if (x<0) {  // условия где отбрасываются отрицательыне чисал
		x=0;
	}if (y<0) {
		y=0;
	}if (z<0) {
		z=0;	
	}
    return x+y+z; //  возврат значения 
}
}
