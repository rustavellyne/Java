package dz_2;

//Написать программу, которая принимает на вход двумерный массив, 
//печатает его содержимое и ничего не возвращает.
//(реализовать с помощью вложенных циклов)

public class task_3 {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		int [][] array = new int[x][y];// обьявляем двухмерный массив
		int [][] array2 = new int[3][6]; // это я для проверки еще один обьявил
		printArray(array);   //вызов метода          
		System.out.println("  ");
		printArray(array2);
	}
	//описываем метод в котором ничего не возвращается
	public static void printArray(int [][] array) {
		
		for(int i=0; i< array.length; i++){		//цикл в котором проходимся по рядкам
            for(int j=0;j < array[i].length; j++){  //вложеный цикл проходимся по столбикам
                array[i][j]=j;				      
                System.out.print(array[i][j]+" "); // распечатка массива
            }
            System.out.println("");
        }
}
}