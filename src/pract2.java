import java.util.*;
import java.util.Random;
import java.math.BigInteger;

public class pract2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plain text (as a number):");
        BigInteger pt = new BigInteger(sc.next());

        System.out.println("Enter 2 prime numbers:");
        BigInteger p = new BigInteger(sc.next());
        BigInteger q = new BigInteger(sc.next());

        BigInteger n = p.multiply(q);
        BigInteger one = BigInteger.ONE;
        BigInteger two = p.subtract(one);

        BigInteger three = q.subtract(one);
        BigInteger four = two.multiply(three);  // `four` represents phi(n)

        BigInteger e= new BigInteger("7");
        do {
            e = new BigInteger(four.bitLength(), new Random());
        } while ((e.compareTo(one) <= 0) || (e.compareTo(four) >= 0) || (!e.gcd(four).equals(one)));

        System.out.println("Public key (e, n): (" + e + ", " + n + ")");

        BigInteger d = e.modInverse(four);
        System.out.println("Private key (d, n): (" + d + ", " + n + ")");

        BigInteger ct = pt.modPow(e, n);
        System.out.println("Cipher Text: " + ct);

        BigInteger pt1 = ct.modPow(d, n);
        System.out.println("Decrypted plain text: " + pt1);
    }
}
