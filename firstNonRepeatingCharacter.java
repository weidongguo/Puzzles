import java.util.Arrays;
class CH{
	public int counts;
	public int order;

	public CH(){
		counts = 0; order = -1;
	}
}

public class firstNonRepeatingCharacter{
	public static void main(String []argv){
		if(argv.length == 0) {
			System.out.println("Please enter a string in command line");	
			return;	
		}
		char ar[]=(argv[0]).toCharArray();		
		CH chars[] = new CH[256];
		for(int i=0; i < 256; i++)
			chars[i] = new CH();	/* initialize */

		int order = 0;
		for(int i = 0; i < ar.length; i++){			
			int ascii = (int)ar[i];
			System.out.println(ascii);
			(chars[ascii].counts)++;	
			if( chars[ascii].order == -1){
				chars[ascii].order = order;
				order++;		
			}
		}
		int minOrder = 256; 
		char firstNonRepeatingChar = 'N';
		for(int i = 0; i < 256; i++){
			if( (chars[i]).counts == 1){
				if((chars[i]).order	< minOrder){
					firstNonRepeatingChar = (char)i;	
					minOrder = (chars[i]).order;
				}
			}
		}
		System.out.println("The first non-repeating character is " + 
			((minOrder == 256)? "N/A":firstNonRepeatingChar) );
	}
}
