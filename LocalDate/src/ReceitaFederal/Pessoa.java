package ReceitaFederal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private String cpf;
	private String uf;
	private double rendaanual;
	private LocalDate dataNasc;
	private String endereco;
	private double aliquota;
	static ArrayList<Pessoa> conta = new ArrayList<Pessoa>();

	public Pessoa(String nome, String cpf, String uf, double rendaanual, LocalDate dataNasc, String endereco) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaanual(rendaanual);
		setDataNasc(dataNasc);
		setEndereco(endereco);
		setAliquota(aliquota);
		this.conta.add(this);
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public double getRendaanual() {
		return rendaanual;
	}

	public void setRendaanual(double rendaanual) {
		this.rendaanual = rendaanual;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void conta() {
		for (int i = 0; i < conta.size(); i++) {
			if (conta.get(i).getDataNasc().getYear() > 1989) {
				if (conta.get(i).getRendaanual() < 4001) {
					double soma = (conta.get(i).getRendaanual() * 1.00) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				} else if (conta.get(i).getRendaanual() > 4000 && conta.get(i).getRendaanual() < 9001) {
					double soma = (conta.get(i).getRendaanual() * 1.058) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				} else if (conta.get(i).getRendaanual() > 9000 && conta.get(i).getRendaanual() < 25001) {
					double soma = (conta.get(i).getRendaanual() * 1.15) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				} else if (conta.get(i).getRendaanual() > 25000 && conta.get(i).getRendaanual() < 35001) {
					double soma = (conta.get(i).getRendaanual() * 1.275) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				} else {
					double soma = (conta.get(i).getRendaanual() * 1.30) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				}
			}
			if (conta.get(i).getDataNasc().getYear() < 1990) {
				if (conta.get(i).getRendaanual() < 8001) {
					double soma = (conta.get(i).getRendaanual() * 1.00) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				} else if (conta.get(i).getRendaanual() > 8000 && conta.get(i).getRendaanual() < 12001) {
					double soma = (conta.get(i).getRendaanual() * 1.058) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				} else if (conta.get(i).getRendaanual() > 12000 && conta.get(i).getRendaanual() < 25001) {
					double soma = (conta.get(i).getRendaanual() * 1.15) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				} else if (conta.get(i).getRendaanual() > 25000 && conta.get(i).getRendaanual() < 39001) {
					double soma = (conta.get(i).getRendaanual() * 1.275) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				} else {
					double soma = (conta.get(i).getRendaanual() * 1.30) - (conta.get(i).getRendaanual());
					conta.get(i).setAliquota(soma);
				}
			}

		}
		for (int i = 0; i < conta.size(); i++) {
			System.out.println("Nome: "+conta.get(i).getNome());
			System.out.println("CPF: "+conta.get(i).getCpf());
			System.out.println("UF: "+conta.get(i).getUf());
			System.out.println("Renda anual: "+conta.get(i).getRendaanual());
			System.out.println("Nascimento: "+conta.get(i).getDataNasc());
			System.out.println("Endereço: "+conta.get(i).getEndereco());
			System.out.println("Este cidadão vai pagar: "+conta.get(i).getAliquota());
			System.out.println("------------------------------------");
			System.out.println(" ");
		}
		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		int idmaior = 0;
		int idmenor = 0;
		double todos = 0;
		for (int i = 0; i < conta.size(); i++) {
			if (conta.get(i).getAliquota() > maior) {
				maior = conta.get(i).getAliquota();
				idmaior = i;
			}
			if (conta.get(i).getAliquota() < menor) {
				menor = conta.get(i).getAliquota();
				idmenor = i;
			}
			todos += conta.get(i).getAliquota();
		}
		System.out.println(conta.get(idmaior).getNome()+" pagou mais imposto!");
		System.out.println(conta.get(idmenor).getNome()+" pagou menos imposto!");
		System.out.printf("Todos impostos: %.2f$\n ",todos);
	}
}
