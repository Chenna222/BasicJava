package nchen.dlut.edu.sort;

/**   
 * @ClassName:  BubbleSort  
 * 十大排序算法：
 * 选择排序：直接选择排序、堆排序
 * 交换排序：冒泡排序O(n^2)、快速排序O(nlogn)
 * 插入排序：直接插入排序、二分排序、希尔排序
 * 归并排序
 * 桶式排序
 * 基数排序 
 * @Description: 冒泡排序
 * 
 * @author: nchen
 * @date:   2020年11月11日 下午3:24:02   
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[]{1,5,2,8,9};
		for(int i=0; i<arr.length;i++){
			System.out.print("原始数组："+arr[i]+"\t");
		}
		System.out.println();
		System.out.println("*******************");
		
	    for(int i=0;i<=arr.length-1;i++){
	    	for(int j=0;j<arr.length-1-i;j++){
	    		if(arr[j]>arr[j+1]){
	    			int temp = arr[j];
	    			arr[j] = arr[j+1];
	    			arr[j+1] = temp;
	    		}
	    	}	    
    	}
		
//		for(int i=0;i<=arr.length-1;i++){
//			for(int j=0;j<arr.length-1-i;j++){
//				if(arr[j]>arr[j+1]){
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		for(int i=0;i<=arr.length-1;i++){
			System.out.print("排序后数组："+arr[i] + "\t");
		}
		
		System.out.println("这是我第一次使用git上传代码到远程库");

	}
}
