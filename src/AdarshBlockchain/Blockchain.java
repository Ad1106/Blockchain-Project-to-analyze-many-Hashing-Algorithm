package SaurabhJBlockchain;
import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Blockchain {
	
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static ArrayList<BlockMD2> blockchain1 = new ArrayList<BlockMD2>();
    public static ArrayList<BlockMD5> blockchain2 = new ArrayList<BlockMD5>();
    public static ArrayList<BlockSHA1> blockchain3 = new ArrayList<BlockSHA1>();
    public static ArrayList<BlockSHA224> blockchain4 = new ArrayList<BlockSHA224>();
    public static ArrayList<BlockSHA384> blockchain5 = new ArrayList<BlockSHA384>();
    public static ArrayList<BlockSHA512> blockchain6 = new ArrayList<BlockSHA512>();
    
    
	public static int difficulty = 5;

	public static void main(String[] args) {	
		//add our blocks to the blockchain ArrayList:
		long startTime = new Date().getTime();
                Scanner s=new Scanner(System.in);
                System.out.println("Hey please tell , How many blocks you want to enter");
                int n=s.nextInt();
                System.out.println("@@@@@@@@@@@@@@@@ Apply SHA - 256 algo @@@@@@@@@@@@@@@@@");
                System.out.println("Trying to Mine block 1... ");
		addBlockSHA256(new Block("Hi im the first block", "0"));
                for(int i=2;i<=n;i++)
                {
                    System.out.println("Trying to Mine block"+ i);
                    addBlockSHA256(new Block("Yo im the "+i+"th block",blockchain.get(blockchain.size()-1).hashSHA256));
                }
                
                // TODO: Add any no of block(input given by user) using Java loop
                long endTimeSHA256 = new Date().getTime();

		long timeElapsedSHA256 = (endTimeSHA256 - startTime)/1000;
                
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		String blockchainJson = StringUtil.getJson(blockchain);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson);
                System.out.println("Execution time in seconds: " + timeElapsedSHA256);
                
                //-----------------------------------------------------------------------------------------------------------
                System.out.println("@@@@@@@@@@@@@@@@ Apply MD2 algo @@@@@@@@@@@@@@@@@");
                System.out.println("Trying to Mine block 1... ");
		addBlockMD2(new BlockMD2("Hi im the first block", "0"));
                for(int i=2;i<=n;i++)
                {
                    System.out.println("Trying to Mine block"+ i);
                    addBlockMD2(new BlockMD2("Yo im the "+i+"th block",blockchain1.get(blockchain1.size()-1).hashMD2));
                }
                
                // TODO: Add any no of block(input given by user) using Java loop
                long endTime = new Date().getTime();

		long timeElapsed = (endTime - startTime)/1000;
                
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		String blockchainJson1 = StringUtil.getJson(blockchain1);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson1);
                System.out.println("Execution time in seconds: " + timeElapsed);
                //---------------------------------------------------------------------------------------------------------
                
                System.out.println("@@@@@@@@@@@@@@@@ Apply MD5 algo @@@@@@@@@@@@@@@@@");
                System.out.println("Trying to Mine block 1... ");
		addBlockMD5(new BlockMD5("Hi im the first block", "0"));
                for(int i=2;i<=n;i++)
                {
                    System.out.println("Trying to Mine block"+ i);
                    addBlockMD5(new BlockMD5("Yo im the "+i+"th block",blockchain2.get(blockchain2.size()-1).hashMD5));
                }
                
                // TODO: Add any no of block(input given by user) using Java loop
                long endTimeMD5 = new Date().getTime();

		long timeElapsedMD5 = (endTimeMD5 - startTime)/1000;
                
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		String blockchainJson2 = StringUtil.getJson(blockchain2);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson2);
                System.out.println("Execution time in seconds: " + timeElapsedMD5);
                //---------------------------------------------------------------------------------------------------------
                
                System.out.println("@@@@@@@@@@@@@@@@ Apply SHA-1 Algo @@@@@@@@@@@@@@@@@");
                System.out.println("Trying to Mine block 1... ");
		addBlockSHA1(new BlockSHA1("Hi im the first block", "0"));
                for(int i=2;i<=n;i++)
                {
                    System.out.println("Trying to Mine block"+ i);
                    addBlockSHA1(new BlockSHA1("Yo im the "+i+"th block",blockchain3.get(blockchain3.size()-1).hashSHA1));
                }
                
                // TODO: Add any no of block(input given by user) using Java loop
                long endTimeSHA1 = new Date().getTime();

		long timeElapsedSHA1 = (endTimeSHA1 - startTime)/1000;
                
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		String blockchainJson3 = StringUtil.getJson(blockchain3);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson3);
                System.out.println("Execution time in seconds: " + timeElapsedSHA1);
                //---------------------------------------------------------------------------------------------------------
                
                System.out.println("@@@@@@@@@@@@@@@@ Apply SHA-224 Algo @@@@@@@@@@@@@@@@@");
                System.out.println("Trying to Mine block 1... ");
		addBlockSHA224(new BlockSHA224("Hi im the first block", "0"));
                for(int i=2;i<=n;i++)
                {
                    System.out.println("Trying to Mine block"+ i);
                    addBlockSHA224(new BlockSHA224("Yo im the "+i+"th block",blockchain4.get(blockchain4.size()-1).hashSHA224));
                }
                
                // TODO: Add any no of block(input given by user) using Java loop
                long endTimeSHA224 = new Date().getTime();

		long timeElapsedSHA224 = (endTimeSHA224 - startTime)/1000;
                
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		String blockchainJson4 = StringUtil.getJson(blockchain4);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson4);
                System.out.println("Execution time in seconds: " + timeElapsedSHA224);
                //---------------------------------------------------------------------------------------------------------
                
                System.out.println("@@@@@@@@@@@@@@@@ Apply SHA-384 Algo @@@@@@@@@@@@@@@@@");
                System.out.println("Trying to Mine block 1... ");
		addBlockSHA384(new BlockSHA384("Hi im the first block", "0"));
                for(int i=2;i<=n;i++)
                {
                    System.out.println("Trying to Mine block"+ i);
                    addBlockSHA384(new BlockSHA384("Yo im the "+i+"th block",blockchain5.get(blockchain5.size()-1).hashSHA384));
                }
                
                // TODO: Add any no of block(input given by user) using Java loop
                long endTimeSHA384 = new Date().getTime();

		long timeElapsedSHA384 = (endTimeSHA384 - startTime)/1000;
                
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		String blockchainJson5 = StringUtil.getJson(blockchain5);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson5);
                System.out.println("Execution time in seconds: " + timeElapsedSHA384);
                //---------------------------------------------------------------------------------------------------------
                
                System.out.println("@@@@@@@@@@@@@@@@ Apply SHA-512 Algo @@@@@@@@@@@@@@@@@");
                System.out.println("Trying to Mine block 1... ");
		addBlockSHA512(new BlockSHA512("Hi im the first block", "0"));
                for(int i=2;i<=n;i++)
                {
                    System.out.println("Trying to Mine block"+ i);
                    addBlockSHA512(new BlockSHA512("Yo im the "+i+"th block",blockchain6.get(blockchain6.size()-1).hashSHA512));
                }
                
                // TODO: Add any no of block(input given by user) using Java loop
                long endTimeSHA512 = new Date().getTime();

		long timeElapsedSHA512 = (endTimeSHA224 - startTime)/1000;
                
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		String blockchainJson6 = StringUtil.getJson(blockchain6);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson6);
                System.out.println("Execution time in seconds: " + timeElapsedSHA512);
                //---------------------------------------------------------------------------------------------------------
	}
	
	public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
                BlockMD2 currentBlock1; 
		BlockMD2 previousBlock1;
                BlockMD5 currentBlock2; 
		BlockMD5 previousBlock2;
                BlockSHA1 currentBlock3; 
		BlockSHA1 previousBlock3;
                BlockSHA224 currentBlock4; 
		BlockSHA224 previousBlock4;
                BlockSHA384 currentBlock5; 
		BlockSHA384 previousBlock5;
                BlockSHA512 currentBlock6; 
		BlockSHA512 previousBlock6;
		String hashSHA256Target = new String(new char[difficulty]).replace('\0', '0');
                String hashMD2Target = new String(new char[difficulty]).replace('\0', '0');
                String hashMD5Target = new String(new char[difficulty]).replace('\0', '0');
                String hashSHA1Target = new String(new char[difficulty]).replace('\0', '0');
                String hashSHA224Target = new String(new char[difficulty]).replace('\0', '0');
                String hashSHA384Target = new String(new char[difficulty]).replace('\0', '0');
                String hashSHA512Target = new String(new char[difficulty]).replace('\0', '0');
		
		//loop through blockchain to check hashSHA256es:
		for(int i=1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			//compare registered hashSHA256 and calculated hashSHA256:
			if(!currentBlock.hashSHA256.equals(currentBlock.calculateSHA256Hash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hashSHA256 and registered previous hashSHA256
			if(!previousBlock.hashSHA256.equals(currentBlock.previousHashSHA256) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hashSHA256 is solved
			if(!currentBlock.hashSHA256.substring( 0, difficulty).equals(hashSHA256Target)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
                }
                    //--------------------------------------------------------------------------------------------
                    //loop through blockchain to check hashMD2es:
                        for(int j=1; j < blockchain1.size(); j++) {
			currentBlock1 = blockchain1.get(j);
			previousBlock1 = blockchain1.get((j-1));
			//compare registered hashSHA256 and calculated hashSHA256:
			if(!currentBlock1.hashMD2.equals(currentBlock1.calculateMD2Hash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hashSHA256 and registered previous hashSHA256
			if(!previousBlock1.hashMD2.equals(currentBlock1.previousHashMD2) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hashSHA256 is solved
			if(!currentBlock1.hashMD2.substring( 0, difficulty).equals(hashMD2Target)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
                    }
                     //--------------------------------------------------------------------------------------------
                     //loop through blockchain to check hashMD5es:
                        for(int k=1; k < blockchain2.size(); k++) {
			 currentBlock2 = blockchain2.get(k);
			previousBlock2 = blockchain2.get((k-1));
                        //compare registered hashMD5 and calculated hashMD5:
                        if(!currentBlock2.hashMD5.equals(currentBlock2.calculateMD5Hash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hashMD5 and registered previous hashMD5
			if(!previousBlock2.hashMD5.equals(currentBlock2.previousHashMD5) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hashMD5 is solved
			if(!currentBlock2.hashMD5.substring( 0, difficulty).equals(hashMD5Target)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
                    }
                      //-----------------------------------------------------------------------------------------------
                      //loop through blockchain to check hashSHA-1es:
                        for(int l=1; l < blockchain3.size(); l++) {
			 currentBlock3 = blockchain3.get(l);
			previousBlock3 = blockchain3.get((l-1));
                        //compare registered hashSHA1 and calculated hashSHA1:
			if(!currentBlock3.hashSHA1.equals(currentBlock3.calculateSHA1Hash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hashSHA1 and registered previous hashSHA1
			if(!previousBlock3.hashSHA1.equals(currentBlock3.previousHashSHA1) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hashSHA1 is solved
			if(!currentBlock3.hashSHA1.substring( 0, difficulty).equals(hashSHA1Target)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
                    }
                        //----------------------------------------------------------------------------------------------- 
                        //compare registered hashSHA224 and calculated hashSHA224:
			for(int m=1; m < blockchain4.size(); m++) {
			 currentBlock4 = blockchain4.get(m);
			previousBlock4 = blockchain4.get((m-1));
                        //compare registered hashSHA1 and calculated hashSHA1:
			if(!currentBlock4.hashSHA224.equals(currentBlock4.calculateSHA224Hash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hashSHA1 and registered previous hashSHA1
			if(!previousBlock4.hashSHA224.equals(currentBlock4.previousHashSHA224) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hashSHA1 is solved
			if(!currentBlock4.hashSHA224.substring( 0, difficulty).equals(hashSHA224Target)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
                    }
                        //----------------------------------------------------------------------------------------------- 
                        for(int n=1; n < blockchain5.size(); n++) {
			 currentBlock5 = blockchain5.get(n);
			previousBlock5 = blockchain5.get((n-1));
                        //compare registered hashSHA384 and calculated hashSHA384:
			if(!currentBlock5.hashSHA384.equals(currentBlock5.calculateSHA384Hash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hashSHA384 and registered previous hashSHA384
			if(!previousBlock5.hashSHA384.equals(currentBlock5.previousHashSHA384) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hashSHA384 is solved
			if(!currentBlock5.hashSHA384.substring( 0, difficulty).equals(hashSHA384Target)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
                    }
                        //----------------------------------------------------------------------------------------------- 
                        for(int z=1; z < blockchain6.size(); z++) {
			 currentBlock6 = blockchain6.get(z);
			previousBlock6 = blockchain6.get((z-1));
                        //compare registered hashSHA512 and calculated hashSHA512:
			if(!currentBlock6.hashSHA512.equals(currentBlock6.calculateSHA512Hash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hashSHA512 and registered previous hashSHA512
			if(!previousBlock6.hashSHA512.equals(currentBlock6.previousHashSHA512) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hashSHA512 is solved
			if(!currentBlock6.hashSHA512.substring( 0, difficulty).equals(hashSHA512Target)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
                    }
                             
            return true;
        
        }
        
	public static void addBlockSHA256(Block newBlock) {
		newBlock.mineBlock1(difficulty);
		blockchain.add(newBlock);
        }
        
        public static void addBlockMD2(BlockMD2 newBlock) {
		newBlock.mineBlock1(difficulty);
		blockchain1.add(newBlock);
        }
        
        public static void addBlockMD5(BlockMD5 newBlock) {
		newBlock.mineBlock1(difficulty);
		blockchain2.add(newBlock);
        }
        
        public static void addBlockSHA1(BlockSHA1 newBlock) {
		newBlock.mineBlock1(difficulty);
		blockchain3.add(newBlock);
        }
        
        public static void addBlockSHA224(BlockSHA224 newBlock) {
		newBlock.mineBlock1(difficulty);
		blockchain4.add(newBlock);
        }
        
        public static void addBlockSHA384(BlockSHA384 newBlock) {
		newBlock.mineBlock1(difficulty);
		blockchain5.add(newBlock);
        }
        
        public static void addBlockSHA512(BlockSHA512 newBlock) {
		newBlock.mineBlock1(difficulty);
		blockchain6.add(newBlock);
        }
}