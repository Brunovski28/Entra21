
public class Exercicio45 {

	public static void main(String[] args) {
		int matriz [][] = new int [2] [2];
		
		int fds = 0;
		int fd2 = 0;
		int somatoria = 0;
		
		matriz [0][0] = 4;
		matriz [0][1] = 12;
		matriz [1][0] = 2;
		matriz [1][1] = -3;

		fds = matriz[0][0] * matriz[1][1];
		fd2 = matriz[0][1] * matriz[1][0];
		
		somatoria = fds - fd2;
		
		System.out.println(somatoria);
	
		
	}

}
