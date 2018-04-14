package dz_5;

import java.util.TreeSet;

public class UserBinarySearchTree<Type> {
	
	public static void main(String[] args) {
		UserBinarySearchTree<Integer> test = new UserBinarySearchTree<>();
		System.out.println(test.add(4));
		
		test.add(5);
		test.add(2);
		test.add(3);	
		
		test.add(1);
		test.add(6);
		System.out.println(test.root.left.right.value);
		
		
		test.print();
		System.out.println("максимальное число в дереве = "+test.Max());
		System.out.println("минимальное число в дереве = "+test.Min());
		System.out.println(test.contains(4));
		
		test.remove(4);
		test.print();
		System.out.println(test.contains(4));
		System.out.println("количество елементов у дерева "+test.size());
		test.remove(10);
		test.remove(12);
		test.remove(13);
		test.remove(14);
		System.out.println("количество елементов у дерева "+test.size());
		
	}//main	
	
	Node root;   //инициализация главной ноды
	int size = 0; // переменная для счтечика

	static class Node{   //создаем класс узла которая и будет хранитлем наших данных
		int value;       // значение
		Node left;
		Node right;
		Node parent;
		
		public Node(int value,Node parent) {// конструктор узла 
			this.value = value;           
			this.parent = parent;
	
		}//конструктор	
	}//class Node
	
	 // методы из задания
	//#1   метод добавления в дерево
	boolean add(int V) {
		root=insert(root,null,V);  //в главный узел записываем через метод в который обпраляем данные
		if(root!=null) size++;                  // после добавления счетчик икремент
		return root!=null;       //если в галвный узел вернулось значение значит true
	}
	//#2
	boolean contains(int value) {       //проверяем на наличие
		 Node C = search(root, value);   //отправка наших данных на поиск
		 return C!=null;      //      если нода не пустая то true
	}
	//#3
	boolean isEmpty() {    
		return size==0;  //если size 0 то данных нету
	}
	//#4
	public int size() {   //количество добавленых значений в дерево
        return size;
    }
	
	//#5
	boolean remove(int V) {
		remove(root, V);   //удаляем елемент из дерева 
		size--;    // размер уменьшаем
		return true;
		}

	//#6
	public void print() {
        print(root);           //вызов метода рапечатки нашего дерева
        System.out.println();
    }
	
	//#7
	public int Max() {     //поиск максимаьно числа
		return rightEnd(root);  // вызываю метод для поиска самого крайнего правого узла
	}
	//#8 поиск минимального числа
	public int Min() {
		return leftEnd(root);// вызываю метод для поиска самого крайнего левого узла
	}
	
	//--------------------------------------------------
	
	
	private Node insert(Node t,Node p, int V) { // на вход получаем главную ноду, ноду родителя и значение для записи
		if (t == null) {    //если нода пустая
			t = new Node(V,p);  //то создать новую и записать значение и родителя в нее
		} else {
			if (V < t.value)   //иначе если значение меньше значения текудей ноды
				t.left = insert(t.left,t,V);  //то слева от от родителя создатся нода из рекурсивно вызваного метода где снова проверка на null
			else 								// мы как будто шаг за шагом делаем маленькие деревья
				t.right = insert(t.right,t,V);// иначе если значение больше текущего то рекурсивно добавить в правое поддерево
		}
		
		return t; //вернуть ноду 
	}
	
	Node search(Node t, int V) {
		if (t == null || t.value == V)   //если нода нул или значение ноды равна искомой
            return t;					// вернуть ноду
        if (V < t.value)				//если искомое значение меньше значения ноды
            return search(t.left, V);	// рекурсивно искать в левом поддереве
        else
            return search(t.right, V);  // рекурсивно искать в левом поддереве
	}
	
	void replace(Node a, Node b) {
        if (a.parent == null)  //если родитель null 
            root = b;          // то корневой нодой становится вторая нода
        else if (a == a.parent.left)  //иначе если нода А левая от своего родителя,
            a.parent.left = b;      // ноде А теперб б
        else
            a.parent.right = b;  //иначе ноде А теперб б
        if (b != null)          //если не пустой то поменять местами родителей
            b.parent = a.parent;
    }
	
	void remove(Node t, int V) {
        if (t == null) {          //проверка на пустой нод
        	System.out.println("такого нету");
        	size++;
            return;}
        if (V < t.value)    //если значение меньше значения переданой ноды
            remove(t.left, V); //рекурсивно удаляем из левого поддерева
        else if (V > t.value)  //иначе если значение больше значения ноды
            remove(t.right, V); //удаляем рекурсивно из правого поддерева
        else if (t.left != null && t.right != null) { //иначе если левый и правый ребенок не null
            Node m = t.right;         // указатель на правое поддерево
            while (m.left != null)  //если левый ребенок правого поддерева отсутсвует
                m = m.left;        //копируем узел  
            t.value = m.value;    // значение правого узла
            replace(m, m.right);  // меняем местами
        } else if (t.left != null) {  // иначе если левый ребенок есть 
            replace(t, t.left);     // меняемся с корневым
        } else if (t.right != null) { //иначе если правый ребенок есть
            replace(t, t.right);    // меняем местами 
        } else {
            replace(t, null);
        }
    }
	
	void print(Node t) {
        if (t != null) {  // если нода не null
            print(t.left);  //рекурсивно доходим по левой ветке до последней ноды и если там null 
            System.out.print(t.value + " "); //то распечатать значение ноды
            print(t.right); // потом рекурсия по правой ветке 
        }
    }
	
	public int rightEnd(Node N) {
		if(N.right!=null) {
		return rightEnd(N.right);// рекурсивно доходим до ноды у которой правая нода  null и  возврашаем значение текущей ноды
		}
		return N.value;
	}
	
	public int leftEnd(Node N) {
		if(N.left!=null) {      // если нода слева не null 
		return leftEnd(N.left);   // рекурсивно доходим до ноды у которой левая нода  null и  возврашаем значение текущей ноды
		}
		return N.value;  //возвращаем значение  ноды
	}
	


}//class tree
