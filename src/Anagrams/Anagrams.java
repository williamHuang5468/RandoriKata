package Anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {
    String word;
    List<String> sortResult;
    public Anagrams(String word){
	this.word = word;
	sortResult = new ArrayList<String>();
    }
    
    public String getWord(){
	return word;
    }
    public boolean isAnagrams(){
	return true;
    }
    
    public void sortWord(){
	sort();
    }
    
    public void sort(){
	for (int i = 0; i < word.length(); i++) {
	    
	}
    }
}
