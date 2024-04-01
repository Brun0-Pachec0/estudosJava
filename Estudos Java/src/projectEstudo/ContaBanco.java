package projectEstudo;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public ContaBanco(int numConta, String dono) {
		this.numConta = numConta;
		this.dono = dono;
	}
	

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String novoTipo) {
		this.tipo = novoTipo;
	}
	
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	public void abrirConta(String tipo) {
		if (status == true) {
			System.out.println("[ERRO] Conta bancária já existe!");
		} else {
			if (tipo == "CC") {
				this.saldo = 50f;
				this.status = true;
				this.tipo = tipo;
				System.out.println("Conta Corrente criada com sucesso!");
			} else if (tipo == "CP") {
				this.saldo = 150f;
				this.status = true;
				this.tipo = tipo;
				System.out.println("Conta Poupança criada com sucesso!");
			}
		}

	}
	
	public void fecharConta() {
		if (saldo != 0) {
			System.out.println("Não foi possível fechar sua conta! Saldo precisa ser de R$00.00 reais");
		} else {
			if (status == false) {
				System.out.println("Conta bancária já se encontra desativada!");
			} else {
				this.status = false;
				System.out.println("Conta desativada com êxito!");
			}
		}
	}
	
	public void depositar(float valor) {
		if (status) {
			this.saldo += valor;
			System.out.println("Valor de R$" + valor + " adicionado com êxito!");
		} else {
			System.out.println("Não foi possível depositar. Conta se encontra desativada!");
		}

	}
	
	public void sacar(float valor) {
		if (status) {
			if (this.saldo < valor) {
				System.out.println("Não foi possível realizar o saque. Valor superior ao saldo da conta!");
			} else {
				this.saldo -= valor;
				System.out.println("Valor de R$" + valor + " sacado com êxito!");
			}
		}
	}
	
	public void pagarMensal() {
		if (this.tipo == "CC") {
			this.saldo -= 12f;
			System.out.println("Valor da mensalidade da conta corrente paga!");
		} else if (this.tipo == "CP") {
			this.saldo -= 20f;
			System.out.println("Valor da mensalidade da conta corrente paga!");
		} else {
			System.out.println("Conta inválida! Verifique o tipo da conta e tente novamente!");
		}
	}


	public void getInfosConta() {
		System.out.println("Número da conta: " + this.numConta);
		System.out.println("Tipo da conta: " + this.tipo);
		System.out.println("Nome do titular da conta: " + this.dono);
		System.out.println("Saldo da conta: R$" + this.saldo);
		System.out.println("Status da conta: " + this.status);
	}



}
