package cn.itcast.javaee.lucene.secondapp;

import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.junit.Test;
import cn.itcast.javaee.lucene.entity.Article;
import cn.itcast.javaee.lucene.util.LuceneUtil;

/**
 * 重构FirstApp
 * @author Administrator
 *
 */
public class SecondApp {
	/**
	 * 创建索引库
	 */
	@Test
	public void createIndexDB() throws Exception{
		Article article=new Article(1,"培训","传智是一家it培训机构");
		//Article article=new Article(2,"培训","北大是一家it培训机构");
		//Article article=new Article(3,"培训","中大是一家it培训机构");
		Document document=LuceneUtil.javabean2document(article);
		IndexWriter indexWriter=new IndexWriter(LuceneUtil.getDirectory(),LuceneUtil.getAnalyzer(),LuceneUtil.getMaxFieldLength());
		indexWriter.addDocument(document);
		indexWriter.close();
	}
	
	/**
	 * 根据关键字从索引库中查询符合条件的数据
	 */
	@Test
	public void findIndexDB() throws Exception{
		String keywords="培";
		List<Article> articleList=new ArrayList<Article>();
		QueryParser queryParser=new QueryParser(LuceneUtil.getVersion(), "content", LuceneUtil.getAnalyzer());
		Query query=queryParser.parse(keywords);
		IndexSearcher indexSearcher=new IndexSearcher(LuceneUtil.getDirectory());
		TopDocs topDocs=indexSearcher.search(query, 100);
		for(int i=0;i<topDocs.scoreDocs.length;i++){
			ScoreDoc scoreDoc=topDocs.scoreDocs[i];
			int no=scoreDoc.doc;
			Document document=indexSearcher.doc(no);
			Article article=(Article)LuceneUtil.document2javabean(document, Article.class);
			articleList.add(article);
		}
		for(Article a:articleList){
			System.out.println(a);
			/*
			 * 编号:1
			标题:培训
			内容:传智是一家it培训机构
			编号:2
			标题:培训
			内容:北大是一家it培训机构
			编号:3
			标题:培训
			内容:中大是一家it培训机构

			 */
		}
	}

}
