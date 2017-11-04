package cn.itcast.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 聊天的服务端
 */
public class ChatServer {

	public static void main(String[] args) throws IOException {
		//建立tcp的服务端
		ServerSocket serverSocket = new ServerSocket(9090);
		//接受客户端的连接，产生一个SOcket
		Socket socket = serverSocket.accept();
		//获取到Socket的输入流对象
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//获取到Socket输出流对象
		OutputStreamWriter socketOut =  new OutputStreamWriter(socket.getOutputStream());
		
		//获取键盘的输入流对象
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		//读取客户端的数据
		String line = null;
		while((line = socketReader.readLine())!=null){
			System.out.println("服务端接收到的数据："+ line);
			
			System.out.println("请输入回送给客户端的数据：");
			line = keyReader.readLine();
			socketOut.write(line+"\r\n");
			socketOut.flush();
		}
		
		//关闭资源
		serverSocket.close();
	}
	
}
