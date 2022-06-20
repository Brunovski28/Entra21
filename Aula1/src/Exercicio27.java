import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner BS = new Scanner(System.in);
		
		int alunos, idade, i2, c;
		String nome, nome2;
		i2 = 0;
		c = 0;
		nome2 = " ";
		System.out.println("Tem quantos alunos na turma?");
		alunos = BS.nextInt();
		
		while (c < alunos) {
			System.out.println("Qual o seu nome?");
			nome = BS.next();
			
			System.out.println("Qual a sua idade?");
			idade = BS.nextInt();
			
			if (idade > 17 && idade < 20) {
				nome2 = nome2+" "+nome;
			} 
			if (idade > 19) {
				i2++;
			} 
			c = c + 1;
		}
		System.out.println("Os alunos que tem 18 anos a 20:"+nome2);
		System.out.println("Os alunos que tem mais de 20 anos: "+i2);

	}

}
