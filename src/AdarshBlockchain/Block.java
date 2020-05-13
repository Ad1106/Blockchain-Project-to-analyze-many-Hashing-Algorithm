package SaurabhJBlockchain;

import java.util.Date;

public class Block {
	
	public String hashSHA256;
	public String previousHashSHA256; 
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	private int nonce;
	
	//Block Constructor.  
	public Block(String data,String previousHashSHA256) {
		this.data = data;
		this.previousHashSHA256 = previousHashSHA256;
		this.timeStamp = new Date().getTime();
                this.hashSHA256 = calculateSHA256Hash(); //Making sure we do this after we set the other values.
                
        }
	
	//Calculate new hashSHA256 based on blocks contents
	public String calculateSHA256Hash() {
		String calculatedhashSHA256;
            calculatedhashSHA256 = StringUtil.applySha256( 
                    previousHashSHA256 +
                            Long.toString(timeStamp) +
                            Integer.toString(nonce) +
                            data);
		return calculatedhashSHA256;
	}
	
	//Increases nonce value until hashSHA256 target is reached.
	public void mineBlock1(int difficulty) {
		String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!hashSHA256.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hashSHA256 = calculateSHA256Hash();
		}
		System.out.println("Block Mined!!! --> calculateSHA256Hash : " + hashSHA256);
        }
                
    }
    //--------------------------------------------------------------------------------------------------------------   
        class BlockMD2 {
	
	public String hashMD2;
	public String previousHashMD2; 
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	private int nonce;
	
	//Block Constructor.  
	public BlockMD2(String data,String previousHashMD2) {
		this.data = data;
		
		this.timeStamp = new Date().getTime();
                //Making sure we do this after we set the other values.
                
                
                this.previousHashMD2 = previousHashMD2;
		this.hashMD2 = calculateMD2Hash();
        }
        //Calculate new hashMD2 based on blocks contents
	public String calculateMD2Hash() {
		String calculatedhashMD2;
            calculatedhashMD2 = StringUtil.applyMD2( 
                    previousHashMD2 +
                            Long.toString(timeStamp) +
                            Integer.toString(nonce) +
                            data);
		return calculatedhashMD2;
	}
        //Increases nonce value until hashMD2 target is reached.
	public void mineBlock1(int difficulty) {
		String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!hashMD2.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hashMD2 = calculateMD2Hash();
		}
		System.out.println("Block Mined!!! --> calculateMD2Hash : " + hashMD2);
        }
            
}
//----------------------------------------------------------------------------------------------------------------

class BlockMD5 {
	
	public String hashMD5;
	public String previousHashMD5; 
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	private int nonce;
	
	//Block Constructor.  
	public BlockMD5(String data,String previousHashMD5) {
		this.data = data;
		
		this.timeStamp = new Date().getTime();
                //Making sure we do this after we set the other values.
                this.previousHashMD5 = previousHashMD5;
				this.hashMD5 = calculateMD5Hash();
        }
        //Calculate new hashMD2 based on blocks contents
	public String calculateMD5Hash() {
		String calculatedhashMD5;
            calculatedhashMD5 = StringUtil.applyMD5( 
                    previousHashMD5 +
                            Long.toString(timeStamp) +
                            Integer.toString(nonce) +
                            data);
		return calculatedhashMD5;
	}
        //Increases nonce value until hashMD2 target is reached.
	public void mineBlock1(int difficulty) {
		String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!hashMD5.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hashMD5 = calculateMD5Hash();
		}
		System.out.println("Block Mined!!! --> calculateMD2Hash : " + hashMD5);
        }
}

//-----------------------------------------------------------------------------------------------------------------
class BlockSHA1 {
	
	public String hashSHA1;
	public String previousHashSHA1; 
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	private int nonce;
	
