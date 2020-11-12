package nchen.dlut.edu.java;

/**   
 * @ClassName:  ArrayTest2   
 * @Description: 数组的复制、反转、查找(线性查找、二分法查找)
 * ）
 * @author: nchen
 * @date:   2020年11月11日 下午2:11:43   
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
//		System.out.println(arr[0]);
//		数组的复制（区别数组变量的赋值）
		String[] arr1 = new String[arr.length];
		for(int i=0;i<arr1.length;i++){
			arr1[i] = arr[i];
		}
//		System.out.println(arr1[0]);
//		数组的反转方法一
		for(int i=0;i<arr.length/2;i++){
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
//		数组的反转方法一
		for(int i=0,j=arr.length-1;i<j;i++,j--){
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
//		遍历
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
		
//		线性查找
		String dest = "CC";
		boolean isFlag = true;
		for(int i=0;i<arr.length;i++){
			if(dest.equals(arr[i])){
				System.out.println("找到指定元素，位置为：" + i);
				isFlag = false;
				break;
			}
		}
		if(isFlag){
			System.out.println("很遗憾，没有找到啦！");
		}
		System.out.println("**********************");
//		二分查找的前提：数组为有序数组
		int[] arr2 = new int[]{-9,-8,0,5,6,8,9,10};
		int dest1 = 5;
		int head = 0;
		int end = arr2.length-1;
		boolean isFlag1 = true;
		while(head <= end){
			int middle = (head+end)/2;
			if(dest1==arr2[middle]){
				System.out.println("找到指定元素，位置为：" + middle);
				isFlag1 = false;
				break;
			}else if(arr2[middle] > dest1){
				end = middle - 1;
			}else{
				head = middle + 1;
			}
		}
		if(isFlag1){
			System.out.println("很遗憾，没有找到啦！");
		}
	}
}
