import java.util.*;

class MatrixMultiply{
	public static void main(String[] args) {
		int A[][]={{1,2,3},{3,4,5},{5,6,7}};
		int B[][]={{1,2,3},{3,4,5},{5,6,7}};

		int C[][]=new int[3][3];
		int i,j;

		for(i=0;i<3;i++){    
		for(j=0;j<3;j++){    
		C[i][j]+=A[i][j]*B[i][j];  
		}
		}

		for(i=0;i<3;i++){    
				for(j=0;j<3;j++){    
					System.out.print(C[i][j]+" ");    
				}    
				System.out.println(); 
			}  
	}
}