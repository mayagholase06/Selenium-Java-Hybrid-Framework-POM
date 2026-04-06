package javapackage;

public class MinArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12, 45, 7, 89, 34};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element = " + min);
    }

	}


