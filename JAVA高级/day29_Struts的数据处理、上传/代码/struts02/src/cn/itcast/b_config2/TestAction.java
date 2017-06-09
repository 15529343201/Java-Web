package cn.itcast.b_config2;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("TestAction.execute()");
		return SUCCESS;
	}
}
