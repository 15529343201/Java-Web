package cn.itcast.review;
/*
线程：

多线程的存在的意义： 解决了一个进程允许多个任务可以同时执行。

多线程的创建方式：
	
	方式一:  继承Thread。
		1. 自定义一个类继承Thread.
		2. 重写Thread的run方法，把自定义线程的任务代码放在run方法上。
		3. 创建Thread类的子类对象，并且调用start方法开启线程。
	
	
	方式二： 实现Runnable接口。。
		1. 自定义一个类实现Runnable接口.
		2. 实现Runnable的run方法。把自定义线程的任务代码放在run方法上。
		3. 创建Runnable实现类的对象。
		4. 创建Thread的对象，然后把Runnable实现类的对象作为参数传递。
		5. 调用Thread对象的start方法开启线程。

java中的同步机制：

出现线程安全问题的根本原因：
	1. 存在两个或者两个以上的线程共享着资源。
	2. 操作资源的代码块必须有语句。
	
	
	1. 同步代码块
		
		同步代码块的格式：
			synchronized(锁对象){
				需要被同步的代码块...
			}
	同步代码块要注意的细节：
		1.锁对象可以是任意的对象。
		2. 锁对象必须 是多线程共享的资源。否则锁不住。
		3. 没有线程安全问题的时候不要使用锁，因为会导致效率降低。
		4. 调用sleep方法并不会释放锁对象，但是调用wait方法的线程就会释放锁对象。
			
	2. 同步函数
			修饰符 synchronized 返回值类型 函数名(形参列表..){
			
			}
	注意： 
		1. 同步函数的锁对象是不能任意的，非静态同步函数的锁对象是this对象，静态函数的锁对象是当前字节码对象。
		2. 同步函数的锁不能由你指定，是固定的。

 */
class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}




class MyThread extends Thread{
	
	@Override
	public void run() {
		//把自定义线程的任务代码代码写在这里。。
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	 }
}

public class Demo14  {
	
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start(); //开启了自定义的线程。线程一旦开启就会执行run方法中的代码块。
		
		
		MyThread2 thread2 = new MyThread2();
		//创建Thread的对象
		Thread t = new Thread(thread2);
		//调用Thread对象的start方法
		t.start();
		
	}
}
