package cn.itcast.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/*
日期类 Date 
 

Calendar
 
 
日期格式化类    SimpleDateFormat
 
 */
public class Demo3  {
	
	public static void main(String[] args) throws ParseException {
		/*Date date = new Date(); // 获取当前的系统时间
		System.out.println("年份："+ date.getYear());*/
		/*
		Calendar calendar = Calendar.getInstance(); //获取当前的系统时间。
		System.out.println("年："+ calendar.get(Calendar.YEAR));
		System.out.println("月："+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("日："+ calendar.get(Calendar.DATE));
		
		System.out.println("时："+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分："+ calendar.get(Calendar.MINUTE));
		System.out.println("秒："+ calendar.get(Calendar.SECOND));
		
		// 显示 当前系统时间: 2014年12月26日  xx时xx分xx秒   
		
		 *  日期格式化类    SimpleDateFormat 
		 *  		作用1： 可以把日期转换转指定格式的字符串     format()
		 *  		作用2： 可以把一个 字符转换成对应的日期。    parse()   生日
		 *  	
		 */
		Date date = new Date(); //获取当前的系统时间。
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss") ; //使用了默认的格式创建了一个日期格式化对象。
		String time = dateFormat.format(date);  //可以把日期转换转指定格式的字符串
		System.out.println("当前的系统时间："+ time);
		
		String birthday = "2000年12月26日   11:29:08";
		Date date2 = dateFormat.parse(birthday);  //注意： 指定的字符串格式必须要与SimpleDateFormat的模式要一致。
		System.out.println(date2);
		
		Date date21 =new Date();
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		String time2 =dateFormat.format(date21);
		String time21=dateFormat.format(date);
		System.out.println("当前的系统时间："+time);
		String birthday1= "2000年12月26日  11:28:08";
		Date date22=dateFormat.parse(birthday1);
		System.out.println(date22);
	}
}
