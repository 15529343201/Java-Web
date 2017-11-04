package test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class FeiQDemo {
	
	public static void main(String[] args) throws IOException {
		//第一步：建立udp的服务
		DatagramSocket datagramSocket = new DatagramSocket();
		//第二步：准备数据，然后把数据封装 到数据包中，
		String data = getData("大家早上好！");
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getByName("192.168.15.255"), 2425);
		//第三步： 调用udp的服务发送数据
		datagramSocket.send(datagramPacket);
		//关闭资源
		datagramSocket.close();
	}
	
	//把数据组装成feiQ处理的格式数据
	public static String getData(String data){
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis()+":");
		sb.append("孔凡江:");
		sb.append("192.168.15.31:");
		sb.append("32:");
		sb.append(data);
		return sb.toString();
	}
	
	

}
