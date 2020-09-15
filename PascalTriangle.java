import java.util.Scanner;
public class PascalTriangle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n > 0){
			int [][] p = new int[n][];
			p[0] = new int [1];
			p[1] = new int [2];
			p[1][0] = p[1][1] = 1;
			p[0][0] = 1;
			int a = n;
			System.out.printf("%" + a + "d", p[0][0]);
			System.out.println();
			a = a - 1;
			System.out.printf("%" + a + "d " + "%d", p[1][0], p[1][1]);
			System.out.println();
			for (int i = 2; i < n; i++){
				p[i] = new int [i + 1];
				a--;
				p[i][0] = 1;
				System.out.printf("%" + a + "d ", p[i][0]);
				for(int j = 1; j < i; j++){
					p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
					System.out.printf("%d ", p[i][j]);
				}
				p[i][i] = 1;
				System.out.println(p[i][i]);
			}
		}
		else if(n < 0){
			System.out.println("Error, но конечно же Дина супер)");
			System.out.println("ghtuhgu");
		}
		else{
			System.out.println("Hello");
		}
	}
}