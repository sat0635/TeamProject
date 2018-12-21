import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer implements Runnable {

    public static final int ServerPort = 25569;
    public static final String ServerIP = "155.230.91.229";
    //public static String[][] location = new String[1][1];
    public static String child="hello";
    @Override
    public void run() {

        try {
            System.out.println("S: Connecting...");
            ServerSocket serverSocket = new ServerSocket(ServerPort);//create server socket
                while(true){
          //waiting until client accept
                Socket client = serverSocket.accept(); // when client accpet, return socket object\

                System.out.println("S: Receiving...");

                try (OutputStream sender = client.getOutputStream();
                        InputStream receiver = client.getInputStream();){

                        String message = "hello";
                        byte[] data = message.getBytes();

                        data = new byte[100];
                        receiver.read(data, 0, data.length);

                        message = new String(data);

                        if ( message.charAt(0)=='1' ){//아이
                                child = message;
                                System.out.println("this is child        "+child);

                        }
                        else{
                                data2 = new byte[100];
                                data2 = child.getBytes();
                                System.out.println("this is parent   "+message);
                                sender.write(data2, 0, data2.length);

                                System.out.println("parent message    " +child);
                        }


                    System.out.println("S: Received: '" + message + "'");

                    //PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())), true);
                    //out.println("Server Received " + str);
                        //message = "hello2";
                        //sender.write(data, 0, data.length);


                } catch (Exception e) {
                    System.out.println("S: Error");
                    e.printStackTrace();

                }
            }
        } catch (Exception e) {
            System.out.println("S: Error");
            e.printStackTrace();
        }
        }


    public static void main(String[] args) {

        Thread desktopServerThread = new Thread(new TCPServer());
        desktopServerThread.start();

    }

}
