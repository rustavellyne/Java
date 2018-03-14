package dz_2;

public class task3_1 {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int [][] array = new int[x][y];// обьявляем двухмерный массив
		
		for(int i=0; i< array.length; i++){		//цикл в котором проходимся по рядкам
            for(int j=0;j < array[i].length; j++){  //вложеный цикл проходимся по столбикам
                array[i][j]=j;						//присваиеваем значения переменным масива
		
		 }}            
		printArray(array);//вызов метода
	}
	//описываем метод в котором ничего не возвращается
	public static void printArray(int [][] arr) {
		for(int x=0; x< arr.length; x++){		
            for(int y=0;y < arr[x].length; y++){
                System.out.print(arr[x][y]+" "); // распечатка массива
                
	}
            System.out.println();	
}}}
         

