package SaurabhJBlockchain;
import java.security.MessageDigest;
import java.util.*;

import com.google.gson.GsonBuilder;

public class StringUtil {
    
    /*System.out.println("Hi ! Which security algorithm want to apply , Please select one option. Press :- "+"\n"+"1- MD2"+"\n"+
            "2- MD5"+"\n"+"3- SHA-1"+"\n"+"4- SHA-224"+"\n"+"5- SHA-256"+"\n"+"6- SHA-384"+"\n"+"7- SHA-512");
    Scanner s=new Scanner(System.in);
    int ch= s.nextInt();
    We can use switch-case inside the function for applying algo choosed by user*/
	
	//Applies Sha256 to a string and returns the result. 
	public static String applySha256(String input){
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        
			/*Applies sha256 to our input, 
 TODO: apply MessagDigest Class provides following cryptographic hashSHA function to find hashSHA value of a text as follows:

    MD2
    MD5
    SHA-1
    SHA-224
    SHA-256
    SHA-384
    SHA-512 
*/
			byte[] hashSHA = digest.digest(input.getBytes("UTF-8"));
	        
			StringBuffer hexString = new StringBuffer(); // This will contain hashSHA as hexidecimal
			for (int i = 0; i < hashSHA.length; i++) {
				String hex = Integer.toHexString(0xff & hashSHA[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
        
        public static String applyMD2(String input){
		
		try {
			MessageDigest digest = MessageDigest.getInstance("MD2");
                        //Applies MD2 to our input
			byte[] hashMD2 = digest.digest(input.getBytes("UTF-8"));
	        
			StringBuffer hexString = new StringBuffer(); // This will contain hashMD2 as hexidecimal
			for (int i = 0; i < hashMD2.length; i++) {
				String hex = Integer.toHexString(0xff & hashMD2[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
        
        public static String applyMD5(String input){
		
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
                        //Applies MD5 to our input
			byte[] hashMD5 = digest.digest(input.getBytes("UTF-8"));
	        
			StringBuffer hexString = new StringBuffer(); // This will contain hasHMD5 as hexidecimal
			for (int i = 0; i < hashMD5.length; i++) {
				String hex = Integer.toHexString(0xff & hashMD5[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
        public static String applySha1(String input){
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
                        //Applies SHA-1 to our input
			byte[] hashSHA = digest.digest(input.getBytes("UTF-8"));
	        
			StringBuffer hexString = new StringBuffer(); // This will contain hashSHA as hexidecimal
			for (int i = 0; i < hashSHA.length; i++) {
				String hex = Integer.toHexString(0xff & hashSHA[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
        
        public static String applySha224(String input){
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-224");
                        //Applies SHA-224 to our input
			byte[] hashSHA = digest.digest(input.getBytes("UTF-8"));
	        
			StringBuffer hexString = new StringBuffer(); // This will contain hashSHA as hexidecimal
			for (int i = 0; i < hashSHA.length; i++) {
				String hex = Integer.toHexString(0xff & hashSHA[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
        
        public static String applySha384(String input){
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-384");
                        //Applies SHA-384 to our input
			byte[] hashSHA = digest.digest(input.getBytes("UTF-8"));
	        
			StringBuffer hexString = new StringBuffer(); // This will contain hashSHA as hexidecimal
			for (int i = 0; i < hashSHA.length; i++) {
				String hex = Integer.toHexString(0xff & hashSHA[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
        
        public static String applySha512(String input){
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-512");
                        //Applies SHA-512 to our input
			byte[] hashSHA = digest.digest(input.getBytes("UTF-8"));
	        
			StringBuffer hexString = new StringBuffer(); // This will contain hashSHA as hexidecimal
			for (int i = 0; i < hashSHA.length; i++) {
				String hex = Integer.toHexString(0xff & hashSHA[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	//Short hand helper to turn Object into a json string
	public static String getJson(Object o) {
		return new GsonBuilder().setPrettyPrinting().create().toJson(o);
	}
	
	//Returns difficulty string target, to compare to hashSHA. eg difficulty of 5 will return "00000"  
	public static String getDificultyString(int difficulty) {
		return new String(new char[difficulty]).replace('\0', '0');
	}
	
	
}