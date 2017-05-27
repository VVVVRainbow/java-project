/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 通信;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VE
 */
public class 服务端 { 
    ServerSocket  serversocket;
  
    public 服务端() throws IOException {
        this.serversocket = new ServerSocket(1888);
    }
    public void start() throws IOException
    {  
       Socket socket=serversocket.accept();
       new ServerThead(socket).start();
    }

    
    public class ServerThead extends Thread{
        Socket socket;
        ServerThead(Socket socket){
            this.socket=socket;
        }
        public void run(){
            System.out.print("这里是服务端！\n");
            try {
                Writer output=new OutputStreamWriter(socket.getOutputStream());//------
                DataInputStream input=new DataInputStream(socket.getInputStream());
                System.out.println("连接成功！客户信息："+input.readUTF());
                Scanner scanner=new Scanner(System.in);
                System.out.print("请输入您要回应的信息：");
                output.write(scanner.next());
                output.flush();
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(服务端.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                serversocket.close();
            } catch (IOException ex) {
                Logger.getLogger(服务端.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    static public void main(String[] args) throws IOException{
        new 服务端().start();
    }
}
