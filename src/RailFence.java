import java.util.Scanner;
public class RailFence {
    public static void main(String[] args){
        String rf;
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Suhan Shetty, Roll No. 62");

        System.out.println("Enter a string:");
        rf=sc.nextLine();
        int i;

        System.out.println("/n--\nFirst half");
        for(i=0;i<rf.length();i=i+2){
            char c=rf.charAt(i);
            s=s+c;
            System.out.print(c);
        }
        System.out.println("\nSecond half:");
        for(int j=1;j<rf.length();j=j+2){
            char c=rf.charAt(j);
            s=s+c;
            System.out.print(c);
        }
        System.out.println("\n--\nCipher text:"+s);
    }
}
