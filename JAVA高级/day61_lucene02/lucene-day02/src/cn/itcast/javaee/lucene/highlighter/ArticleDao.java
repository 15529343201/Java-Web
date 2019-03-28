package cn.itcast.javaee.lucene.highlighter;

import java.util.ArrayList;
import java.util.List;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.highlight.Formatter;
import org.apache.lucene.search.highlight.Fragmenter;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.Scorer;
import org.apache.lucene.search.highlight.SimpleFragmenter;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.junit.Test;
import cn.itcast.javaee.lucene.entity.Article;
import cn.itcast.javaee.lucene.util.LuceneUtil;

/**
 * 搜索结果中关键字高亮
 * @author AdminTC
 */
public class ArticleDao {
	/**
	 * 增加document对象索引库中
	 */
	@Test
	public void add() throws Exception{
		Article article = new Article(1,"培训","传智是一家it培训机构",10);
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
		TopDocs topDocs = indexSearcher.search(query,100);
		
		
		//以下代码对内容中含有关键字的字符串高亮显示
		
		//格式对象
		Formatter formatter = new SimpleHTMLFormatter("<font color='red'>","</font>");
		//关键字对象
		Scorer scorer = new QueryScorer(query);
		//高亮对象
		Highlighter highlighter = new Highlighter(formatter,scorer);
		
		for(int i=0;i<topDocs.scoreDocs.length;i++){
			ScoreDoc scoreDoc = topDocs.scoreDocs[i];
			int no = scoreDoc.doc;
			
			//关键字没有高亮
			Document document = indexSearcher.doc(no);
			
			//关键字高亮
			String titleHighlighter = highlighter.getBestFragment(LuceneUtil.getAnalyzer(),"title",document.get("title"));
			String contentHighlighter = highlighter.getBestFragment(LuceneUtil.getAnalyzer(),"content",document.get("content"));
			
			//将高亮后的结果再次封装到document对象中
			document.getField("title").setValue(titleHighlighter);
			document.getField("content").setValue(contentHighlighter);
			
			Article article = (Article) LuceneUtil.document2javabean(document,Article.class);
			articleList.add(article);
		}
		for(Article a : articleList){
			System.out.println(a);
		}
		
	}
}





