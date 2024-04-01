package projectEstudo;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga = 100;
	private boolean tampada;
	
	
	public Caneta() {
		this.tampar();
		this.cor = "Azul";
	}
	
	
	Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = getPonta();
		this.carga = carga;
		this.tampada = tampada;
	}
	
	

	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float novaPonta) {
		this.ponta = novaPonta;
	}
	
	public int getCarga() {
		return this.carga;
	}
	
	public void setCarga(int novaCarga) {
		this.carga = novaCarga;
	}
	
	public boolean isTampada() {
		return this.tampada;
	}
	
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	
	public void status() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Está tampada? " + this.isTampada());
		System.out.println("Carga: " + this.getCarga());
	}
	
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("[ERRO] Não é possível rabiscar com a caneta tampada!");
		} else {
			System.out.println("Estou rabiscando!");
			this.carga -= 10;
		}
		
	}
	
	
	public void tampar() {
		this.tampada = true;
	}
	
	
	public void destampar() {
		this.tampada = false;
	}
}
