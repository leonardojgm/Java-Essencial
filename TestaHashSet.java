import java.util.HashSet;

public class TestaHashSet {

	public static void main(String[] args) {

		// Cria��o de um HashSet
		HashSet<String> androidHash = new HashSet<String>();

		// Adicionando elementos
		androidHash.add("Eclair");
		androidHash.add("Eclair");
		androidHash.add("Gingerbread");
		androidHash.add("Gingerbread");
		androidHash.add("Honeycomb");
		androidHash.add("Ice Cream Sandwich");
		androidHash.add("Jelly Bean");
		androidHash.add("Jelly Bean");

		System.out.println("O conte�do do HashSet:" + androidHash);
	}
}