package cn.itcast.javaee.lucene.fy.entity;

import java.util.ArrayList;
import java.util.List;



/**
 * 用于Article的分页类
 * @author Administrator
 *
 */
public class Page {
	private Integer currPageNO;//当前页号
	private Integer perPageSize=2;//每页显示记录数,默认为2条
	private Integer allRecordNO;//总记录数
	private Integer allPageNO;//总页数
	private List<Article> articleList=new ArrayList<Article>();
	public Page(){}
	public List<Article> getArticleList() {
		return articleList;
	}
	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}
	public Integer getCurrPageNO() {
		return currPageNO;
	}
	public void setCurrPageNO(Integer currPageNO) {
		this.currPageNO = currPageNO;
	}
	public Integer getPerPageSize() {
		return perPageSize;
	}
	public void setPerPageSize(Integer perPageSize) {
		this.perPageSize = perPageSize;
	}
	public Integer getAllRecordNO() {
		return allRecordNO;
	}
	public void setAllRecordNO(Integer allRecordNO) {
		this.allRecordNO = allRecordNO;
	}
	public Integer getAllPageNO() {
		return allPageNO;
	}
	public void setAllPageNO(Integer allPageNO) {
		this.allPageNO = allPageNO;
	}
}
