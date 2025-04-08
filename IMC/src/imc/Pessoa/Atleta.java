package imc.Pessoa;

public class Atleta extends Pessoa{
	private String esportePraticado;
	public Atleta(String nome, double peso, double altura, String esportePraticado) {
		super(nome, peso, altura);
		// TODO Auto-generated constructor stub
		this.esportePraticado = esportePraticado;	
	}
//POLIMORFIA DO MÉTODO CRIADO NA CLASSE PESSOA(Super Class), PARA QUE SEJA FEITO UM AJUSTE NO CÁLCULO FINAL DO IMC EM MENOS 5%
		@Override
		public double calcularIMC() {
			// TODO Auto-generated method stub
			double imcOriginal = super.calcularIMC();
			return imcOriginal * 0.95;
		}
//MÉTODO GETTER/SETTER PARA INFORMAR O ESPORTE PRATICADO PELO ATLETA
		public String getEsporte() {
			return esportePraticado;
		}

		public void setEsporte(String esportePraticado) {
			this.esportePraticado = esportePraticado;
		}

}