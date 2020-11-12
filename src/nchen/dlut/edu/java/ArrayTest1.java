package nchen.dlut.edu.java;

/**   
 * @ClassName:  ArrayTest1   
 * @Description: 二维数组的使用
 * @author: nchen@mail.dlut.edu.cn
 * @date:   2020年11月10日 下午10:00:41   
 */
public class ArrayTest1 {
	public static void main(String[] args) {
//		1 二维数组的声明和初始化
		int[] arr = new int[]{1,2,3};//一维数组
		System.out.println(arr);
//		静态初始化
		int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
//		动态初始化1
		String[][] arr2 = new String[3][2];
		
//		动态初始化2
		String[][] arr3 = new String[3][];
		int[] arr4[] = new int[][]{{1,2,3},{4,5},{6,7,8}};
		int[] arr5[] = {{1,2,3},{4,5},{6,7,8}};
//		错误的写法
//		String[][] arr4 = new String[][4];
//		String[4][3] arr5 = new String[][];
//	    2、如何调用数组中指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
		
		arr3[1] = new String[4];
		System.out.println(arr3[1][0]);
		
//		3、获取数组的长度
		System.out.println(arr4.length);//3
		System.out.println(arr4[1].length);//2
		System.out.println(arr4[2].length);//3
		
		System.out.println("***********************");
//		4、遍历二维数组
		for(int i=0;i<arr4.length;i++){
			for(int j=0;j<arr4[i].length;j++){
				System.out.print(arr4[i][j]);
			}
			System.out.println();
		}
		System.out.println("***********************");
//		5、二维数组元素的默认初始化
		/**
		 * 整型：0
		 * 浮点型：0.0
		 * char: 0
		 * boolean: false
		 * 引用类型：null
		 */
		int[][] arr6 = new int[4][3];
		System.out.println(arr6);//[[I@6d06d69c
		System.out.println(arr6[0]);//[I@6d06d69c
		System.out.println(arr6[0][0]);//0
		System.out.println("***********************");
		
		float[][] arr7 = new float[4][3];
		System.out.println(arr7);//[[F@4e25154f
		System.out.println(arr7[0]);//[F@70dea4e
		System.out.println(arr7[0][0]);//0.0
		System.out.println("***********************");
		
		boolean[][] arr8 = new boolean[4][3];
		System.out.println(arr8);//[[Z@5c647e05
		System.out.println(arr8[0]);//[Z@33909752
		System.out.println(arr8[0][0]);//false
		System.out.println("***********************");
	}
}
