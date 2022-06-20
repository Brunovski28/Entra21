import java.util.Scanner;

/*
Uma grande loja de departamentos paga aos vendedores um sal�rio com base nas vendas efetuadas durante o m�s, que � igual a 30% de comiss�o sobre o 
pre�o de cada produto vendido.
Cada vendedor, em um determinado m�s, vende n produtos, onde, para cada produto tem-se o pre�o unit�rio e a quantidade vendida. O departamento de 
pessoal deseja obter um relat�rio com: nome, total de vendas (em R$) e sal�rio de cada vendedor.
Descreva um algoritmo que gere o relat�rio desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: 
�deseja digitar os dados de mais um vendedor: s (SIM) / n (N�O)?�. O n�mero de produtos (n) de cada vendedor deve ser informado.
*/
//Nome do vendedor, produto, pre�o;//matriz5 
public class ComissaoProduto { // 0 1 2 3 4
								// [Nome] [TotalDeVendas] [Salario inicial] [SalarioComComiss�o] [auxiliar]
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double matriz[][] = new double[100][6];
		String matriz2[][] = new String[100][1];
		double somatoria = 0;
		double comissao = 0;
		int contador = 0;
		for (int i = 0; true; i++) {
			System.out.println("Nome do vendedor");
			matriz2[i][0] = entrada.next();
			if (matriz2[i][0].equals("fim")) {
				break;
			}
			System.out.println("Sal�rio do vendedor");
			matriz[i][2] = entrada.nextDouble();
			System.out.println("Quantos produtos foram vendidos?");
			matriz[i][1] = entrada.nextInt();
			for (int j = 0; j < matriz[i][1]; j++) {
				System.out.println("Qual o pre�o do " + (j + 1) + " produto?");
				double produto = entrada.nextDouble();
				System.out.println("Quantas unidades foram vendidas?");
				int unidade = entrada.nextInt();
				somatoria = produto * 0.30;
				comissao = somatoria * unidade;
				matriz[j][3] = matriz[i][2] + comissao;
			}
			contador = i;
		}
		System.out.println(contador);
		contador++;
		for (int i = 0; i < contador; i++) {
			System.out.println("Vendedor: " + matriz2[i][0] + " teve um total de " + matriz[i][1] + " vendas. "
					+ matriz[i][2] + " e " + "sal�rio in�cial. " + matriz[i][3] + " sal�rio com comiss�o");
		}
	}

}
