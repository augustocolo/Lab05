package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class RichWord {
	private char leading;
	private char[] trailing;
	
	public RichWord(String word) {
		leading = word.charAt(0);
		trailing = word.substring(1, word.length()).toCharArray();
	}
	
	public RichWord(char leading, char[] trailing) {
		this.leading = leading;
		this.trailing = trailing;
	}
	
	public List<RichWord> getChildren(){
		List<RichWord> res = new ArrayList<RichWord>();
		for (int i = 0; i < trailing.length; i++) {
			char newLeading = this.trailing[i];
			char[] newTrailing = removeElement(this.trailing, i);
			// System.out.println("\nleading: " + newLeading + "\ntrailing: " + new String(newTrailing));
			res.add(new RichWord(newLeading, newTrailing));
		}
		return res;
	}
	
	public static char[] removeElement( char [] arr, int index ){
        // Destination array
        char[] arrOut = new char[arr.length - 1];
        int remainingElements = arr.length - ( index + 1 );
        // copying elements that come before the index that has to be removed
        System.arraycopy(arr, 0, arrOut, 0, index);
        // copying elements that come after the index that has to be removed
        System.arraycopy(arr, index + 1, arrOut, index, remainingElements);
        
        return arrOut;
    }

	@Override
	public String toString() {
		return this.leading + new String(this.trailing);
	}
	
	public int length() {
		return 1 + this.trailing.length;
	}

	public char getLeading() {
		return leading;
	}

	public char[] getTrailing() {
		return trailing;
	}
	
	
	
	

}
