package dz_2;

//Написать функцию, принимающую на вход целое число, 
//и возвращающую факториал данного числа. 
//Написать две версии программы(итеративную и рекурсивную).

public class task_4 {
	public static void main(String [] args) {
		
		long F = 6; //обьявляем переменную с которой и будем вычислять факториал решил использовать long хотелось double
		
	//if (F<1) {
	//		System.out.print(" для вычисления факториала введите число больше 0");
	//	}
	//	else {   здесь я пытался поставить ограничение, так как область значений факториала [1..n]
		
	long resultIF = getFactInter(F);//использование метода в котором есть значение факториала
	long resultRF = getFactRec(F);
	
	//ограничение по вычислению факториала
	if(resultIF==0 | resultRF==0) System.out.println("для вычисления факториала введите число больше  0");
		else {System.out.println("Факториал итеративным методом = "+resultIF);
			  System.out.println("Факториал рекурсивным методом = "+resultRF);}
	}
	
		
	// итеративный метод
	public static long getFactInter(long F) {
		long resultFI=1;
							// мне кажется условие правильние здесь, но как передать ошибку в return?
		 if (F<1) resultFI=0;//System.out.print(" для вычисления факториала введите число больше "+(resultFI=0));
		 
		 // else{
		 
			for(int i=2; i<=F; i++) { //можно конечно for(long i=F; i>1; i--)
				resultFI*=i;
			}//}
			return resultFI;
			}
		//рекурсивный метод
	public static long getFactRec(long F) {
		long resultRF=1;
		if (F<1) resultRF=0;
		if (F==1) return resultRF;//условие выхода чтоб не зарекурсится	
		resultRF=F*getFactRec(F-1);// здесь мы f(6) * умножаем на метод в котором факториал 5!
								   // а в том методе 5 * на метод в котором 4!, а в етом методе 4* 3! и так до 1
		return resultRF;
	}
	}


