public class ConjugateFuture {

	private String infinitive = null; // Holds infinitive form of verb
	private String conjugated = null; // Holds conjugated form of verb
	public String[] subjects = { "Yo", "Tú", "El/Ella/Usted", "Nosotros", "Ellos/Ellas/Ustedes" }; // Spanish Subject Pronouns.
	public String[] future = { "é", "ás", "á", "emos", "án" }; // Future Tense conjugative endings
	public String[][] irregularVerbs = {
			{ "haber", "habré", "habrás", "habrá", "habremos", "habrán" }, // Second dimensional array containing different verbs on the each first dimension array and the infinitives followed by the conjugations on each second dimensional array.
			{ "decir", "diré", "dirás", "dirá", "diremos", "dirán" },
			{ "hacer", "haré", "harás", "hará", "haremos", "harán" }
			};

	ConjugateFuture() {

	}

	ConjugateFuture(String verb) {
		
		setInfinitive(verb);
	}

	
	
	public void setInfinitive(String verb) { // Allows for the verb to change

		infinitive = verb;
	}

	public String conjugateVerb() { // Conjugates the verb

		String strippedVerb = null; // Variable that contains the verb without the infinitive ending.
		String finalVerb = null;

		for (int i = 0; i < irregularVerbs.length; i++) { // Scans through the array...

			if (infinitive.equals(irregularVerbs[i][0])) { // ...until the one of the items in the array .equals infinitive.

				for (int j = 0; j < subjects.length; j++) {

					conjugated = subjects[j] + " " + irregularVerbs[i][j + 1];
					System.out.println(conjugated);
				}
			}
		}

		if (conjugated != null) {
			
			finalVerb = conjugated;
			conjugated = null;
			return "" + finalVerb;
		} else {
			
			strippedVerb = infinitive.substring(0, infinitive.length() - 2); // Takes the infinitive, takes off the last two letters (infinitive ending), and store it in the variablestrippedVariable.
			
			for (int i = 0; i < future.length; i++) {
	
				conjugated = subjects[i] + " " + strippedVerb + future[i];
				System.out.println(conjugated);
			}
	
			finalVerb = conjugated;
			conjugated = null;
			return "" + finalVerb;
		}
	}
}
