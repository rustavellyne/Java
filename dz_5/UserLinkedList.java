package dz_5;


public class UserLinkedList<Type> {
	
	public static void main(String [] args) {
		
		UserLinkedList<Integer> test = new UserLinkedList<>();
		
		test.add(1);
		test.add(2);
		test.add(3);
		System.out.println(test.size);
		System.out.println(test.contains(4));
		System.out.println(test.indexOf(4));
		
		System.out.println(test.size);
		
		
		//test.
		System.out.println(test.isEmpty());
		System.out.println(test.firstNode.next.next.element);
		
		
	}
	
	transient int size = 0;
	transient Node<Type> firstNode;
	transient Node<Type> lastNode;
	
	
	
 //методы из задания	
	
	boolean add(Type element) {  //добавление в конец списка.
		linkLast(element);
		return true;
	}
	
	boolean contains(Type element) {//проверка на наличие.
		return indexOf(element) != -1;
	}
	

	int size() { //возвращает размер списка.
		return size;
	}
	
	boolean isEmpty() { //возвращает true, если список пустой.
		return  size == 0;
            
	}
	
	boolean remove(Type element) { //удаление элемента.
		if (element == null) {
            for (Node<Type> x = firstNode; x != null; x = x.next) {
                if (x.element == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<Type> x = firstNode; x != null; x = x.next) {
                if (element.equals(x.element)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
	}
	// ___________________________________________
	
	


	/*private void linkFirst(Type element) {
		final Node<Type> f = firstNode;
        final Node<Type> newNode = new Node<>(null, element, f);
        firstNode = newNode;
        if (f == null)
            lastNode = newNode;
        else
            f.prev = newNode; 
        size++;
	}*/
	
	 void linkLast(Type element) {
		 final Node<Type> l = lastNode;
	        final Node<Type> newNode = new Node<>(l, element, null);
	        lastNode = newNode;
	        if (l == null)
	            firstNode = newNode;
	        else
	            l.next =newNode; 
	        size++;
	    }
	
	 private int indexOf(Type element) {
			int index = 0;
	        if (element == null) {
	            for (Node<Type> x = firstNode; x != null; x = x.next) {
	                if (x.element == null)
	                    return index;
	                index++;
	            }
	        } else {
	            for (Node<Type> x = firstNode; x != null; x = x.next) {
	                if (element.equals(x.element))
	                    return index;
	                index++;
	            }
	        }
	        return -1;
		}
	 
	 Type unlink(Node<Type> x) {
	        // assert x != null;
	        final Type element = x.element;
	        final Node<Type> next = x.next;
	        final Node<Type> prev = x.prev;

	        if (prev == null) {
	            firstNode = next;
	        } else {
	            prev.next = next;
	            x.prev = null;
	        }

	        if (next == null) {
	            lastNode = prev;
	        } else {
	            next.prev = prev;
	            x.next = null;
	        }

	        x.element = null;
	        size--;
	        
	        return element;
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
