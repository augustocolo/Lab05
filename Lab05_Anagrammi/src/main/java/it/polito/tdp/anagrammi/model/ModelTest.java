package it.polito.tdp.anagrammi.model;

import java.util.List;

public class ModelTest {

	public static void main(String[] args) {
		
		RichWord parola = new RichWord("augusto");
		parola.getChildren();
		
		Model model = new Model();
		List<String> out = model.getAnagrammi("augusto");
		
		for (String s: out) {
			System.out.println(s);
		}
		
		System.out.println(out.size());

	}

}
