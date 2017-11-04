package cn.itcast.tcp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//下载图片的客户端
public class ImageClient {

	public static void main(String[] args) throws Exception{
		//建立tcp的服务
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		//获取socket的输入流对象
		InputStream inputStream = socket.getInputStream();
		//获取文件的输出流对象
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\3.jpg");
		//边读边写
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length = inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//关闭资源
		fileOutputStream.close();
		socket.close();
		
	}
	
}
