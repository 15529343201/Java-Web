package cn.itcastset;

import java.util.Comparator;
import java.util.TreeSet;

/*
 treeSet添加自定义元素:
 
 treeSet要注意的事项：
 	1. 往TreeSet添加元素的时候，如果元素本身具备了自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储。
 	2. 往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，那么该元素所属的类必须要实现Comparable接口，把元素
 	的比较规则定义在compareTo(T o)方法上。 
 	
 	3. 如果比较元素的时候，compareTo方法返回 的是0，那么该元素就被视为重复元素，不允许添加.(注意：TreeSet与HashCode、equals方法是没有任何关系。)
 	
 	4. 往TreeSet添加元素的时候, 如果元素本身没有具备自然顺序 的特性，而元素所属的类也没有实现Comparable接口，那么必须要在创建TreeSet的时候传入一个
 	比较器。
 	
 	5.  往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，而元素所属的类已经实现了Comparable接口， 在创建TreeSet对象的时候也传入了比较器
 	那么是以比较器的比较规则优先使用。
 	
 	
 	
 	
 	如何自定义定义比较器： 自定义一个类实现Comparator接口即可，把元素与元素之间的比较规则定义在compare方法内即可。
 		
 		自定义比较器的格式 ：
 			
 			class  类名  implements Comparator{
 			
 			}
 	
 	推荐使用：使用比较器(Comparator)。 
 	
 
 */
class  Emp implements Comparable<Emp>{
	
	int id;
	
	String name;
	
	int salary;

	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "{ 编号："+  this.id+" 姓名："+ this.name+" 薪水："+ this.salary+"}";
	}

	//@Override //元素与元素之间的比较规则。
	// 负整数、零或正整数，根据此对象是小于、等于还是大于指定对象。 
	public int compareTo(Emp o) {
//		System.out.println(this.name+"compare"+ e.name);
		return this.salary- o.salary;
	}	
}


//自定义一个比较器
class MyComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.id-o2.id;
	}
	
	//根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数。 
	/*@Override
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		return e1.id - e2.id;
	}*/
	
	
}




public class Demo6 {
	
	public static void main(String[] args) {
		//创建一个比较器对象
		MyComparator comparator = new MyComparator();
		//创建TreeSet的时候传入比较器
		TreeSet tree = new TreeSet(comparator);
		
		tree.add(new Emp(110, "老陆", 100));
		tree.add(new Emp(113, "老钟", 200));
		tree.add(new Emp(220, "老汤", 300));
		tree.add(new Emp(120, "老蔡", 500));
		System.out.println("集合的元素："+tree);
		
	}
}
