import java.util.Scanner;
public class Caesar{
    public static void main(String args[]){
        String message,encryptMessage = "";
        int key;
        char ch;

        Scanner sc=new Scanner(System.in);
        System.out.println("Suhan Shetty, Roll No. 62");
        System.out.println("Enter a plain text: ");
        message =sc.nextLine();

        System.out.println("Enter a key: ");
        key=sc.nextInt();

        for(int i=0;i<message.length(); i++){
            ch = message.charAt(i);
            if(Character.isLowerCase(ch)){
                ch=(char)(ch + key);

                if(ch > 'z'){
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                encryptMessage = encryptMessage + ch;
            }
            else if(Character.isUpperCase(ch)){
                ch = (char)(ch + key);

                if(ch > 'z'){
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
                encryptMessage = encryptMessage + ch;
            }
            else{
                encryptMessage = encryptMessage + ch;
            }
        }
        System.out.println("Encrypted Message: " + encryptMessage);
    }
}
