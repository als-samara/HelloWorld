package aula_metodos;

public class TestaMetodos {

	public static void main(String[] args) {
		// Chamadas para os M�todos Locais
		
				metodoPublico();
				metodoFriendly();
				metodoProtegido();
				metodoPrivado();

				// Chamadas para os M�todos da Classe 01
				
				Classe01.metodoPublico01();
				Classe01.metodoFriendly01();
				Classe01.metodoProtegido01();
				//Classe01.metodoPrivado01();
				
				// Chamadas para os M�todos da Classe 02 - Pacote 01
				
				metodoPublico02();
				//metodoFriendly02();
				//metodoProtegido02();
				//metodoPrivado02();
				
			}

			public static void metodoPublico() {
				System.out.println("M�todo P�blico");
			}
			
			static void metodoFriendly() {
				System.out.println("M�todo Friendly");
			}
			
			protected static void metodoProtegido() {
				System.out.println("M�todo Protegido");
			}
			
			private static void metodoPrivado() {
				System.out.println("M�todo Privado");
			}

	}

}
