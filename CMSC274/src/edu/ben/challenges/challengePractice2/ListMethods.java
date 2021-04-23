package edu.ben.challenges.challengePractice2;

import java.util.ArrayList;
import java.util.List;

public abstract class ListMethods<T> {

	public void reverseList(List<T> list) {
		ArrayList<T> reversed = new ArrayList<T>();
		for (int i = list.size() - 1; i >= 0; i--) {
			T t = list.get(i);
			reversed.add(t);
		}
	}

	public abstract void printList(List<T> list);

}
