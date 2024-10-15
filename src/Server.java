import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args)throws IOException {
        System.out.println("Name: Suhan Shetty, RollNo:62");
        System.out.println("Server side code ");
        Socket socket;
        ServerSocket serversocket=new ServerSocket(8081);
        java.io.InputStreamReader insr=null;
        java.io.OutputStreamWriter oswr=null;
        java.io.BufferedReader br=null;
        java.io.BufferedWriter bw=null;
        while(true){
            try{
                socket=serversocket.accept();
                insr=new InputStreamReader(socket.getInputStream());
                oswr=new OutputStreamWriter(socket.getOutputStream());
                br= new BufferedReader(insr);
                bw= new BufferedWriter(oswr);
                while(true){
                    String msgfromclient=br.readLine();
                    System.out.println(msgfromclient);
                    bw.write("Message Received");
                    bw.newLine();
                    bw.flush();
                    if(msgfromclient.equalsIgnoreCase("BYE")){
                        break;
                    }

                }
                bw.close();
            }
            catch(Exception e){
                System.out.println("Error: "+e);
            }
        }
    }
}
