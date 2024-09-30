import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestaSerializacao {
	public static void main (String [] args) {

		Funcionario funcionario = new Funcionario ();
		funcionario.setNome("Fillipe Cordeiro");
		funcionario.setEndereco("São Paulo - SP");
		funcionario.setCargo(Cargo.CEO);
		
		try {
			// Para Windows utilize o caminho c:\\funcionario.ser
			FileOutputStream fileOut = new FileOutputStream("funcionario.ser");
			ObjectOutputStream out = new ObjectOutputStream (fileOut);
			out.writeObject(funcionario);
			System.out.println("Serializando...");
			out.close();
			fileOut.close();

		} catch (IOException e) {
			e.printStackTrace ();
		}
	}
}