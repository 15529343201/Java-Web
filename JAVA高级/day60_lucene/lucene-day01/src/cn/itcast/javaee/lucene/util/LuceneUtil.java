package cn.itcast.javaee.lucene.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.index.IndexWriter.MaxFieldLength;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import cn.itcast.javaee.lucene.entity.Article;

/**
 * 工具类
 * @author Administrator
 *
 */
public class LuceneUtil {
	
	private static Directory directory;
	private static Version version;
	private static Analyzer analyzer;
	private static MaxFieldLength maxFieldLength;
	
	static{
		try {
			directory=FSDirectory.open(new File("E:/IndexDBDBDB"));
			version=Version.LUCENE_30;
			analyzer=new StandardAnalyzer(version);
			maxFieldLength=MaxFieldLength.LIMITED;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static Directory getDirectory() {
		return directory;
	}
	public static Version getVersion() {
		return version;
	}
	public static Analyzer getAnalyzer() {
		return analyzer;
	}
	public static MaxFieldLength getMaxFieldLength() {
		return maxFieldLength;
	}
	
	//不让外界new该帮助类
	private LuceneUtil(){}
	
	//将javabean转成Document对象
	public static Document javabean2document(Object obj) throws Exception{
		//创建Document对象
		Document document=new Document();
		//获取obj引用的对象字节码
		Class clazz=obj.getClass();//class cn.itcast.javaee.lucene.entity.Article
		//通过对象字节码获取私有的属性
		java.lang.reflect.Field[] reflectFields=clazz.getDeclaredFields();
		//迭代
		for(java.lang.reflect.Field reflectField:reflectFields){
			//强力反射
			reflectField.setAccessible(true);
			//获取属性名,id/title/content
			String name=reflectField.getName();
			//人工拼接方法名
			String methodName="get"+name.substring(0,1).toUpperCase()+name.substring(1);
			//获取方法,例如:getId()/getTitle()/getContent()
			java.lang.reflect.Method method=clazz.getMethod(methodName, null);
			//执行方法
			String value=method.invoke(obj, null).toString();
			/*System.out.println(value);
			1
			培训
			传智是一家培训机构*/
			document.add(new Field(name,value,Store.YES,Index.ANALYZED));
		}
		//返回document对象
		return document;
	}
	
	//将document对象转成javabean对象
	public static Object document2javabean(Document document,Class clazz) throws Exception{
		Object obj=clazz.newInstance();
		java.lang.reflect.Field[] reflectFields=clazz.getDeclaredFields();
		for(java.lang.reflect.Field reflectField:reflectFields){
			reflectField.setAccessible(true);
			String name=reflectField.getName();//id/title/content
			String value=document.get(name);//1/培训/传智是一家培训机构
			BeanUtils.setProperty(obj, name, value);//封装javabean对应的属性中去,通过setXxx()方法
		}
		return obj;
	}
	
	//测试
	public static void main(String[] args) throws Exception{
		Article article=new Article(1,"培训","传智是一家培训机构");
		Document document=LuceneUtil.javabean2document(article);
//		System.out.println(document.get("id"));
//		System.out.println(document.get("title"));
//		System.out.println(document.get("content"));
		/*
		 * 1
			培训
			传智是一家培训机构
		 */
		System.out.println("---------------------------------------");
		Article article1=(Article) LuceneUtil.document2javabean(document, Article.class);
		System.out.println(article1);
		/*
		 * ---------------------------------------
			编号:1
			标题:培训
			内容:传智是一家培训机构
		 */
	}
}
