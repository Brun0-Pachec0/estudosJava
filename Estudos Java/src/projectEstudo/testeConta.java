package projectEstudo;

public class testeConta {

	public static void main(String[] args) {
		ContaBanco conta1 = new ContaBanco(2235, "Bruno Pacheco");
		
		conta1.abrirConta("CP");
		conta1.depositar(237.5f);
		conta1.sacar(200);
		conta1.pagarMensal();
		conta1.sacar(167.5f);
		conta1.fecharConta();
		conta1.getInfosConta();
	}

}
