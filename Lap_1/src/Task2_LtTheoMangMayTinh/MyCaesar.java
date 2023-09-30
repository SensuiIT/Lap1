package Task2_LtTheoMangMayTinh;


public class MyCaesar {
    public static final char[] ALPHABET = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
        'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    private int n; // shift steps (right shift)

    public MyCaesar(int shiftSteps) {
        this.n = shiftSteps;
    }

    // Encrypt a character according to the given shift steps.
    // Encrypt: En(x) = (x + n) mod 26. x represents the index of c in the ALPHABET array.
    public char encryptChar(char c) {
        int index = new String(ALPHABET).indexOf(c);
        if (index != -1) {
            index = (index + n) % ALPHABET.length;
            return ALPHABET[index];
        }
        return c; // Return the character as is if not found in the alphabet.
    }

    // Encrypt a text using the above function for encrypting a character.
    public String encrypt(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(encryptChar(c));
        }
        return result.toString();
    }

    // Decrypt a character according to the given shift steps.
    // Decrypt: Dn(x) = (x - n + 26) mod 26. x represents the index of c in the ALPHABET array.
    public char decryptChar(char c) {
        int index = new String(ALPHABET).indexOf(c);
        if (index != -1) {
            index = (index - n + 26) % ALPHABET.length;
            return ALPHABET[index];
        }
        return c; // Return the character as is if not found in the alphabet.
    }

    // Decrypt a text using the above function for decrypting a character.
    public String decrypt(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(decryptChar(c));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        MyCaesar caesar = new MyCaesar(3); // Shift steps = 3

        char encryptedChar = caesar.encryptChar('A');

        System.out.println(encryptedChar);

        String text = "HELLO";
        String encryptedText = caesar.encrypt(text);
        System.out.println(encryptedText);

        String decryptedText = caesar.decrypt(encryptedText);
        System.out.println(decryptedText);
    }
}
