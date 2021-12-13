package Labor44;
import java.util.Scanner;

	public class Laborat4{
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Введите количество элементов в массиве: ");
			int n = in.nextInt();
			int k = 0;
			System.out.print("Введите число, которое нужно удалить из массива: ");
			int x = in.nextInt();
			System.out.print("Введите массив: ");
			int[] myArray = new int[n];
			
			for(int i = 0; i < n;i++) {
				myArray[i] = in.nextInt();
			}
			
			for(int i = 0; i < n;i++) {
				if(myArray[i] == x) {
					k++;}
			}
			
			int[] A = new int[n-k];
			int j = 0;
			for(int i = 0; i < n; i++) {
				if(myArray[i] != x) {
					A[j] = myArray[i];
						j++;}
			}
			for(int i=0;i < n; i++){
				System.out.println(myArray[i]);
			}
			
			for(int i=0; i < n-k; i++){
				System.out.println(A[i]);
			}
			in.close();
		}
	}