package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
/*
使用udp协议给feiQ发送信息。

每一个网络通讯程序，都处理自己制定格式的数据，不会任何的格式数据都处理的。（加密）

version:time :sender : ip: flag:content ;
版本：时间：发送者：IP : 标识 ：内容；
                     32
 
udp协议中有一个ip地址称作为广播地址，广播地址就是主机号为255的，如果发送消息的时候是往广播地址发送，那么在同一个网络号的人都可以收到信息。 
 
 */
public class FeiQDemo {
	
	public static void main(String[] args) throws IOException {
		//第一步：建立udp的服务
		DatagramSocket datagramSocket = new DatagramSocket();
		//第二步：准备数据，然后把数据封装 到数据包中，
		String data = getData("feiQ你好");
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getByName("192.168.10.255"), 2425);
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
		sb.append("李克强:");
		sb.append("192.168.10.100:");
		sb.append("32:");
		sb.append(data);
		return sb.toString();
	}
	
	

}
