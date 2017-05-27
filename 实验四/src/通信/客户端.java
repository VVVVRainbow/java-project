/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 通信;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author VE
 */
public class 客户端 {
    Socket socket;

    public 客户端() throws IOException {
        this.socket = new Socket(InetAddress.getLoopbackAddress(),1888);
    }
    public void go() throws IOException, InterruptedException{
       // boolean autoflush=true;
        //PrintWriter out =new PrintWriter(socket.getOutputStream(),autoflush);
        System.out.print("这里是客户端！\n");
        DataOutputStream output=new DataOutputStream(socket.getOutputStream());
        BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));//读取控制命令
//发送消息

Scanner scanner=new Scanner(System.in);
System.out.print("请输入您要传递的信息：");
String x=scanner.next();
output.writeUTF(x);
//下面是接受回应
String cmd=input.readLine();
System.out.print("回应信息："+cmd);
    }
    static public void main(String[] args) throws IOException, InterruptedException
    {
        new 客户端().go();
    }
}
