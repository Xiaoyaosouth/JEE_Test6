package xiaoyao;

import java.lang.reflect.*;

/**
 * 测试Java反射技术。不使用new而用反射获取Student的实例。
 */
public class MyTest {
	
	public static void main(String[] args) throws Exception {
		// 获得类
		Class stuclass = Class.forName("xiayao.Student");
		// 获得构造方法
		Constructor constructor = stuclass.getConstructor(String.class, int.class);
		// 实例化一个对象并赋初始值
		Object object = constructor.newInstance("stu1", 18); // 会调用toString()
		System.out.println(object.toString()); // 查看类对象的地址
		
		Field f = stuclass.getDeclaredField("age");
		f.setAccessible(true);
		f.set(object, 20);
		Method method = stuclass.getMethod("answer", null);
		method.invoke(object, null);
	}

}
