package cn.itcast.d_debug;

public class Cal {

	public int sum(int...num) {
		int sum = 0;
		for (int i : num) {
			sum =0;
			sum += i;
		}
		return sum;
	}
}
