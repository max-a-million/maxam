package maxam.sort;

import java.util.ArrayList;

/**********************************************************
 * 	
 * Алгоритм сортировки пузырьком:
 * 

 * 
 *********************************************************/

public class BubbleSort {
	
	public static void apply(ArrayList<Integer> list) {
		int n = list.size();
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n - 1; j ++) {
				int a0 = list.get(j);
				int a1 = list.get(j + 1);
				if (a0 > a1) {
					list.set(j, a1);
					list.set(j + 1, a0);
				}
			}
		}
	}
}
