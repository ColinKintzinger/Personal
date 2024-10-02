import java.util.Random;

public class ArraysProgramming {
	public static void fillarray(int[][] x,int[][] y) {
		Random rand = new Random(15);
		for (int i = 0; i < 3; i++) {
			for(int c=0;c<4;c++) {
				x[i][c]= rand.nextInt(15);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for(int c=0;c<5;c++) {
				y[i][c]= rand.nextInt(15);
			}
		}
	}
	public static void multiplyarray(int[][] x,int[][] y, int[][] z) {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k <4 ; k++) {
                    z[i][j] += x[i][k] * y[k][j];
                }
            }
        }
        
	}
	
	public static void printarray(int[][] z) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(z[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Random rand= new Random();
		int[][] x = new int[3][4];
		int [][] y = new int [4][5];
		int[][] z = new int[3][5];
		int r,c;
		fillarray(x,y);
		
		multiplyarray(x,y,z);
		printarray(z);
		/*for(r=0;r<5;r++) {
			for(c=0;c<5;c++) {
				x[r][c]= rand.nextInt(9)+1;
			}
		}
		for(r=0;r<5;r++) {
			for(c=0;c<5;c++) {
				y[r][c]= rand.nextInt(9)+1;
			}
		}*/
	}

}
