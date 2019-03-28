package cn.itcast.javaee.lucene.sort;

import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.Sort;
import org.apache.lucene.search.SortField;
import org.apache.lucene.search.TopDocs;
import org.junit.Test;

import cn.itcast.javaee.lucene.entity.Article;
import cn.itcast.javaee.lucene.util.LuceneUtil;

/**
 * 演示Lucene中，根据单个或多个字段排序
 * @author AdminTC
 */
public class ArticleDao2 {
	/**
	 * 增加document对象索引库中
	 */
	@Test
	public void add() throws Exception{
		Article article = new Article(1,"培训","传智是一家it培训机构",10);
		//Article article = new Article(2,"培训","北大是一家it培训机构",20);
		//Article article = new Article(3,"培训","中大是一家it培训机构",20);
		//Article article = new Article(4,"培训","小大是一家it培训机构",30);
		Document document = LuceneUtil.javabean2document(article);
		IndexWriter indexWriter = new IndexWriter(LuceneUtil.getDirectory()	,LuceneUtil.getAnalyzer(),LuceneUtil.getMaxFieldLength());
		indexWriter.addDocument(document);
		indexWriter.close();
	}
	
	
	
	
	
	
	@Test
	public void findAll() throws Exception{
		String keywords = "培训";
		List<Article> articleList = new ArrayList<Article>();
		
		QueryParser queryParser = new QueryParser(LuceneUtil.getVersion(),"content",LuceneUtil.getAnalyzer());
		Query query = queryParser.parse(keywords);
		IndexSearcher indexSearcher = new IndexSearcher(LuceneUtil.getDirectory());
		
		
		//按得分度高低排序
		//TopDocs topDocs = indexSearcher.search(query,100);
		
		//创建排序对象
		//参数一：id表示依据document对象中的哪个字段排序，例如：id
		//参数二：SortField.INT表示document对象中该字段的类型，以常量方式书写
		//参数三：true表示降序，类似于order by id desc
		//参数三：false表示升序，类似于order by id asc
		//Sort sort = new Sort(new SortField("id",SortField.INT,false));
		
		//按count字段的降序排列，如果count字段相同的话，再按id的升序排序
		Sort sort = new Sort(
				new SortField("count",SortField.INT,true),
				new SortField("id",SortField.INT,false));
		
		//sort表示排序的条件
		TopDocs topDocs = indexSearcher.search(query,null,100,sort);
		
		for(int i=0;i<topDocs.scoreDocs.length;i++){
			ScoreDoc scoreDoc = topDocs.scoreDocs[i];
			int no = scoreDoc.doc;
			Document document = indexSearcher.doc(no);
			Article article = (Article) LuceneUtil.document2javabean(document,Article.class);
			articleList.add(article);
		}
		for(Article a : articleList){
			System.out.println(a);
		}
	}
}

/*
编号:4标题:培训内容:小大是一家it培训机构字数: 30
编号:2标题:培训内容:北大是一家it培训机构字数: 20
编号:3标题:培训内容:中大是一家it培训机构字数: 20
编号:1标题:培训内容:传智是一家it培训机构字数: 10
 */



