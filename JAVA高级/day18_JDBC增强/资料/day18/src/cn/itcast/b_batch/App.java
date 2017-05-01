package cn.itcast.b_batch;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class App {

	// 测试批处理操作
	@Test
	public void testBatch() throws Exception {
		
		// 模拟数据
		List<Admin> list = new ArrayList<Admin>();
		for (int i=1; i<21; i++) {
			Admin admin = new Admin();
			admin.setUserName("Jack" + i);
			admin.setPwd("888" + i);
			list.add(admin);
		}
		
		// 保存
		AdminDao dao = new AdminDao();
		dao.save(list);
	}
}
