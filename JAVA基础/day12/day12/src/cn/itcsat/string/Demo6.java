package cn.itcsat.string;
/*
需求1：自己实现trim的方法。

需求2： 获取上传文件名  "D:\\20120512\\day12\\Demo1.java"。

需求3：	将字符串对象中存储的字符反序。    新中国好     -----> 好国中新

需求4： 求一个子串在整串中出现的次数 。 
	

*/
public class Demo6 {
	
	public static void main(String[] args) {
		String str  ="        传智        播客             ";	
		System.out.println(myTrim(str));
		
		str =  "D:\\20120512\\day12\\Demo1.java";
		getFileName(str);
		
		str = "新中国好";
		System.out.println("翻转后的字符串："+ reverse(str));
		
		str = "abcjavaabcjavaphpjava";  //java
		getCount(str, "java");
		
	}
	
	
	//统计子串出现 的次数
	public static void getCount(String str,String target){
		int count = 0 ; //用于记录出现的次数
		int fromIndex  = 0; // 记录从那个索引值开始寻找目标子串
		while((fromIndex = str.indexOf(target, fromIndex))!=-1){
			//如果indexof方法返回 的不是-1，那么就是已经找到了目标 元素。
			count++;
			fromIndex = fromIndex+target.length();
		}
		System.out.println("出现的次数："+ count);
	}
	
	
	
	public static String reverse(String str){
		char[] arr = str.toCharArray();
		for(int startIndex = 0 , endIndex=arr.length-1 ; startIndex<endIndex; startIndex++,endIndex--){
				char temp = arr[startIndex];
				arr[startIndex] = arr[endIndex];
				arr[endIndex] = temp;
		}
		//使用字符数组构建一个字符串。
		return new String(arr);
	}
	
	
	
	
	
	//需求2： 获取上传文件名  "D:\\20120512\\day12\\Demo1.java"。
	public static void getFileName(String path){
		int index = path.lastIndexOf("\\");
		String fileName = path.substring(index+1);
		System.out.println("文件名："+ fileName);
	}
	
	
	
//	需求1：自己实现trim的方法。
	public static String myTrim(String str){
		//先转换成字符 数组
		char[] arr = str.toCharArray();
		//定义两个 变量记录开始与结束 的索引值
		int startIndex = 0 ;
		int endIndex = arr.length -1;
		//确定开始 的索引值
		while(true){
			if(arr[startIndex]==' '){
				startIndex++;
			}else{
				break;
			}
		}
		//确定结束 的索引值：
		while(true){
			if(arr[endIndex]==' '){
				endIndex--;
			}else{
				break;
			}
		}
		//截取子串返回
		return str.substring(startIndex,endIndex+1);		
	}
	

}
