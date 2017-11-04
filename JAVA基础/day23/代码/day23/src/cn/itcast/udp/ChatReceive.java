package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//群聊接收端
public class ChatReceive extends Thread {
	
	@Override
	public void run() {
		try {
			//建立udp的服务,要监听一个端口
			DatagramSocket socket = new DatagramSocket(9090);
			//准备空的数据包存储数据
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			boolean flag = true;
			while(flag){
				socket.receive(packet);
				// packet.getAddress() 获取对方数据 包的IP地址对象。
				System.out.println(packet.getAddress().getHostAddress()+"说:"+new String(buf,0,packet.getLength()));
			}
			//关闭资源
			socket.close();
		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
