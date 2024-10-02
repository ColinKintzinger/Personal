import java.util.Random;

public class AppRun {

	public static void main(String[] args) {
		Random rand= new Random();
		int[][] x=new int[5][5];
		int r,c;
		
		for(r=0;r<5;r++) {
			for(c=0;c<5;c++) {
				x[r][c]= rand.nextInt(9)+1;
			}
		}
		for(r=0;r<5;r++) {
			for(c=0;c<5;c++) {
				if (r==c) System.out.print(x[r][c]+" ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		for(r=0;r<5;r++) {
			for(c=0;c<5;c++) {
				if (r+c==4) System.out.print(x[r][c]+" ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		for(r=0;r<5;r++) {
			for(c=0;c<5;c++) {
				if (r+c==4 || r==c) System.out.print(x[r][c]+" ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		for(r=0;r<5;r++) {
			for(c=0;c<5;c++) {
				if (!(r+c==4 || r==c)) System.out.print(x[r][c]+" ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		for(r=0;r<5;r++) {
			for(c=0;c<5;c++) {
				if (r>c) System.out.print(x[r][c]+" ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		for(r=0;r<5;r++) {
			for(c=0;c<5;c++) {
				if (r<c) System.out.print(x[r][c]+" ");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
