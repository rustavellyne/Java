package dz_5;


public class UserLinkedList<Type> {
	
	//public static void main(String [] args) {

//	}//main
	
	transient int size = 0;
	transient Node<Type> firstNode;
	transient Node<Type> lastNode;
	
	
	
 //методы из задания	
	
	boolean add(Type element) {  //добавление в конец списка.
		linkLast(element);    //вызываем метод добавления на последнне место
		return true;
	}
	
	boolean contains(Type element) {//проверка на наличие.
		return indexOf(element) != -1;      //вызываем метод и если он не равен -1 то true тоесть есть такой елемент
	}
	

	int size() { //возвращает размер списка.
		return size;
	}
	
	boolean isEmpty() { //возвращает true, если список пустой.
		return  size == 0;
            
	}
	
	boolean remove(Type element) { //удаление обьекта
		if (element == null) {  //если null то
            for (Node<Type> x = firstNode; x != null; x = x.next) { //в цикле заходим в первую ноду, у каждой ноды берем следующий елемент и так до последней ноды которая уже null будет
                if (x.element == null) { //если елемент текущей ноды равен null  то 
                    unlink(x); // тозапустить метод
                    return true; //а потом вернуть true
                }
            }
        } else {  //иначе
            for (Node<Type> x = firstNode; x != null; x = x.next) {
                if (element.equals(x.element)) {//если обьекты евивалентны
                    unlink(x);// запускаем метод
                    return true;//возврщаем true
                }
            }
        }
        return false;// если ничего не прошло то flase
	}
	// ___________________________________________
	
	//метод добавляет обьект в конец листа
	 void linkLast(Type element) {  //получаем обьект
		 final Node<Type> l = lastNode;  //создаем указатель на последнюю ноду
	        final Node<Type> newNode = new Node<>(l, element, null); //создаем новую ноду с полученым обьектом и ссылкой на обратный обьект
	        lastNode = newNode;// указываем что последння нода указывает на обьект
	        if (l == null)  // так как обьект Node создалась в первый раз, ссылка l  пустая
	            firstNode = newNode; //значит указываем что первая нода ссылается на созданый обьект 
	        else
	            l.next =newNode;  // а когда добавляем второе значение(и последущие) то уже первой ноде делаем указатель на следующий обьект, а у следуююдего обьекта уже есть информация о предидушем 
	        size++;// увеличиваем размер списка
	    }
	
	 private int indexOf(Type element) {
			int index = 0;   //отсчет с 0
	        if (element == null) { //на случай если обьект null
	            for (Node<Type> x = firstNode; x != null; x = x.next) { // цикл по нодам(от начальной ноды и до ноды null, next из одной ноды в следущую)
	                if (x.element == null) //если обьект null
	                    return index; //вернуть результат
	                index++;// увеличить значение индекса
	            }
	        } else {// иначе
	            for (Node<Type> x = firstNode; x != null; x = x.next) {
	                if (element.equals(x.element))//проверяем на еквивалентность обьект
	                    return index;//возврат результат
	                index++;
	            }
	        }
	        return -1;// если ничего не нашли то -1
		}
	 
	private Type unlink(Node<Type> x) {
	        // assert x != null;
	        final Type element = x.element; // получаем значение ноды
	        final Node<Type> next = x.next;  // ее следующую ссылку
	        final Node<Type> prev = x.prev;  // предыдущую

	        if (prev == null) {  // если предыдущая ссылка пустая то
	            firstNode = next;  //слудушая нода станет первой
	        } else {  
	            prev.next = next;// иначем следующий обьектом предыдушей ноды станет следующий обьект розлинкованой ноды
	            x.prev = null;   // свою связь на предыдущуий обьект удаляем
	        }

	        if (next == null) {  // если следущая ссылка текущей ноды null
	            lastNode = prev;// то предыдущая нода становися последней нодой
	        } else {
	            next.prev = prev;// иначе предыдущую ссылку следующей ноды присваеваем нашей предыдущей ноде
	            x.next = null;// теряем связь с следующей нодой
	        }

	        x.element = null; //убираем значение ноды
	        size--; //уменьшаем размер списка
	        
	        return element; //возвращаем  елемент
	    }
	 
	 
	// создаем калсс node
	private static class Node<Type>{
		Node<Type> prev;
		Type element;
		Node<Type> next;
	private Node(Node<Type> prev,Type element, Node<Type> next) {
		this.prev = prev;
		this.element = element;
		this.next = next;
		}//constructor	
	}//Class Node	
	
}//Class UserLinkedList



