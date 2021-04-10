import javax.swing.JOptionPane;
import java.util.*;

public class mainClass {
		
	static String BubbleSort(int[] array) {

		String txt = "";

		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > 0; j--) {
				if (array[j - 1] > array[j]) {
					int tmp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tmp;
				}
			}
				txt += array[i] + " ";
		}
			return txt;			
	}

	static String FindMinAndMax(int[] array) {
	
		int max = array[0], min = array[0];
		String txt = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

			else if (array[i] < min) {
				min = array[i];
			}
		}

			return txt += min + " and " + max;
	}

	public static void main(String[] agrs) {

		int[] array = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(1000);
		}

		String title = "Bubble sort and find the minimum and maximum elements of the array";
		String txt = "Source array: " + Arrays.toString(array) + ";\n";
		
		txt += "Sorted array: " + BubbleSort(array) + ";\n";
		txt += "Minimum and maximum elements of the array: " + FindMinAndMax(array) + ".";

		JOptionPane.showMessageDialog(null, txt, title, JOptionPane.PLAIN_MESSAGE);
	}
}