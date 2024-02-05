package aula_2;

public class Gato {
   public String nome;
   public String raca;
   public int idade;
   public String cor;
   
   
   public void latir() {
	   System.out.println("O gato: " + nome + "miou");
	   
   }
   public void Getgato() {
	   System.out.println(
			   "Nome: " + nome +
			   "\nRaça: " + raca +
			   "\ncor: "  + idade +
			   "\nCor: " + cor 
			   );
   }
}
