package maxam.test;

import maxam.sort.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> L1 = getData();
		SelectionSort.apply(L1);
		
		ArrayList<Integer> L2 = getData();
		SelectionSort.apply(L2);
		
		ArrayList<Integer> L3 = getData();
		L3 = MergeSort.apply(L3);
		
		ArrayList<Integer> L4 = getData();
		QuickSort.apply(L4, 0, L4.size() - 1);
		
		System.out.println("done");
	}

	public static ArrayList<Integer> getData() {
		ArrayListUnsorted<Integer> L = new ArrayListUnsorted<Integer>();
		L.a(9).a(90).a(-190).a(290).a(390).a(-390).a(45).a(6);
		return L;
	}

}
