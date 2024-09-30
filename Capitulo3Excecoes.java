public class Capitulo3Excecoes {
	public static void main(String[] args) {
		System.out.println("Ola Mundo, AndroidPro!");
		String stringNula = null;
		try {
			System.out.println("Tentando executar...");
			String stringParcial = stringNula.substring(1);
			// A execu��o ser� parada antes dessa linha
			System.out.println("String parcial: " + stringParcial);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+ e.getMessage());
		} finally {
			System.out.println("Essa linha sempre ser� executada");
		}
	}
}