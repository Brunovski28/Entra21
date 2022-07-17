package E08ImpostoDeRenda;

public class Main {
public static void main(String[] args) {
	ImpostoRenda cliente1 = new ImpostoRenda(2500000, "Brunovski", "000.000-00", "SC", 0);
	ImpostoRenda cliente2 = new ImpostoRenda(50000, "Paulo", "000.000-00", "SC", 0);
	ImpostoRenda cliente3 = new ImpostoRenda(30000, "Matheus", "000.000-00", "SC", 0);
	ImpostoRenda cliente4 = new ImpostoRenda(10000, "Fulano", "000.000-00", "SC", 0);
	ImpostoRenda cliente5 = new ImpostoRenda(5000, "Ciclano", "000.000-00", "SC", 0);
	
	System.out.println("CLIENTE 1");
	if (cliente1.renda < 4000) {
		System.out.println("Não pagará impostos.");
	} else if (cliente1.renda > 4000 && cliente1.renda < 9001) {
		cliente1.receba = cliente1.renda * 0.058;
		System.out.println("Pagará "+cliente1.receba+" de impostos!");
	}  else if (cliente1.renda > 9000 && cliente1.renda < 25001) {
		cliente1.receba = cliente1.renda * 0.15;
		System.out.println("Pagará "+cliente1.receba+" de impostos!");
	}  else if (cliente1.renda > 25000 && cliente1.renda < 35001) {
		cliente1.receba = cliente1.renda * 0.275;
		System.out.println("Pagará "+cliente1.receba+" de impostos!");
	}  else if (cliente1.renda > 35000) {
		cliente1.receba = cliente1.renda * 0.30;
		System.out.println("Pagará "+cliente1.receba+" de impostos!");
	} 
	System.out.println("CLIENTE 2");
	if (cliente2.renda < 4000) {
		System.out.println("Não pagará impostos.");
	} else if (cliente2.renda > 4000 && cliente2.renda < 9001) {
		cliente2.receba = cliente2.renda * 0.058;
		System.out.println("Pagará "+cliente2.receba+" de impostos!");
	}  else if (cliente2.renda > 9000 && cliente2.renda < 25001) {
		cliente1.receba = cliente2.renda * 0.15;
		System.out.println("Pagará "+cliente2.receba+" de impostos!");
	}  else if (cliente2.renda > 25000 && cliente2.renda < 35001) {
		cliente2.receba = cliente2.renda * 0.275;
		System.out.println("Pagará "+cliente2.receba+" de impostos!");
	}  else if (cliente2.renda > 35000) {
		cliente2.receba = cliente2.renda * 0.30;
		System.out.println("Pagará "+cliente2.receba+" de impostos!");
	} 
	System.out.println("CLIENTE 3");
	if (cliente3.renda < 4000) {
		System.out.println("Não pagará impostos.");
	} else if (cliente3.renda > 4000 && cliente3.renda < 9001) {
		cliente3.receba = cliente3.renda * 0.058;
		System.out.println("Pagará "+cliente3.receba+" de impostos!");
	}  else if (cliente3.renda > 9000 && cliente3.renda < 25001) {
		cliente3.receba = cliente3.renda * 0.15;
		System.out.println("Pagará "+cliente3.receba+" de impostos!");
	}  else if (cliente3.renda > 25000 && cliente3.renda < 35001) {
		cliente3.receba = cliente3.renda * 0.275;
		System.out.println("Pagará "+cliente3.receba+" de impostos!");
	}  else if (cliente3.renda > 35000) {
		cliente3.receba = cliente3.renda * 0.30;
		System.out.println("Pagará "+cliente3.receba+" de impostos!");
	} 
	System.out.println("CLIENTE 4");
	if (cliente4.renda < 4000) {
		System.out.println("Não pagará impostos.");
	} else if (cliente4.renda > 4000 && cliente4.renda < 9001) {
		cliente4.receba = cliente4.renda * 0.058;
		System.out.println("Pagará "+cliente4.receba+" de impostos!");
	}  else if (cliente4.renda > 9000 && cliente4.renda < 25001) {
		cliente4.receba = cliente4.renda * 0.15;
		System.out.println("Pagará "+cliente4.receba+" de impostos!");
	}  else if (cliente4.renda > 25000 && cliente4.renda < 35001) {
		cliente4.receba = cliente4.renda * 0.275;
		System.out.println("Pagará "+cliente4.receba+" de impostos!");
	}  else if (cliente4.renda > 35000) {
		cliente4.receba = cliente4.renda * 0.30;
		System.out.println("Pagará "+cliente4.receba+" de impostos!");
	} 
	System.out.println("CLIENTE 5");
	if (cliente5.renda < 4000) {
		System.out.println("Não pagará impostos.");
	} else if (cliente5.renda > 4000 && cliente5.renda < 9001) {
		cliente5.receba = cliente5.renda * 0.058;
		System.out.println("Pagará "+cliente5.receba+" de impostos!");
	}  else if (cliente5.renda > 9000 && cliente5.renda < 25001) {
		cliente5.receba = cliente5.renda * 0.15;
		System.out.println("Pagará "+cliente5.receba+" de impostos!");
	}  else if (cliente5.renda > 25000 && cliente5.renda < 35001) {
		cliente5.receba = cliente5.renda * 0.275;
		System.out.println("Pagará "+cliente5.receba+" de impostos!");
	}  else if (cliente5.renda > 35000) {
		cliente5.receba = cliente5.renda * 0.30;
		System.out.println("Pagará "+cliente5.receba+" de impostos!");
	} 
	System.out.println("--------------------------------------------");
	if (cliente1.receba > cliente2.receba && cliente1.receba > cliente3.receba && cliente1.receba > cliente4.receba && cliente1.receba > cliente5.receba) {
		System.out.println("Cliente 1 paga mais impostos com "+cliente1.receba+"$");
	} else if (cliente2.receba > cliente1.receba && cliente2.receba > cliente3.receba && cliente2.receba > cliente4.receba && cliente2.receba > cliente5.receba) {
		System.out.println("Cliente 2 paga mais impostos com "+cliente2.receba+"$");
	}else if (cliente3.receba > cliente1.receba && cliente3.receba > cliente2.receba && cliente3.receba > cliente4.receba && cliente3.receba > cliente5.receba) {
		System.out.println("Cliente 3 paga mais impostos com "+cliente2.receba+"$");
	}else if (cliente4.receba > cliente1.receba && cliente4.receba > cliente2.receba && cliente4.receba > cliente3.receba && cliente4.receba > cliente5.receba) {
		System.out.println("Cliente 4 paga mais impostos com "+cliente2.receba+"$");
	}else if (cliente5.receba > cliente1.receba && cliente5.receba > cliente2.receba && cliente5.receba > cliente3.receba && cliente5.receba > cliente4.receba) {
		System.out.println("Cliente 5 paga mais impostos com "+cliente2.receba+"$");
	}
	if (cliente1.receba < cliente2.receba && cliente1.receba < cliente3.receba && cliente1.receba < cliente4.receba && cliente1.receba < cliente5.receba) {
		System.out.println("Cliente 1 paga menos impostos com "+cliente1.receba+"$");
	} else if (cliente2.receba < cliente1.receba && cliente2.receba < cliente3.receba && cliente2.receba < cliente4.receba && cliente2.receba < cliente5.receba) {
		System.out.println("Cliente 2 paga menos impostos com "+cliente2.receba+"$");
	}else if (cliente3.receba < cliente1.receba && cliente3.receba < cliente2.receba && cliente3.receba < cliente4.receba && cliente3.receba < cliente5.receba) {
		System.out.println("Cliente 3 paga menos impostos com "+cliente2.receba+"$");
	}else if (cliente4.receba < cliente1.receba && cliente4.receba < cliente2.receba && cliente4.receba < cliente3.receba && cliente4.receba < cliente5.receba) {
		System.out.println("Cliente 4 paga menos impostos com "+cliente2.receba+"$");
	}else if (cliente5.receba < cliente1.receba && cliente5.receba < cliente2.receba && cliente5.receba < cliente3.receba && cliente5.receba < cliente4.receba) {
		System.out.println("Cliente 5 paga menos impostos com "+cliente2.receba+"$");
	}
	double totalpago;
	totalpago = cliente1.receba + cliente2.receba + cliente3.receba + cliente4.receba + cliente5.receba;
	System.out.println("Total de impostos pago foi "+totalpago);
}
}
