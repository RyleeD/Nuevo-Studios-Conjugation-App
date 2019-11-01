import java.util.*;

public class PastPerfect {
	private String word;
	private List<String> irregulars = Arrays.asList("decir", "hacer", "abrir",
			"cubrir", "poner", "volver", "ver", "morir", "romper", "imprimir",
			"escribir", "resolver", "traer", "oir", "leer", "imponer",
			"satisfacer", "descubrir");

	public PastPerfect() {
		word = "";
	}

	public PastPerfect(String w) {
		word = w;
	}

	public void setWord(String w) {
		word = w;
	}

	public String getConjugate() {
		if (irregulars.contains(word)) {
			if ((word.compareTo("decir") == 0)) {
				String newword = word.replace(word, "dicho");
				return newword;
			} else if ((word.compareTo("hacer") == 0)) {
				String newword = word.replace(word, "hecho");
				return newword;
			} else if ((word.compareTo("abrir") == 0)) {
				String newword = word.replace(word, "abierto");
				return newword;
			} else if ((word.compareTo("cubrir") == 0)) {
				String newword = word.replace(word, "cubierto");
				return newword;
			} else if ((word.compareTo("poner") == 0)) {
				String newword = word.replace(word, "puesto");
				return newword;
			} else if ((word.compareTo("volver") == 0)) {
				String newword = word.replace(word, "vuelto");
				return newword;
			} else if ((word.compareTo("ver") == 0)) {
				String newword = word.replace(word, "visto");
				return newword;
			} else if ((word.compareTo("morir") == 0)) {
				String newword = word.replace(word, "muerto");
				return newword;
			} else if ((word.compareTo("romper") == 0)) {
				String newword = word.replace(word, "roto");
				return newword;
			} else if ((word.compareTo("imprimir") == 0)) {
				String newword = word.replace(word, "imreso");
				return newword;
			} else if ((word.compareTo("escribir") == 0)) {
				String newword = word.replace(word, "escrito");
				return newword;
			} else if ((word.compareTo("resolver") == 0)) {
				String newword = word.replace(word, "resuelto");
				return newword;
			} else if ((word.compareTo("traer") == 0)) {
				String newword = word.replace(word, "traido");
				return newword;
			} else if ((word.compareTo("oir") == 0)) {
				String newword = word.replace(word, "oido");
				return newword;
			} else if ((word.compareTo("leer") == 0)) {
				String newword = word.replace(word, "leido");
				return newword;
			} else if ((word.compareTo("imponer") == 0)) {
				String newword = word.replace(word, "impuesto");
				return newword;
			} else if ((word.compareTo("satisfacer") == 0)) {
				String newword = word.replace(word, "satisfecho");
				return newword;
			} else if ((word.compareTo("descubrir") == 0)) {
				String newword = word.replace(word, "descubierto");
				return newword;
			}
		} else {
			String ending1 = "ar";
			String ending2 = "er";
			String ending3 = "ir";
			String lastletters = word.substring(word.length() - 2);
			String verb = word.substring(0, word.length() - 2);
			// newword1 = ""
			if ((lastletters.compareTo(ending1)) == 0) {
				String newword1 = verb + "ado";
				return newword1;
			}
			// }
			else if ((lastletters.compareTo(ending2) == 0)
					|| (lastletters.compareTo(ending3) == 0)) {
				String newword2 = verb + "ido";
				return newword2;
			}
		}
		return word;
	}

	public String toString() {
		return "Yo: había " + getConjugate() + "\n"
				+ ("Tú: habías " + getConjugate()) + "\n"
				+ ("Él/Ella/Usted: había " + getConjugate()) + "\n"
				+ ("Nosotros: habíamos " + getConjugate()) + "\n"
				+ ("Ellos/Ellas/Ustedes: habían " + getConjugate() + "\n" + "\n");
	}
}
