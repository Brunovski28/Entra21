import java.util.Scanner;
/*
Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada.
O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual.
Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia.
A leitura deve ser finalizada com a leitura 0 para o valor da compra.*/
public class DepartamentoDesconto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int[100][4];
		int desconto = 0;
		int salvador = 0;
		int soma = 0;
		for (int i = 0; true; i++) {
			System.out.println("Qual o valor da compra?");
			int numero = entrada.nextInt();
			if (numero == 0) {
				break;
			}
			matriz[i][0] = numero;
			if (numero > 500) {
				desconto = numero;
				desconto *= 0.20;
				numero = numero - desconto;
				matriz[i][1] = numero;
			} else {
				desconto = numero;
				desconto *= 0.15;
				numero = numero - desconto;
				matriz[i][1] = numero;
			}
			soma += numero;
			salvador = i;
		}
		salvador++;
		for(int i = 0; i < salvador; i++) {
			System.out.println("Valor inicial: ["+matriz[i][0]+"] Valor com desconto: ["+matriz[i][1]+"] Valor final "
					+ "do dia: ["+soma+"]");
		}
	}

}
