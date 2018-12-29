package cn.itcast.framework.bean;

import java.util.Map;
/*
 * 封装action节点
 * <action name="login" class="cn.itcast.framework.action.LoginAction" method="login">
	<result name="success" type="redirect">/index.jsp</result>
	<result name="loginFaild">/login.jsp</result>
   </action>
 */
public class ActionMapping {
	//封装请求路径名称
	private String name;
	//处理action类的全名
	private String className;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	//处理方法
	private String method;
	//结果视图集合
	private Map<String, Result> results;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Map<String, Result> getResults() {
		return results;
	}
	public void setResults(Map<String, Result> results) {
		this.results = results;
	}

}
