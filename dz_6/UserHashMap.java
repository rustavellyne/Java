package dz_6;

public class UserHashMap<K,V> {

	private Entry<K, V> [] hashTable;  //масив ключей и значений
	private float threshold;
	private int size=0;
	private float loadFactor=0.25f;//фактор загрузки поставил маленький порог чтобы увидеть как работает
	
	 public UserHashMap() {
	        hashTable = new Entry[16]; // по умолчанию 16 мест
	        threshold = hashTable.length*loadFactor;  //загрузка
	    }

	public int getSize() {
		return size;
	}


	private class Entry<K, V>{
		private K key;
		private V value;
		private Entry<K, V> next;
		private int hash;
        
        private Entry(K key, V value, Entry<K, V> next, int hash) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.hash = hash;
        }//entry constructor	

		@Override
		public String toString() {
			return "Entry [key=" + key + ", value=" + value + "]";
		}
        
	}//class entry
	
	
	
	private int indexForTable(K key) {          //получаем индекс ячейки в таблице
		return key.hashCode() % hashTable.length;
	}
	
	public void put(K key, V value) {  //метод вставки, получаем ключ значение
		
		if (size >=threshold) {  //проверка если размер таблицы больше загруженности
			threshold *=2;   //загрузку умножаем вдвое
			arrayDoubling(); //метод переспраделение ячеек уже запсианых в большую таблицу
		}
		
		  if (key == null)  
		   System.out.println("ключ null");
		  
		  int hash=key.hashCode(); //получаем хеш ключа
		  int i = indexForTable(key);  //получаем индекс таблицы
		  for (Entry<K , V> e = hashTable[i]; e != null; e = e.next) {  //проходим циклом 
		   K k;
		   if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {  //проверяем есть ли уже точно такие записи с ключом
		    V oldValue = e.value; //если есть, то перезаписываем значение
		    e.value = value;
		   
		    System.out.println("перезапись значения "+oldValue); 
		   }
		  }

		 // size++;
		  addEntry(key, value, i, hash);  //если совпадений ключа небыло то делаем запись в таблицу
		
		  }
	
	private void arrayDoubling() { //перезапись елементов при увеличивании таблицы
		Entry<K,V> [] oldHashTable = hashTable;   //сохраняем старую таблицу
		hashTable = new Entry [oldHashTable.length*2];  //создаем новую которая вдвое больше старой
		size=0;//обнуляем размер
		for (Entry<K, V> entry : oldHashTable) {  //циклом проходимся по старой таблице ю 
			if (entry!=null) {
					put(entry.key, entry.value); //если не нулл перезаписываем в новую таблицу
				}
			}
		}
	
	
	
	private void addEntry(K key, V value, int i, int hash) {  // добавление записи
	    Entry<K,V> e = hashTable[i];  //текущее значение под индексом сохраняем
	    hashTable[i] = new Entry<>(key, value, e, hash); //перезаписываем в таблицу новое запись со ссылкой на следующий елемент, который был предыдущим
	    System.out.println("запись обьекта "+ hashTable[i]+" index hashtable "+ i);
	    size++;	
	}
	
	public V get(K key) {  //метод получения по ключу
		if (key == null)
		return null;     //если ключ нулл возарщаем нулл
		int hash = key.hashCode();  //получаем хеш ключа
		for (Entry<K,V>e=hashTable[indexForTable(key)];e!=null;e=e.next){  //циклом проходимся
		K k;
		if (e.hash == hash && ((k = e.key) == key || key.equals(k)))//если совпадение
		return e.value;  // возвращаем значение
		}
		return null;
		}

	public static void main(String [] args) {
		Cat cat1 = new Cat(1, "Kriss");
		Cat cat2 = new Cat(2, "Motya" );
		Cat cat3 = new Cat(3, "Fill");
		Cat cat4 = new Cat(2, "Boss");
		Cat cat5 = new Cat(1, "Kayly");
		Cat cat6 = new Cat(4, "Grisha");
		
		
		UserHashMap<Cat, String> test = new UserHashMap<>();
		test.put(cat1, "One");
		test.put(cat2, "Two");
		test.put(cat3, "Three");
		test.put(cat4, "Four");
		test.put(cat5, "Five");
		test.put(cat6, "Six");
		test.put(cat6, "Six_new");
		
		
		System.out.println(test.get(cat1));
		System.out.println(test.get(cat2));
		System.out.println(test.get(cat3));
		System.out.println(test.get(cat4));
		System.out.println(test.get(cat5));
		System.out.println(test.get(cat6));
		
	}//main	
}//UserHashMap

class Cat{
	int age;
	String Name;
	
	

	Cat(int age, String Name) {   // контсруктор cats
		   this.age=age;
		   this.Name=Name;
		   }//cat constructor
//переопределяем equals чтобы сравнение было и по содержимому
	  @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Cat cat = (Cat) o;

	        if (age != cat.age) return false;
	        return Name.equals(cat.Name);
	    }
//переопределяем hashcode чтобы уменьшить колизии 
	    @Override
	    public int hashCode() {
	        int result = age;
	        result = 31 * result + Name.hashCode();
	        return result;
	    }
	    @Override
		public String toString() {
			return "cat [age=" + age + ", Name=" + Name + "]";
		}
	
}//class cat
