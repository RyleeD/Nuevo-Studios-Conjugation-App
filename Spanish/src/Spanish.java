
public class Spanish {

	private String Word;
	private String[] conjugate={"ar", "er", "ir"};
	private String[] irregular={"and", "ven", "est", "pod", "pon", "sab", "ten", "hac", "quer", "dec", "tra", "conduc", "produc", "traduc", "deten", "reten", "conten", "conven", "preven", "compon", "descompon", "propon", "dispon", "predec", "contradec", "deshac", "rehac", "s", "", "d"};
	private String lastTwo, newWord;
	
	public Spanish()
	{
		Word=""; 
		newWord="";
	}
	public Spanish(String word)
	{
		Word=word;
		lastTwo = Word.substring(Word.length()-2);
		newWord = Word.substring(0,Word.length()-2);
	}
	public void setWord(String word)
	{
		Word=word; 
	}
	
	//irregular length =27
	public boolean Irregular(){
		if(newWord.equals(irregular[0])){
			newWord="anduv";
			return true;
		}else if(newWord.equals(irregular[1])){
			newWord="vin";
			return true;
		}else if(newWord.equals(irregular[2])){
			newWord="estuv";
			return true;
		}else if(newWord.equals(irregular[3])){
			newWord="pud";
			return true;
		}else if(newWord.equals(irregular[4])){
			newWord="pus";
			return true;
		}else if(newWord.equals(irregular[5])){
			newWord="sup";
			return true;
		}else if(newWord.equals(irregular[6])){
			newWord="tuv";
			return true;
		}else if(newWord.equals(irregular[7])){
			//hizo for el/ella/usted
			newWord="hic";
			return true;
		}else if(newWord.equals(irregular[8])){
			newWord="quis";
			return true;
		}else if(newWord.equals(irregular[9])){
			newWord="dij";
			return true;
		}else if(newWord.equals(irregular[10])){
			newWord="traj";
			return true;
		}else if(newWord.equals(irregular[11])){
			newWord="conduj";
			return true;
		}else if(newWord.equals(irregular[12])){
			newWord="produj";
			return true;
		}else if(newWord.equals(irregular[13])){
			newWord="traduj";
			return true;
		}else if(newWord.equals(irregular[14])){
			newWord="detuv";
			return true;
		}else if(newWord.equals(irregular[15])){
			newWord="retuv";
			return true;
		}else if(newWord.equals(irregular[16])){
			newWord="contuv";
			return true;
		}else if(newWord.equals(irregular[17])){
			newWord="convin";
			return true;
		}else if(newWord.equals(irregular[18])){
			newWord="previn";
			return true;
		}else if(newWord.equals(irregular[19])){
			newWord="compus";
			return true;
		}else if(newWord.equals(irregular[20])){
			newWord="descompus";
			return true;
		}else if(newWord.equals(irregular[21])){
			newWord="propus";
			return true;
		}else if(newWord.equals(irregular[22])){
			newWord="dispus";
			return true;
		}else if(newWord.equals(irregular[23])){
			newWord="predij";
			return true;
		}else if(newWord.equals(irregular[24])){
			newWord="contradij";
			return true;
		}else if(newWord.equals(irregular[25])){
			newWord="deshic";
			return true;
		}else if(newWord.equals(irregular[26])){
			newWord="rehic";
			return true;
		}else if(newWord.equals(irregular[27])){
			newWord="fu";
			return true;
		}else if(newWord.equals(irregular[28])){
			newWord="fu";
			return true;
		}else if(newWord.equals(irregular[29])){
			newWord="di";
			return true;
		}else {
			return false;
		}
	}
	   
	public boolean Ar() 
	{
		
		if(lastTwo.equals(conjugate[0]))
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	public boolean Er()
	{
		if(lastTwo.equals(conjugate[1])){
			return true;
		} else{
			return false;
		}
	}
	
	public boolean Ir(){
		if(lastTwo.equals(conjugate[2])){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString()
	{
		if(newWord.equals(irregular[7])==true){
			//hizo for el/ella/usted
			newWord="hic";
			return Word +" preterite conjugations are "+newWord+"e, "+newWord+"iste, "+"hizo, "+newWord+"imos, "+newWord+"isteis, "+newWord+"ieron " + "\n";
		}else if(newWord.equals(irregular[25])==true){
			newWord="deshic";
			return Word +" preterite conjugations are "+newWord+"e, "+newWord+"iste, "+"deshizo, "+newWord+"imos, "+newWord+"isteis, "+newWord+"ieron " + "\n";
		}else if(newWord.equals(irregular[26])==true){
			newWord="rehic";
			return Word +" preterite conjugations are "+newWord+"e, "+newWord+"iste, "+"rehizo, "+newWord+"imos, "+newWord+"isteis, "+newWord+"ieron " + "\n";
		}else if(newWord.equals(irregular[27])==true){
			newWord="fu";
			return Word +" preterite conjugations are "+newWord+"i, "+newWord+"iste, "+newWord+"e, "+newWord+"imos, "+newWord+"isteis, "+newWord+"eron " + "\n";
		}else if(newWord.equals(irregular[28])==true){
			newWord="fu";
			return Word +" preterite conjugations are "+newWord+"i, "+newWord+"iste, "+newWord+"e, "+newWord+"imos, "+newWord+"isteis, "+newWord+"eron " + "\n";
		}else if(newWord.equals(irregular[29])==true){
			newWord="di";
			return Word +" preterite conjugations are "+newWord+", "+newWord+"ste, "+newWord+"o, "+newWord+"mos, "+newWord+"steis, "+newWord+"eron " + "\n";
		}else if(Irregular()==true){
			return Word +" preterite conjugations are "+newWord+"e, "+newWord+"iste, "+newWord+"o, "+newWord+"imos, "+newWord+"isteis, "+newWord+"ieron " + "\n";
		}  
		   
		if(Ar()==true) 
		{
			return Word + " preterite conjugations are "+newWord+"é, "+newWord+"aste, "+newWord+"ó, "+newWord+"amos, "+newWord+"asteis, "+newWord+"aron " + "\n";
		}
		else 
		{
			return Word + " preterite conjugations are "+newWord+"í, "+newWord+"iste, "+newWord+"ió, "+newWord+"imos, "+newWord+"isteis, "+newWord+"ieron " + "\n";
		}
	}
}  
