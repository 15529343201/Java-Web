package cn.itcast.javaee.lucene.firstapp;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriter.MaxFieldLength;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;
import cn.itcast.javaee.lucene.entity.Article;

/**
 * Lucene第一个例子
 * @author Administrator
 */

public class FirstApp {
	/**
	 * 创建索引库
	 * 将Article对象放入索引库中的原始记录表中,从而形成词汇表
	 */
	@Test
	public void createIndexDB() throws Exception{
		//创建Article对象
		Article article=new Article(1,"培训","传智是一家IT培训机构");
		//创建Document对象
		Document document = new Document();
		//将Article对象中的三个属性分别绑定到Document对象中
		/*
		 * 参数一:document对象中的属性名叫xid,article对象中的属性名叫id,项目中提倡相同
		 * 参数二:document对象中的属性xid的值,与article对象中相同
		 * 参数三:是否将xid属性值存入由原始记录表中转存入词汇表
		 * 		Store.YES表示该属性值会存入词汇表
		 * 		Store.NO表示该属性值不会存入词汇表
		 * 		项目中提倡非id值都存入词汇表
		 * 参数四:是否将xid属性值进行分词算法
		 * 		Index.ANALYZED表示该属性值会进行词汇拆分
		 * 		Index.NOT_ANALYZED表示该属性值不会进行词汇拆分
		 * 		项目中提倡非id值都进行词汇拆分
		 * 		目前将分词理解为词汇拆分,目前认为一个汉字一个分词拆分
		 */
		document.add(new Field("xid",article.getId().toString(),Store.YES,Index.ANALYZED));
		document.add(new Field("xtitle",article.getTitle(),Store.YES,Index.ANALYZED));
		document.add(new Field("xcontent",article.getContent(),Store.YES,Index.ANALYZED));
		//创建IndexWriter字符流
		/*
		 * 参数一:lucene索引库最终对应于硬盘中的目录,例如:E:/IndexDBDBDB
		 * 参数二:采用什么策略将文本拆分,一个策略就是一个具体的实现类
		 * 参数三:最多将文本拆分出多少词汇,LIMITED表示1w个,即只取前1w个词汇,如果不足1w个词汇,以实际为准
		 */
		Directory directory=FSDirectory.open(new File("E:/IndexDBDBDB"));
		Version version=Version.LUCENE_30;
		Analyzer analyzer=new StandardAnalyzer(version);
		MaxFieldLength maxFieldLength=MaxFieldLength.LIMITED;
		IndexWriter indexWriter=new IndexWriter(directory,analyzer,maxFieldLength);
		//将document对象写入lucene索引库
		indexWriter.addDocument(document);
		//关闭IndexWriter字符流对象
		indexWriter.close();
	}
	
	/*
	 * 根据关键字从索引库中搜索符合条件的内容
	 */
	@Test
	public void findIndexDB() throws Exception{
		//准备工作
		String keywords="培训";
		List<Article> articleList=new ArrayList<Article>();
		Directory directory=FSDirectory.open(new File("E:/IndexDBDBDB"));
		Version version=Version.LUCENE_30;
		Analyzer analyzer=new StandardAnalyzer(version);
		MaxFieldLength maxFieldLength=MaxFieldLength.LIMITED;
		
		//创建IndexSearcher字符流对象
		IndexSearcher indexSearcher=new IndexSearcher(directory);
		//创建查询解析器对象
		/*
		 * 参数一:使用分词器的版本,提倡使用该jar包中的最高版本
		 * 参数二:针对document对象中的那个属性进行搜索
		 */
		QueryParser queryParser=new QueryParser(version,"xcontent",analyzer);
		//创建对象封装查询关键字
		Query query=queryParser.parse(keywords);
		//根据关键字,去索引库中的词汇表搜索
		/*
		 * 参数一:表示封装关键字查询对象,其它QueryParser表示查询解析器
		 * 参数二:MAX_RECODE表示如果根据关键字搜索出来的内容较多,只取前MAX_RECODE个内容
		 * 		不足MAX_RECODE个数的话,以实际为准
		 */
		int MAX_RECODE=100;
		TopDocs topDocs=indexSearcher.search(query,MAX_RECODE);
		//迭代词汇表中符合条件的编号
		for(int i=0;i<topDocs.scoreDocs.length;i++){
			//取出封装编号和分数的ScoreDoc对象
			ScoreDoc scoreDoc=topDocs.scoreDocs[i];
			//取出每一个编号,例如:0,1,2
			int no=scoreDoc.doc;
			//根据编号取索引库中的原始记录表中查询对应的document对象
			Document document=indexSearcher.doc(no);
			//获取document对象中的三个属性值
			String xid=document.get("xid");
			String xtitle=document.get("xtitle");
			String xcontent=document.get("xcontent");
			//封装到article对象中
			Article article=new Article(Integer.parseInt(xid),xtitle,xcontent);
			//将article对象加入到List集合中
			articleList.add(article);
		}
		//迭代结果集
		for(Article a:articleList){
			System.out.println(a);
		}
	}
}







