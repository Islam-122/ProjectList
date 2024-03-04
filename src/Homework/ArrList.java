package Homework;


/**
 * @author Ислам Мухамадиев.
 * @param <T>
 */
public class ArrList<T> {
	private Object[] arr;
	private int size;
	private int backup;

	public ArrList() {
		arr = new Object[backup = 10];
	}

	/**
	 * Добавление элемента.
	 * 
	 * @param obj
	 */
	public void add(T obj) {
		plusSize();
		arr[size++] = obj;
	}

	/**
	 * Добавление элемента по индексу
	 * 
	 * @param index
	 * @param obj
	 */
	public void add(int index, T obj) {
		plusSize();
		for (int i = size; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = obj;
		size++;
	}

	/**
	 * Замена элемента по индексу
	 * 
	 * @param index
	 * @param obj
	 */
	public void set(int index, T obj) {
		arr[index] = obj;
	}

	/**
	 * Возвращение элемента
	 * 
	 * @param index
	 * @return Возвращает элемент по индексу
	 */
	public T get(int index) {
		return (T) arr[index];
	}

	/**
	 * Удаление элемента по индексу
	 * 
	 * @param index
	 */
	public void delete(int index) {

		plusSize();
		for (int i = index; i < size; i++) {

			arr[i] = arr[i + 1];
		}
		size--;
	}

	/**
	 * Размер листа
	 * @return
	 */
	public int size() { 
		return size;
	}
/**
 * Проверка заполнения
 * @return
 */
	public boolean isEmpty() { 
		if (size == 0) {
			return true;
		} else
			return false;
	}
/**
 * Вывод массива в строку
 */
	public void display() {
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i] + ", ");

		}
		System.out.println("]");
	}
/**
 * Удаление всего массива
 */
	public void clear() { 
		arr = new Object[backup];
		for (int i = size; i > 0; i--) {
			size--;
		}
	}
/**
 * Увеличение размера массива, путем создания нового
 */
	public void plusSize() { 
		if (size == backup) {
			backup *= 1.5;
			Object[] arr2 = new Object[backup];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr = arr2;
			System.out.println(backup);
		}
	}
}
