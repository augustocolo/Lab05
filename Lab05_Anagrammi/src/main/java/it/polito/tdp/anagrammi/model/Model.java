package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import it.polito.tdp.anagrammi.DAO.AnagrammiDAO;

public class Model {
	
	private AnagrammiDAO adao = new AnagrammiDAO();
	
	public List<String> getAnagrammi(String start){
		RichWord in = new RichWord(" " + start);
		List<String> out = this.recursionAnagrammi(in);
		
		for (int i = 0; i < out.size(); i++) {
			out.set(i, out.get(i).trim());
		}
		
		return out;
		
	}
	
	private List<String> recursionAnagrammi(RichWord in){
		
		// CONDIZIONE DI TERMINAZIONE
		if (in.length() == 2) {
			String [] result = {in.toString()};
			return Arrays.asList(result);
		}
		// SCENDI DI UN LIVELLO
		List<String> out = new ArrayList<String>();
		for (RichWord r: in.getChildren()) {
			for (String res: this.recursionAnagrammi(r)) {
				out.add(in.getLeading() + res);
			}
		}
		// BACKTRACK
		return out;
		
	}
	
	public boolean anagrammaCorretto(String word) {
		return adao.isCorrect(word);
	}
}
