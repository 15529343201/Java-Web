package cn.itcast.javaee.lucene.search;

import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.junit.Test;

import cn.itcast.javaee.lucene.entity.Article;
import cn.itcast.javaee.lucene.util.LuceneUtil;

/**
 * 演示Lucene中，根据多个字段搜索
 * @author AdminTC
 */
public class ArticleDao {
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
		String keywords = "机构";
		List<Article> articleList = new ArrayList<Article>();
		
		//单字段搜索
		//QueryParser queryParser = new QueryParser(LuceneUtil.getVersion(),"title",LuceneUtil.getAnalyzer());
		
		//多字段搜索，好处：搜索的范围大，最大限度匹配搜索结果
		QueryParser queryParser = 
			new MultiFieldQueryParser(
					LuceneUtil.getVersion(),
					new String[]{"content","title"},
					LuceneUtil.getAnalyzer());
		
		
		Query query = queryParser.parse(keywords);
		IndexSearcher indexSearcher = new IndexSearcher(LuceneUtil.getDirectory());
		
		TopDocs topDocs = indexSearcher.search(query,100);
		
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





