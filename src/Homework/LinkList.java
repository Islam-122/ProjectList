package Homework;

/**
 * @author Ислам Мухамадиев
 * 
 */

public class LinkList {
	private int size;
	private Node head;

	public LinkList() {

	}
/**
 * Добавление элемента
 * @param obj
 */
	public void add(Object obj) {
		if (head == null) {
			head = new Node(obj);
		}
	

	Node temp = new Node(obj);
	Node current = head;
	
	if(current!=null)
	{
	
		while (current.getNext() != null) {
			current = current.getNext();
		}
	
		current.setNext(temp);
	}

	
	size++;

}

/**
 * Добавление элемента по индексу
 * @param data
 * @param index
 */
public void add(Object data, int index) {
    Node temp = new Node(data);
    Node current = head;

    if (current != null) {
       
        for (int i = 0; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
    }
   
    temp.setNext(current.getNext());
    
    current.setNext(temp);
    
    size++;
}
/**
 * Возвращает элемент под указанным индексом
 * @param index
 * @return
 */
public Object get(int index) {
    if (index < 0) {
        return null;
    }
    Node current = null;
    if (head != null) {
        current = head.getNext();
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null)
                return null;
            current = current.getNext();
        }
        return current.getData();
    }
    return current;
}
/**
 * Удаляет элемент под указанным индексом
 * @param index
 * @return
 */

public boolean remove(int index) {
    
    if (index < 1 || index > size())
        return false;
    Node current = head;
    if (head != null) {
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null)
                return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        
        size--;
        return true;
    }
    return false;
}

/**
 * Возвращает количество элементов
 * @return output
 */
public int size() {
    return size;
}

public String toString() {
    String output = "";
    if (head != null) {
        Node current = head.getNext();
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
    }
    return output;
}

	public class Node {
		Node next;
		Object obj;

		public Node(Object obj) {
			next = null;
			this.obj = obj;
		}

		public Node(Object obj, Node next) {
			this.next = next;
			this.obj = obj;
		}

		public Object getData() {
			return obj;
		}

		public void setData(Object obj) {
			this.obj = obj;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
