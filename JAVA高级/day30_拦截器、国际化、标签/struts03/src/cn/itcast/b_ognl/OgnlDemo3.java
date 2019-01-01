package cn.itcast.b_ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * struts的数据流转

 *
 */
public class OgnlDemo3 extends ActionSupport{
	
	
	@Override
	public String execute() throws Exception {
		
		// 测试迭代标签
		
		List<User> list = new ArrayList<User>();
		Map<Integer,User> map = new HashMap<Integer, User>();
		
		// 初始化
		for (int i=1; i<11; i++) {
			User user = new User(i,"Jack" + i);
			
			list.add(user);
			map.put(user.getId(), user);
		}
		
		// 保存  
		ActionContext.getContext().getContextMap().put("list", list);
		ActionContext.getContext().getContextMap().put("map", map);
		
		return super.execute();
	}
	
	
	
}














