package Task2;

public class MyCaesar {

	 public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F',
		        'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
		        'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		    private int n; // shift steps (right shift)

		    public MyCaesar(int shiftSteps) {
		        this.n = shiftSteps;
		    }
		 // Encrypt a character according to the given shif steps.
		 // Encrypt: En(x) = (x + n) mod 26. x represents the index of c in the ALPHABET
		 // array
		 public char encryptChar(char c) {
		 // TO DO
			 if(Character.isLetter(c))
			 {
				 char upperCaesar = Character.toUpperCase(c);
				 int index = (upperCaesar - 'A' + n) % 26;
				 
				 if(index < 0) {
					 index +=26;
					 
				 }
				 return ALPHABET[index];
			 }else {
				 return c;
			 }
		 }
		// Encrypt a text using the above function for encrypting a charater.
		 public String encrypt(String input) {
		 // TO DO
			 StringBuilder encText = new StringBuilder();
			 for(char c : input.toCharArray()) {
				 encText.append(encryptChar(c));
			 }
		 return encText.toString();
		 }
		// Decrypt a character according to the given shif steps.
		// Decrypt: Dn(x) = (x – n) mod 26. x represents the index of c in the ALPHABET array
		public char decryptChar(char c) {
		// TO DO
			if(Character.isLetter(c)) {
				int index = IndexOfChar(c);
				if(index != -1) {
					
					int decIndex = (index - n )%26;
					if(decIndex<0)
					{
						decIndex += 26;
					}
					return ALPHABET[decIndex];
				}
			}
		return c;
		}
		private int IndexOfChar(char c) {
			// TODO Auto-generated method stub
			for (int i = 0; i < ALPHABET.length; i++) {
				if(ALPHABET[i] == Character.toUpperCase(c)) {
					return i;
				}
			}
			return -1;
		}
		// Decrypt a encrypted text using the above function for decrypting a charater.
		public String decrypt(String input) {
		// TO DO
			StringBuilder decText = new StringBuilder();
			for(char c : input.toCharArray())
			{
				decText.append(decryptChar(c));
			}
		return decText.toString();
		}
		 public static void main(String[] args) {
			MyCaesar caesar = new MyCaesar(3);
			
			//Test enc and dec
			char ma = 'H';
			System.out.println("Enc chu: "+caesar.encryptChar(ma));
			System.out.println("Dec chu: "+caesar.decryptChar(ma));
			
			System.out.println("----------------------");
			
			String chuoi = "XIN CHAO MOI NGUOI";
			System.out.println("Enc chuoi: "+caesar.encrypt(chuoi));
			System.out.println("Dec chuoi: "+caesar.decrypt(chuoi));
		}
}
