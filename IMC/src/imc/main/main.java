package imc.main;
import imc.Pessoa.Pessoa;
import imc.Pessoa.Atleta;
public class main {
	public static void main(String[] args) {
		Pessoa objPessoa = new Pessoa("João Pedro", 70.10, 1.81);
		System.out.println("Pessoa: ");
		objPessoa.setNome("João Pedro");
		System.out.println("Nome: " + objPessoa.getNome());
		objPessoa.setPeso(70.10);
		System.out.println("Peso: " + objPessoa.getPeso());
		objPessoa.setAltura(1.81);
		System.out.println("Altura: " + objPessoa.getAltura());
		System.out.println("IMC (Pessoa): " + objPessoa.calcularIMC());
		
		Atleta objAtleta = new Atleta("CBUM",  104, 1.85, "Musculação");
		System.out.println("\nAtleta: ");
		System.out.println("Nome atleta: " + objAtleta.getNome());
		System.out.println("Esporte praticado: " + objAtleta.getEsporte());
		System.out.println("IMC (Atleta): " + objAtleta.calcularIMC());	
	
   }
}