package maxam.sort;

import java.util.ArrayList;


/**********************************************************
 * 	
 * Алгоритм сортировки выборкой:
 * 
 * 		1. Поиск наименьшего элемента в списке.
 * 		2. Замена первого элемента в списке на найденный минимальный элемент.
 * 		3. Поиск наименьшего элемента в списке за исключением первого элемента.
 * 		4. Замена второго элемента на второе минимальное значение.
 * 		...
 * 
 *********************************************************/

public class SelectionSort {
	
	public static void apply(ArrayList<Integer> list) {
		int n = list.size();
		for (int i = 0; i < n; i ++) {
			int maxPos = i;
			int maxValue = list.get(i);
			for (int j = i; j < n; j ++) {
				int currentValue = list.get(j);
				if (currentValue > maxValue) {
					maxValue = currentValue;
					maxPos = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(maxPos));
			list.set(maxPos, temp);
		}
	}
}
