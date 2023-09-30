package Task3;

public class MyCaesar {
    private int n; // shift steps (right shift)

    public MyCaesar(int shiftSteps) {
        this.n = shiftSteps;
    }

    // Encrypt a character according to the given shift steps.
    public char encryptChar(char c) {
        if (Character.isLetter(c)) {
            int offset = Character.isUpperCase(c) ? 'A' : 'a';
            return (char) (((c - offset + n) % 26 + 26) % 26 + offset);
        } else if (Character.isDigit(c)) {
            return (char) (((c - '0' + n) % 10 + 10) % 10 + '0');
        } else {
            return c; // Leave special characters unchanged
        }
    }

    // Encrypt a text using the above function for encrypting a character.
    public String encrypt(String input) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : input.toCharArray()) {
            encryptedText.append(encryptChar(c));
        }
        return encryptedText.toString();
    }

    // Decrypt a character according to the given shift steps.
    public char decryptChar(char c) {
        if (Character.isLetter(c)) {
            int offset = Character.isUpperCase(c) ? 'A' : 'a';
            return (char) (((c - offset - n) % 26 + 26) % 26 + offset);
        } else if (Character.isDigit(c)) {
            return (char) (((c - '0' - n) % 10 + 10) % 10 + '0');
        } else {
            return c; // Leave special characters unchanged
        }
    }

    // Decrypt an encrypted text using the above function for decrypting a character.
    public String decrypt(String input) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : input.toCharArray()) {
            decryptedText.append(decryptChar(c));
        }
        return decryptedText.toString();
    }

    // Testing the implementation
    public static void main(String[] args) {
        MyCaesar caesar = new MyCaesar(3); // Shift by 3 positions

        // Test encryption and decryption of characters, numbers, and special characters
        char originalChar = 'H';
        char encryptedChar = caesar.encryptChar(originalChar);
        char decryptedChar = caesar.decryptChar(encryptedChar);

        System.out.println("Char ban dau: " + originalChar);
        System.out.println("Char ma hoa: " + encryptedChar);
        System.out.println("Char giai ma: " + decryptedChar);

        String originalText = "Hello, World! 123";
        String encryptedText = caesar.encrypt(originalText);
        String decryptedText = caesar.decrypt(encryptedText);

        System.out.println("Text ban dau: " + originalText);
        System.out.println("Text ma hoa: " + encryptedText);
        System.out.println("Text giai ma: " + decryptedText);
    }
}
