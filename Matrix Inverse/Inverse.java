import java.util.*;

class Inverse{
	public static void main(String[] args) {
		int i,j;
		float Arr[][]={{4,7},{2,6}};
		float det,swap_var;

		det=(Arr[0][0]*Arr[1][1]) - (Arr[0][1] * Arr[1][0]);
		System.out.println("Determinant = " +det);

		swap_var=Arr[0][0];
		Arr[0][0]=Arr[1][1];
		Arr[1][1]=swap_var;

		Arr[0][1] = -Arr[0][1];
		Arr[1][0] = -Arr[1][0];

		System.out.println("Inverted Matrix is: ");
		for(i = 0; i < 2; ++i) {
			for(j = 0; j < 2; ++j)
				System.out.print((Arr[i][j]/det) + " ");
			
			System.out.println();
		}

	}
}