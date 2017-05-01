package cn.itcast.d_tx;

import org.junit.Test;

public class App {

	@Test
	public void testname() throws Exception {
		
		// в╙ук
		AccountDao accountDao = new AccountDao();
		accountDao.trans();
	}
}
