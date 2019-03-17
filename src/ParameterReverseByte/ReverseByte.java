package ParameterReverseByte;

public class ReverseByte {
    private   static  String  j= "ABCDEFGH";
	public static void main(String[] args) {
		
		   reverse_StringByte(j );
	

	}
   
	public static String reverse_StringByte  (String input) { 
		
		 input = j;
		  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] stringBytes = input.getBytes(); 
  
        byte [] found =  
                   new byte [stringBytes.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<stringBytes.length; i++) 
            found[i] =  
             stringBytes[stringBytes.length-i-1]; 
  
        System.out.println(new String(found)); 
		
		
		return null;
	}
}
