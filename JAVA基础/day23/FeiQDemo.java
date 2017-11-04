package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
/*
ʹ��udpЭ���feiQ������Ϣ��

ÿһ������ͨѶ���򣬶������Լ��ƶ���ʽ�����ݣ������κεĸ�ʽ���ݶ�����ġ������ܣ�

version:time :sender : ip: flag:content ;
�汾��ʱ�䣺�����ߣ�IP : ��ʶ �����ݣ�
                     32
 
udpЭ������һ��ip��ַ����Ϊ�㲥��ַ���㲥��ַ����������Ϊ255�ģ����������Ϣ��ʱ�������㲥��ַ���ͣ���ô��ͬһ������ŵ��˶������յ���Ϣ�� 
 
 */
public class FeiQDemo {
	
	public static void main(String[] args) throws IOException {
		//��һ��������udp�ķ���
		DatagramSocket datagramSocket = new DatagramSocket();
		//�ڶ�����׼�����ݣ�Ȼ������ݷ�װ �����ݰ��У�
		String data = getData("feiQ���");
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getByName("192.168.10.255"), 2425);
		//�������� ����udp�ķ���������
		datagramSocket.send(datagramPacket);
		//�ر���Դ
		datagramSocket.close();
	}
	
	//��������װ��feiQ����ĸ�ʽ����
	public static String getData(String data){
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis()+":");
		sb.append("���ǿ:");
		sb.append("192.168.10.100:");
		sb.append("32:");
		sb.append(data);
		return sb.toString();
	}
	
	

}
