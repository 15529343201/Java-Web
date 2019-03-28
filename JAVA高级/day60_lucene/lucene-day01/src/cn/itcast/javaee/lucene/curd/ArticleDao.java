package cn.itcast.javaee.lucene.curd;

import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.junit.Test;

import cn.itcast.javaee.lucene.entity.Article;
import cn.itcast.javaee.lucene.util.LuceneUtil;

/*
 * 增删改查索引库
 */
public class ArticleDao {
	@Test
	public void add() throws Exception{
		Article article=new Article(1, "培训", "传智是一家java培训机构");
		Document document=LuceneUtil.javabean2document(article);
		IndexWriter indexWriter=new IndexWriter(LuceneUtil.getDirectory(),LuceneUtil.getAnalyzer(),LuceneUtil.getMaxFieldLength());
		indexWriter.addDocument(document);//核心
		indexWriter.close();
	}
	
	@Test
	public void addAll() throws Exception{
		IndexWriter indexWriter=new IndexWriter(LuceneUtil.getDirectory(),LuceneUtil.getAnalyzer(),LuceneUtil.getMaxFieldLength());

		Article article1=new Article(1, "培训", "传智是一家java培训机构");
		Document document1=LuceneUtil.javabean2document(article1);
		indexWriter.addDocument(document1);
		
		Article article2=new Article(2, "培训", "传智是一家net培训机构");
		Document document2=LuceneUtil.javabean2document(article2);
		indexWriter.addDocument(document2);
		
		Article article3=new Article(3, "培训", "传智是一家php培训机构");
		Document document3=LuceneUtil.javabean2document(article3);
		indexWriter.addDocument(document3);
		
		Article article4=new Article(4, "培训", "传智是一家ios培训机构");
		Document document4=LuceneUtil.javabean2document(article4);
		indexWriter.addDocument(document4);
		
		Article article5=new Article(5, "培训", "传智是一家ui培训机构");
		Document document5=LuceneUtil.javabean2document(article5);
		indexWriter.addDocument(document5);
		
		Article article6=new Article(6, "培训", "传智是一家c++培训机构");
		Document document6=LuceneUtil.javabean2document(article6);
		indexWriter.addDocument(document6);
		
		Article article7=new Article(7, "培训", "传智是一家seo培训机构");
		Document document7=LuceneUtil.javabean2document(article7);
		indexWriter.addDocument(document7);
		
		indexWriter.close();
	}
	
	@Test
	public void update() throws Exception{
		Article newArticle=new Article(1,"培训","传智是一家JAVA培训机构");
		Document document=LuceneUtil.javabean2document(newArticle);
		IndexWriter indexWriter=new IndexWriter(LuceneUtil.getDirectory(),LuceneUtil.getAnalyzer(),LuceneUtil.getMaxFieldLength());
		//更新id=7的document对象
		/*
		 * 参数一:term表示需要更新的document对象,id表示document对象中的id属性,7表示该id属性的值
		 * 参数二:新的document对象
		 */
		indexWriter.updateDocument(new Term("id","1"), document);
		indexWriter.close();
	}
	
	@Test
	public void delete() throws Exception{
		IndexWriter indexWriter=new IndexWriter(LuceneUtil.getDirectory(), LuceneUtil.getAnalyzer(), LuceneUtil.getMaxFieldLength());
		indexWriter.deleteDocuments(new Term("id","2"));
		indexWriter.close();
	}
	
	@Test
	public void deleteAll() throws Exception{
		IndexWriter indexWriter=new IndexWriter(LuceneUtil.getDirectory(), LuceneUtil.getAnalyzer(), LuceneUtil.getMaxFieldLength());
		indexWriter.deleteAll();
		indexWriter.close();
	}
	
	@Test
	public void findAllByKeywords() throws Exception{
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
		}
	}
}