	//Block Constructor.  
	public BlockSHA1(String data,String previousHashSHA1 ) {
		this.data = data;
		this.previousHashSHA1 = previousHashSHA1;
		this.timeStamp = new Date().getTime();
                this.hashSHA1 = calculateSHA1Hash(); //Making sure we do this after we set the other values.
        }
	//Calculate new hashSHA256 based on blocks contents
	public String calculateSHA1Hash() {
		String calculatedhashSHA1;
            calculatedhashSHA1 = StringUtil.applySha1( 
                    previousHashSHA1 +
                            Long.toString(timeStamp) +
                            Integer.toString(nonce) +
                            data);
		return calculatedhashSHA1;
        }
        //Increases nonce value until hashSHA256 target is reached.
	public void mineBlock1(int difficulty) {
		String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!hashSHA1.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hashSHA1 = calculateSHA1Hash();
		}
		System.out.println("Block Mined!!! --> calculateSHA256Hash : " + hashSHA1);
        }
    }
//-------------------------------------------------------------------------------------------------------------------------

class BlockSHA224 {
	
        public String hashSHA224;
	public String previousHashSHA224; 
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	private int nonce;
	
	//Block Constructor.  
	public BlockSHA224(String data,String previousHashSHA224) {
		this.data = data;
		this.previousHashSHA224 = previousHashSHA224;
		this.timeStamp = new Date().getTime();
                this.hashSHA224 = calculateSHA224Hash(); //Making sure we do this after we set the other values.
        }
	//Calculate new hashSHA256 based on blocks contents
	public String calculateSHA224Hash() {
		String calculatedhashSHA1;
            calculatedhashSHA1 = StringUtil.applySha224( 
                    previousHashSHA224 +
                            Long.toString(timeStamp) +
                            Integer.toString(nonce) +
                            data);
		return calculatedhashSHA1;
        }
	//Increases nonce value until hashSHA256 target is reached.
	public void mineBlock1(int difficulty) {
		String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!hashSHA224.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hashSHA224 = calculateSHA224Hash();
		}
		System.out.println("Block Mined!!! --> calculateSHA256Hash : " + hashSHA224);
        }
    }
//-----------------------------------------------------------------------------------------------------------------------------

class BlockSHA384 {
	
	public String hashSHA384;
	public String previousHashSHA384; 
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	private int nonce;
	
	//Block Constructor.  
	public BlockSHA384(String data,String previousHashSHA384) {
		this.data = data;
		this.previousHashSHA384 = previousHashSHA384;
		this.timeStamp = new Date().getTime();
                this.hashSHA384 = calculateSHA384Hash(); //Making sure we do this after we set the other values.
        }
	
	//Calculate new hashSHA384 based on blocks contents
	public String calculateSHA384Hash() {
		String calculatedhashSHA384;
            calculatedhashSHA384 = StringUtil.applySha384( 
                    previousHashSHA384 +
                            Long.toString(timeStamp) +
                            Integer.toString(nonce) +
                            data);
		return calculatedhashSHA384;
        }
        //Increases nonce value until hashSHA256 target is reached.
	public void mineBlock1(int difficulty) {
		String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!hashSHA384.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hashSHA384 = calculateSHA384Hash();
		}
		System.out.println("Block Mined!!! --> calculateSHA256Hash : " + hashSHA384);
        }
    }
//---------------------------------------------------------------------------------------------------------------------
class BlockSHA512 {
	
	public String hashSHA512;
	public String previousHashSHA512; 
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	private int nonce;
	
	//Block Constructor.  
	public BlockSHA512(String data,String previousHashSHA512) {
		this.data = data;
		this.previousHashSHA512 = previousHashSHA512;
		this.timeStamp = new Date().getTime();
                this.hashSHA512 = calculateSHA512Hash(); //Making sure we do this after we set the other values.
        }
        //Calculate new hashSHA256 based on blocks contents
	public String calculateSHA512Hash() {
		String calculatedhashSHA512;
            calculatedhashSHA512 = StringUtil.applySha512( 
                    previousHashSHA512 +
                            Long.toString(timeStamp) +
                            Integer.toString(nonce) +
                            data);
		return calculatedhashSHA512;
        }
	//Increases nonce value until hashSHA256 target is reached.
	public void mineBlock1(int difficulty) {
		String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!hashSHA512.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hashSHA512 = calculateSHA512Hash();
		}
		System.out.println("Block Mined!!! --> calculateSHA256Hash : " + hashSHA512);
        }
    }



