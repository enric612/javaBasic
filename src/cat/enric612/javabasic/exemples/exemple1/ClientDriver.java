package cat.enric612.javabasic.exemples.exemple1;

public class ClientDriver {

	public static void main(String[] args) {
		// Definim un refer�ncia i constru�m un objecte de tipus client
		
		// Creem la variable de refer�ncia amb el traje de Client
		Client client; 
		
		// Instanciem al constructor de la classe client que crear� un objecte de tipus Client 
		// i el referenciara a la variable de refer�ncia client. 
		client = new Client(); 
		
		// Fixem el balans del client en 25897.55 �
		client.setBalans(25897.55f);
		
		System.out.println(client.toString());
		


	}

}
