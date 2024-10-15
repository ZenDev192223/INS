import java.security.*;
import java.nio.file.*;

public class DigitalSignature {

    public static void main(String[] args) {

        try{
            System.out.println("Name: Suhan Shetty , RollNo:62");
            KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");
            keygen.initialize(2048);
            KeyPair kp = keygen.generateKeyPair();
            PrivateKey privkey = kp.getPrivate();
            PublicKey pubkey = kp.getPublic();
            byte data[] = Files.readAllBytes(Paths.get("C:\\Users\\suhan\\Documents\\TYCS\\CNS\\Ty.txt"));
            java.security.Signature
                    signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privkey);
            signature.update(data);
            byte DGSIGN[]=signature.sign();
            Files.write(Paths.get("C:\\Users\\suhan\\Documents\\TYCS\\CNS\\Tysign.txt"),DGSIGN,StandardOpenOption.APPEND);
            signature.initVerify(pubkey);
            signature.update(data);
            boolean check = signature.verify(DGSIGN);
            if(check==true)
                System.out.println("Signature Verified");
            else
                System.out.println("Signature not matched");
        }
        catch(Exception e){
            System.out.println();
        }
    }
}
