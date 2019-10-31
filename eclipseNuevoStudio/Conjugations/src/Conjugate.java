import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Enumeration;

public class Conjugate {
	private String[] sub = {"yo","tú","usted","él","ella","nosotros","vosotros","ustedes","ellos","ellas"};
	private String[] arEnding = {"é","aste","ó","ó","ó","amos","asteis","aron","aron","aron"};
	private String[] erEnding = {"í","iste","ió","ió","ió","imos","isteis","ieron","ieron","ieron"};
	private String[] irEnding = {"í","iste","ió","ió","ió","imos","isteis","ieron","ieron","ieron"};
	private String[][] irregular = {{"andar","anduve","anduviste","anduvo","anduvimos","anduvisteis","anduvieron"},
									{"querer","quise","quisiste","quiso","quisimos","quisisteis","quisieron"},
									{"saber","supe","supiste","supo","supimos","supisteis","supieron"},
									{"traer","traje","trajiste","trajo","trajimos","trajisteis","trajeron"}
									};
	private String word;
	private String subject;
	
	public Conjugate(String w, String s){
		word = w;
		subject = s;
	}
	
	public void set(String w, String s){
		word = w; 
		subject = s;
	}
	
	public boolean isIrregular(){ //Determines if the word is irregular
		boolean isThere = false;
		for(int i = 0; i < irregular.length;i++){ //Sifts through irregular array
			if(word.equals(irregular[i][0])){
				isThere = true; //If it is an irregular, returns true
				break;
			}
			else{
				isThere = false;
			}
		}
		return isThere;
	}
	
	public String determin(){
		String newEnding = "Ending has broke.";
		if(isIrregular()){
			for(int i = 0; i < irregular.length;i++){
				if(word.equals(irregular[i][0])){
					newEnding = irregular[i][Arrays.asList(sub).indexOf(subject)+1];
				}
			}
		}
		else{
			if(word.substring(word.length()-2).equals("ar")){
				for(int i = 0; i < sub.length;i++){
					if(subject.equals(sub[i])){
						newEnding = arEnding[i];
					}
				}
			}
			else if(word.substring(word.length()-2).equals("er")){
				for(int i = 0; i < sub.length;i++){
					if(subject.equals(sub[i])){
						newEnding = erEnding[i];
					}
				}
			}
			else if(word.substring(word.length()-2).equals("ir")){
				for(int i = 0; i < sub.length;i++){
					if(subject.equals(sub[i])){
						newEnding = irEnding[i];
					}
				}
			}
			else{
				newEnding = "The ending does not include the correct letters.";
			}
		}
		return newEnding;
	}
	
	public String combine(){
		if(isIrregular()){
			return determin();
		}
		else{
			return word.substring(0,word.length()-2) + determin();
		}
	}
	
}
