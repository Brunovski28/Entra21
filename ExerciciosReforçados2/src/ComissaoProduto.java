import java.util.Scanner;

/*
Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o 
preço de cada produto vendido.
Cada vendedor, em um determinado mês, vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de 
pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor.
Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: 
“deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado.
*/
//Nome do vendedor, produto, preço;//matriz5 
public class ComissaoProduto { // 0 1 2 3 4
								// [Nome] [TotalDeVendas] [Salario inicial] [SalarioComComissão] [auxiliar]
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
			System.out.println("Salário do vendedor");
			matriz[i][2] = entrada.nextDouble();
			System.out.println("Quantos produtos foram vendidos?");
			matriz[i][1] = entrada.nextInt();
			for (int j = 0; j < matriz[i][1]; j++) {
				System.out.println("Qual o preço do " + (j + 1) + " produto?");
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
					+ matriz[i][2] + " e " + "salário inícial. " + matriz[i][3] + " salário com comissão");
		}
	}

}
