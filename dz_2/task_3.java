package dz_2;

//Написать программу, которая принимает на вход двумерный массив, 
//печатает его содержимое и ничего не возвращает.
//(реализовать с помощью вложенных циклов)

public class task_3 {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		int [][] array = new int[x][y];
		int [][] array2 = new int[3][6];
		printArray(array);
		System.out.println("  ");
		printArray(array2);
	}
	public static void printArray(int [][] array) {
		
		for(int i=0; i< array.length; i++){
            for(int j=0;j < array[i].length; j++){ 
                array[i][j]=j;				      
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
}
}