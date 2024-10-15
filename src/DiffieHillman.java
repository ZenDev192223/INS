import java.util.*;
import java.math.BigInteger;

class DiffieHillman {
    public static void main(String[] args) {
        System.out.println("Name: Suhan Shetty, RollNo:62");
        Scanner sc = new Scanner(System.in);
        BigInteger q,alpha,xa,xb,ya,yb,Ka,Kb;

        System.out.println("Enter the value of q and alpha : ");
        q=sc.nextBigInteger();
        alpha=sc.nextBigInteger();
        System.out.println("Enter Alices secret key : ");
        xa=sc.nextBigInteger();
        System.out.println("Enter Bobs secret key : ");
        xb=sc.nextBigInteger();
        ya =alpha.modPow(xa,q);
        yb =alpha.modPow(xb,q);
        System.out.println("Ya= "+ya);
        System.out.println("Yb= "+yb);
        Ka=yb.modPow(xa,q);
        Kb=ya.modPow(xb,q);
        System.out.println("Secret value of Alice : "+Ka);
        System.out.println("Secret value of Bob : "+Kb);
    }
}
