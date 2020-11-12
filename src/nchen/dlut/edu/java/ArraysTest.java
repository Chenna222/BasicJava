package nchen.dlut.edu.java;
import java.util.Arrays;
/**   
 * @ClassName:  ArraysTest   
 * @Description: 数组类中方法的调用
 * 常用方法：
 * 判断两个数组是否相等：boolean equals(int[] a, int[] b)
 * 输出数组信息：String toString(int[] a)
 * 将指定值填充到数组之中：void fill(int[] a,int val)
 * 对数组进行排序：vold sort(int[] a)
 * 对排序后的数组进行二分法检索指定的值：int BinarySearch(int[] a,int key)
 * @author: nchen
 * @date:   2020年11月11日 下午3:55:35   
 */
public class ArraysTest {
	public static void main(String[] args) {
		int[] arr1 = new int[]{1,2,3,4};
		int[] arr2 = new int[]{1,3,2,4};
//		判断两个数组是否相等
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
//		输出数组信息
		System.out.println(Arrays.toString(arr1));
		
//		将指定值填充到数组之中
		Arrays.fill(arr1, 5);
		System.out.println(Arrays.toString(arr1));
		
//		对数组进行排序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
//		
		int[] arr = new int[]{1,5,2,8,9};
		int index = Arrays.binarySearch(arr, 20);
		if(index >= 0){
			System.out.println(index);
		}else{
			System.out.println("很遗憾没有找到");
		}
		
	}
}
