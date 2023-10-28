//Варiант 15.

import java.util.ArrayList;
import java.util.List;

public class LabFirst2 {
	public static void main(String[] args) {
		int[] A = { 1, 2, 0, -1, 5, 4, 2, 8, 5, -5 }; // Замінити масив A.
		List<Integer> uniqueList = new ArrayList<>();

		for (int number : A) {
			if (!uniqueList.contains(number)) {
				uniqueList.add(number);
			}
		}

		System.out.println("Масив пiсля вилучення повторюючихся чисел та виведення по п'ять елементiв у рядку:");

		int count = 0;
		for (int i = 0; i < uniqueList.size(); i++) {
			System.out.print(uniqueList.get(i) + " ");
			count++;
			if (count == 5) {
				System.out.println();
				count = 0;
			}
		}
	}
}
