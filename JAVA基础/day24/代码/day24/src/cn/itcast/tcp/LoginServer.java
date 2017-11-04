package cn.itcast.tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class LoginServer extends Thread {

	Socket socket;

	static File file = new File("F:\\users.properties");

	public LoginServer(Socket socket) {
		this.socket = socket;
	}

	static {
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
	while(true){
			
			try {
				// 获取socket的输入流对象
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				// 获取socket的输出流对象
				OutputStreamWriter socketOut = new OutputStreamWriter(
						socket.getOutputStream());
	
				// 读取客户端输入的信息
				String info = bufferedReader.readLine();
				String[] datas = info.split(" ");
				// 获取到用户 的选择功能
				String option = datas[0];
				// 注册
				String userName = datas[1];
	
				String password = datas[2];
	
				if ("a".equalsIgnoreCase(option)) {
					// 登陆
					Properties properties = new Properties();
					// 加载配置文件
					properties.load(new FileReader(file));
					if (properties.containsKey(userName)) {
						String tempPass = properties.getProperty(userName);
						if (password.equals(tempPass)) {
							socketOut.write("欢迎" + userName + "登陆成功\r\n");
	
						} else {
							socketOut.write("密码错误\r\n");
						}
	
					} else {
						socketOut.write("用户名不存在，请重新输入...\r\n");
					}
	
					socketOut.flush();
	
				} else if ("b".equalsIgnoreCase(option)) {
	
					// 创建一个配置文件类
					Properties properties = new Properties();
					//加载原来的配置文件
					properties.load(new FileReader(file));
					if (!properties.containsKey(userName)) {
						// 不存在该用户名
						properties.setProperty(userName, password);
						// 生成一个配置文件
						properties.store(new FileWriter(file), "users");
						socketOut.write("注册成功..\r\n");
					} else {
						// 存在用户名
						socketOut.write("用户名已经被注册，请重新输入\r\n");
					}
					socketOut.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9090);
		while (true) {
			Socket socket = serverSocket.accept();
			new LoginServer(socket).start();
		}

	}

}
