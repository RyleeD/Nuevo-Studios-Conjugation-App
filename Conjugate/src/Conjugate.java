public class Conjugate {
	private String Word;
	private String lastTwo;
	private String newWord;
	private String[] conjugate = {"ar", "er", "ir"};
	private String[] arConjugations = {"o", "as", "a", "amos", "ais", "an"};
	private String[] erConjugations = {"o", "es", "e", "emos", "eis", "en"};
	private String[] irConjugations = {"o", "es", "e", "imos", "is", "en"};
	private String[] irregularVerb = {"decir", "esquiar", "estar","ir", "oir", "ser", "tener", "venir", "dar", "hacer", "poder", "querer", "saber", "salir", "traer", "ver"};
	private String[] stemVerbs = {"jugar", "almorzar", "contar", "devolver", "dormir", "encontrar", "llover", "mover", "poder", "recordar", "acostarse", "empezar", "entender", "merendar", "nerar", "pensar", "perder", "preferir", "querer", "despertarse", "repetir", "seguir", "servir"};

	public Conjugate() {
		setString("0");
		Word = "";
		newWord = "";
	}

	public Conjugate(String word) {
		Word = word;
		lastTwo = Word.substring(Word.length() - 2);
		newWord = Word.substring(0, Word.length() - 2);
	}

	public void setString(String word) {
		Word = word;
	}

	public boolean checkIrregular0() {
		if (Word.equalsIgnoreCase(irregularVerb[0])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular1() {
		if (Word.equalsIgnoreCase(irregularVerb[1])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular2() {
		if (Word.equalsIgnoreCase(irregularVerb[2])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular3() {
		if (Word.equalsIgnoreCase(irregularVerb[3])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular4() {
		if (Word.equalsIgnoreCase(irregularVerb[4])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular5() {
		if (Word.equalsIgnoreCase(irregularVerb[5])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular6() {
		if (Word.equalsIgnoreCase(irregularVerb[6])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular7() {
		if (Word.equalsIgnoreCase(irregularVerb[7])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular8() {
		if (Word.equalsIgnoreCase(irregularVerb[8])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular9() {
		if (Word.equalsIgnoreCase(irregularVerb[9])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular10() {
		if (Word.equalsIgnoreCase(irregularVerb[10])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular11() {
		if (Word.equalsIgnoreCase(irregularVerb[11])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular12() {
		if (Word.equalsIgnoreCase(irregularVerb[12])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular13() {
		if (Word.equalsIgnoreCase(irregularVerb[13])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular14() {
		if (Word.equalsIgnoreCase(irregularVerb[14])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkIrregular15() {
		if (Word.equalsIgnoreCase(irregularVerb[15])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem0() {
		if (Word.equalsIgnoreCase(stemVerbs[0])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem1() {
		if (Word.equalsIgnoreCase(stemVerbs[1])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem2() {
		if (Word.equalsIgnoreCase(stemVerbs[2])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem3() {
		if (Word.equalsIgnoreCase(stemVerbs[3])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem4() {
		if (Word.equalsIgnoreCase(stemVerbs[4])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem5() {
		if (Word.equalsIgnoreCase(stemVerbs[5])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem6() {
		if (Word.equalsIgnoreCase(stemVerbs[6])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem7() {
		if (Word.equalsIgnoreCase(stemVerbs[7])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem8() {
		if (Word.equalsIgnoreCase(stemVerbs[8])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem9() {
		if (Word.equalsIgnoreCase(stemVerbs[9])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem10() {
		if (Word.equalsIgnoreCase(stemVerbs[10])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem11() {
		if (Word.equalsIgnoreCase(stemVerbs[11])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem12() {
		if (Word.equalsIgnoreCase(stemVerbs[12])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem13() {
		if (Word.equalsIgnoreCase(stemVerbs[13])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem14() {
		if (Word.equalsIgnoreCase(stemVerbs[14])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem16() {
		if (Word.equalsIgnoreCase(stemVerbs[16])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem17() {
		if (Word.equalsIgnoreCase(stemVerbs[17])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem18() {
		if (Word.equalsIgnoreCase(stemVerbs[18])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem19() {
		if (Word.equalsIgnoreCase(stemVerbs[19])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem20() {
		if (Word.equalsIgnoreCase(stemVerbs[20])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem21() {
		if (Word.equalsIgnoreCase(stemVerbs[21])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkStem22() {
		if (Word.equalsIgnoreCase(stemVerbs[22])) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean endsAr() {
		if (lastTwo.equals(conjugate[0])) {
			return true;
		} else {
			return false;
		}
	}

	public boolean endsEr() {
		if (lastTwo.equals(conjugate[1])) {
			return true;
		} else {
			return false;
		}
	}

	public boolean endsIr() {
		if (lastTwo.equals(conjugate[2])) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		if (checkIrregular0() == true) {
			return "" +"The conjugations of " +Word +" are " +"digo, " +"decimos, " +"dices, " +"decis, " +"dice, " +"dicen" +"\n";
		} else if (checkIrregular1() == true) {
			return "" +"The conjugations of " +Word +" are " +"esquio, " +"esquiamos, " +"esquias, " +"esquiaras, " +"esquia, " +"esquian" +"\n";
		} else if (checkIrregular2() == true) {
			return "" +"The conjugations of " +Word +" are " +"estoy, " +"estamos, " +"estas, " +"estais, " +"esta, " +"estan" +"\n";
		} else if (checkIrregular3() == true) {
			return "" +"The conjugations of " +Word +" are " +"voy, " +"vamos, " +"vas, " +"vais, " +"va, " +"van" +"\n";
		} else if (checkIrregular4() == true) {
			return "" +"The conjugations of " +Word +" are " +"oigo, " +"oimos, " +"oyes, " +"ois, " +"oye, " +"oyen" +"\n";
		} else if (checkIrregular5() == true) {
			return "" +"The conjugations of " +Word +" are " +"soy, " +"somos, " +"eres, " +"sois, " +"es, " +"son" +"\n";
		} else if (checkIrregular6() == true) {
			return "" +"The conjugations of " +Word +" are " +"tengo, " +"tenemos, " +"tienes, " +"teneis, " +"tiene, " +"tienen" +"\n";
		} else if (checkIrregular7() == true) {
			return "" +"The conjugations of " +Word +" are " +"vengo, " +"venimos, " +"vienes, " +"venis, " +"viene, " +"vienen" +"\n";
		} else if (checkIrregular8() == true) {
			return "" +"The conjugations of " +Word +" are " +"doy, " +", das" +"da, " +"damos, " +"dais, " +"dan" +"\n";
		} else if (checkIrregular9() == true) {
			return "" +"The conjugations of " +Word +" are " +"hago, " +"haces, " +"hace, " +"hacemos, " +"haceis, " +"hacen" +"\n";
		} else if (checkIrregular10() == true) {
			return "" +"The conjugations of " +Word +" are " +"puedo, " +"puedes, " +"puede, " +"podemos, " +"podeis, " +"pueden" +"\n";
		} else if (checkIrregular11() == true) {
			return "" +"The conjugations of " +Word +" are " +"quiero, " +"quieres, " +"quiere, " +"queremos, " +"quereis, " +"quieren" +"\n";
		} else if (checkIrregular12() == true) {
			return "" +"The conjugations of " +Word +" are " +"se, " +"sabes, " +"sabe, " +"sabemos, " +"sabeis, " +"saben" +"\n";
		} else if (checkIrregular13() == true) {
			return "" +"The conjugations of " +Word +" are " +"salgo, " +"sales, " +"sale, " +"salimos, " +"salis, " +"salen" +"\n";
		} else if (checkIrregular14() == true) {
			return "" +"The conjugations of " +Word +" are " +"traigo, " +"traes, " +"trae, " +"traemos, " +"traeis, " +"traen" +"\n";
		} else if (checkIrregular15() == true) {
			return "" +"The conjugations of " +Word +" are " +"veo, " +"ves, " +"ve, " +"vemos, " +"veis, " +"ven" +"\n";
		} else if (checkStem0() == true) {
			return "" +"The conjugations of " +Word +" are " +"juego, " +"juegas, " +"juega, " +"jugamos, " +"jugais, " +"juegan" +"\n";
		} else if (checkStem1() == true) {
			return "" +"The conjugations of " +Word +" are " +"almuerzo, " +"almuerzas, " +"almuerza, " +"almorzamos, " +"almorzais, " +"almuerzen" +"\n";
		} else if (checkStem2() == true) {
			return "" +"The conjugations of " +Word +" are " +"cuento, " +"cuentas, " +"cuenta, " +"contamos, " +"cuentan, " +"" +"\n";
		} else if (checkStem3() == true) {
			return "" +"The conjugations of " +Word +" are " +"devuelvo, " +"devuelves, " +"devuelve, " +"devolvemos, " +"devolveis, " +"devuelven" +"\n";
		} else if (checkStem4() == true) {
			return "" +"The conjugations of " +Word +" are " +"duermo, " +"duermes, " +"duerme, " +"dormimos, " +"dormis, " +"duermen" +"\n";
		} else if (checkStem5() == true) {
			return "" +"The conjugations of " +Word +" are " +"encuentro, " +"encuentras, " +"encuentra, " +"encontramos, " +"encontrais, " +"encuentran" +"\n";
		} else if (checkStem6() == true) {
			return "" +"The conjugations of " +Word +" are " +"lluevo, " +"llueves, " +"llueve, " +"llovemos, " +"lloveis, " +"llueven" +"\n";
		} else if (checkStem7() == true) {
			return "" +"The conjugations of " +Word +" are " +"muevo, " +"mueves, " +"mueve, " +"movemos, " +"moveis, " +"mueven" +"\n";
		} else if (checkStem8() == true) {
			return "" +"The conjugations of " +Word +" are " +"puedo, " +"puedes, " +"puede, " +"podemos, " +"podeis, " +"pueden" +"\n";
		} else if (checkStem9() == true) {
			return "" +"The conjugations of " +Word +" are " +"recuerdo, " +"recuerdas, " +"recuerda, " +"recordamos, " +"recordais, " +"recuerdan" +"\n";
		} else if (checkStem10() == true) {
			return "" +"The conjugations of " +Word +" are " +"me acuesto, " +"te acuestas, " +"se acuesta, " +"nos acostamos, " +"os acostais, " +"se acuestan" +"\n";
		} else if (checkStem11() == true) {
			return "" +"The conjugations of " +Word +" are " +"empiezo, " +"empiezas, " +"empieza, " +"empezamos, " +"empezais, " +"empiezan" +"\n";
		} else if (checkStem12() == true) {
			return "" +"The conjugations of " +Word +" are " +"entiendo, " +"entiendes, " +"entiende, " +"entendemos, " +"entendeis, " +"entienden" +"\n";
		} else if (checkStem13() == true) {
			return "" +"The conjugations of " +Word +" are " +"meriendo, " +"meriendas, " +"merienda, " +"merendamos, " +"merendais, " +"meriendan" +"\n";
		} else if (checkStem14() == true) {
			return "" +"The conjugations of " +Word +" are " +"pienso, " +"piensas, " +"piensa, " +"pensamos, " +"pensais, " +"piensan" +"\n";
		} else if (checkStem16() == true) {
			return "" +"The conjugations of " +Word +" are " +"pierdo, " +"pierdes, " +"pierde, " +"perdemos, " +"perdeis, " +"pierden" +"\n";
		} else if (checkStem17() == true) {
			return "" +"The conjugations of " +Word +" are " +"prefiero, " +"prefieres, " +"prefiere, " +"preferimos, " +"preferis, " +"prefieren" +"\n";
		} else if (checkStem18() == true) {
			return "" +"The conjugations of " +Word +" are " +"quiero, " +"quieres, " +"quiere, " +"queremos, " +"quereis, " +"quieren" +"\n";
		} else if (checkStem19() == true) {
			return "" +"The conjugations of " +Word +" are " +"me despierto, " +"te despiertas, " +"se despierta, " +"nos despertamos, " +"os despertais, " +"se despiertan" +"\n";
		} else if (checkStem20() == true) {
			return "" +"The conjugations of " +Word +" are " +"me repito, " +"te repites, " +"se repite, " +"nos repetimos, " +"os repetis, " +"se repiten" +"\n";
		} else if (checkStem21() == true) {
			return "" +"The conjugations of " +Word +" are " +"sigo, " +"sigues, " +"sigue, " +"seguimos, " +"seguis, " +"siguen" +"\n";
		} else if (checkStem22() == true) {
			return "" +"The conjugations of " +Word +" are " +"sirvo, " +"sirves, " +"sirve, " +"servimos, " +"servis, " +"sirven" +"\n";
		} else if (endsAr() == true) {
			return "" +"The conjugations of " +Word +" are " +newWord+arConjugations[0]+ ", "+newWord+arConjugations[1]+ ", "+newWord+arConjugations[2]+ ", "+newWord+arConjugations[3]+ ", " +newWord+arConjugations[4]+ ", " +newWord+arConjugations[5] +"\n";
		} else if (endsEr() == true) {
			return "" +"The conjugations of " +Word +" are " +newWord+erConjugations[0]+ ", "+newWord+erConjugations[1]+ ", "+newWord+erConjugations[2]+ ", "+newWord+erConjugations[3]+ ", " +newWord+erConjugations[4]+ ", " +newWord+erConjugations[5] +"\n";
		} else if (endsIr() == true) {
			return "" +"The conjugations of " +Word +" are " +newWord+irConjugations[0]+ ", "+newWord+irConjugations[1]+ ", "+newWord+irConjugations[2]+ ", "+newWord+irConjugations[3]+ ", " +newWord+irConjugations[4]+ ", " +newWord+irConjugations[5] +"\n";
		} else {
			return "It broke";
		}
	}
}