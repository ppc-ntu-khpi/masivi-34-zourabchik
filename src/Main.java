import java.util.Arrays;
/** Нахождение максимального значения матрицы
* @author Katia Zourab
*/
public class Main {
	public static void main(String[] args) {

		int[][]  Matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{1,2,3,4}
				};	
		System.out.println("Матрица:");
		for(int[] row: Matrix) 
			System.out.println("\t" + Arrays.toString(row));
		
		int max; // искомое максимальное значение
		max = Matrix[0][0]; // max - один из элементов матрицы
		for (int i = 0; i < 3; i++)
		    for (int j = 0; j < Matrix[i].length; j++)
		        if (Matrix[i][j] > max)
		            max = Matrix[i][j];
		System.out.println("\nМаксимальное значение: " + max);
     }
} 