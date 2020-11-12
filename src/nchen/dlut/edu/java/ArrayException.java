package nchen.dlut.edu.java;

/**   
 * @ClassName:  ArrayException   
 * @Description: 数组中常见的异常
 * 
 * @author: nchen
 * @date:   2020年11月11日 下午4:10:18   
 */
public class ArrayException {
	public static void main(String[] args) {
//		1 数组角标越界的异常  ArrayIndexOutOfBoundsException
		int[] arr = new int[]{1,2,3,4};
//		System.out.println(arr[5]);
//		2 空指针异常  NullPointerException
//		情况一
//		arr = null;
//		System.out.println(arr[0]);

//		情况二
		int[][] arr1 = new int[4][];
		System.out.println(arr1[0]);//null
//		System.out.println(arr1[0][0]);//报空指针的错误
		
//		情况三
		String[] arr2 = new String[]{"CC","BB","AA"};
		arr2[0] = null;
		System.out.println(arr2[0].toString());
	}

}
