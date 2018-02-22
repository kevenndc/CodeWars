package SimpleEncryption;

public class Kata {
	
	public static String encrypt(final String text, final int n) {   
	    
	    if (n > 0) {
	      String finalText = text;
	      int count = 0;
	    
	      while (count != n) {
	      String firstPart = "";
	      String secondPart = "";
	    
	        for (int i = 0; i < finalText.length(); i++) {
	    
	          if (i % 2 != 0) {
	        	  firstPart += finalText.charAt(i);
	        
	          } else {
	        	  secondPart += finalText.charAt(i);
	          }
	        }
	        finalText = firstPart + secondPart;
	        count++;
	       } 
	       return finalText;
	       
	     } else {
	       return text;
	     }
	          
	  }
	  
	  public static String decrypt(final String encryptedText, final int n) {
	  
	    if (n > 0) {
	      String finalText = encryptedText;
	      int count = 0;
	      String palavra = "";
	      
	      while (count != n) { 
	    	  
	    	  String a = finalText.substring(0, (finalText.length() / 2));
		      String b = finalText.substring(((finalText.length() / 2)), finalText.length());
		      
		      finalText =  b + a;
	      
		      for (int i = 0; i < b.length(); i++) {
		    	  if (i < b.length()) {
		    		  palavra += b.charAt(i);
		    	  }
	        
		    	  if (i < a.length()) {
		    		  palavra += a.charAt(i);
		    	  }
		      }

		      finalText = palavra;
		      palavra = "";
		      count++;
	      
	      }
	      
	      	return finalText;
	       
	     	} else {
	     		return encryptedText;
	     }
	  }

}
