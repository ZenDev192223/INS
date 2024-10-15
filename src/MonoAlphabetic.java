import java.util.Scanner;

public class MonoAlphabetic {


    public static char p[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z', ' '};
    public static char ch[] = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', ' '};

    public static String doEncryption(String s) {
        char ct[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 27; j++) {
                if (p[j] == s.charAt(i)) {
                    ct[i] = ch[j];
                    break;
                }
            }
        }
        return new String(ct);
    }

    public static String doDecryption(String s) {
        char pt[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 27; j++) {
                if (ch[j] == s.charAt(i)) {
                    pt[i] = p[j];
                    break;
                }
            }
        }
        return new String(pt);
    }

    public static void main(String[] args) {
        System.out.println("Suhan Shetty, Roll No. 62");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Text: ");
        String en = in.nextLine();
        String e = doEncryption(en.toLowerCase());
        System.out.println("Encrypted Message : " + e);
        System.out.println("Decrypted Message : " + doDecryption(e));
    }
}
