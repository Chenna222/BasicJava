/**   
 * @ClassName:  ArrayTest   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: nchen
 * @date:   2020年11月10日 下午8:21:46   
 */
package nchen.dlut.edu.java;
//多行注释的快捷键为 ALT+Shift+J
/**
 * 数组的特点：
 * 1、数组的长度一旦被确定，不能被修改；
 * 2、数组是有序排序的
 * 3、数组属于引用数据类型变量，数组的元素是既可以是基本数据类型，也可以是引用数据类型
 * 4、创建数组对象会在内存中开辟一整块连续的空间
 * 
 * 数组的内存解析：
 * 栈stack ： 存放局部变量
 * 堆heap 存放数组、对象
 */

public class ArrayTest {
	public static void main(String[] args) {
//		一维数组的初始化和声明
		int num;//声明
		num = 10;
		int id = 1001;
		int[] ids;//数组的声明
		ids = new int[]{1001,1002,1003,1004};//数组的静态初始化
		String[] names = new String[5];//数组的动态初始化
		
		System.out.println(names.length);
		for(int i=0;i<=names.length;i++){
			System.out.println(i);
		}
//		数组元素是char型，默认是0或'\u0000',而非'0'
		char[] arr = new char[4];
		for(int i=0;i<arr.length;i++){
			System.out.println("----"+arr[i]+"****");
		}
//		数组元素是布尔型，默认初始化值为false
		System.out.println("****************");
		boolean[] arr1 = new boolean[5];
		System.out.println(arr1[0]);
		
	}
}
