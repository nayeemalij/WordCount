package JH;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class A {
	
	static String h="The cow jumped over the moon";
	static String g[];
	
	
	
	public static String wordCount() {
		
		String biggestWord="";
		g=h.split(" ");
		int amountOfWords=g.length;
		//System.out.println(amountOfWords);
			for(int p=0;p<g.length;p++) {
				if(g[p].length()>biggestWord.length()) {
					biggestWord=g[p];
				}
			}
		
		//System.out.println(biggestWord);
		
		
		return amountOfWords+" "+biggestWord;
	}
	
	
	
	
	public static void unitTest() {
		
		assertEquals(wordCount(), "6 jumped");
		
		System.out.println("Unit Test Passed");
	
		
	}
	
	
	
	
	
	
	@Test
	public static void run() {
		
	System.out.println(wordCount());	
		
	
	unitTest();
		
	}
	
	

}
