package nchen.dlut.edu.exer;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int number = scan.nextInt();
//		创建数组，存储学生的成绩，动态初始化
		int[] scores = new int[number];
//		获取数组中元素的最大值
		int maxScore = 0;
//		给数组中的元素赋值
		System.out.println("请输入"+number+"个学生成绩：");
		for(int i=0;i<scores.length;i++){
			scores[i] = scan.nextInt();
			if(maxScore<scores[i]){
				maxScore = scores[i];
			}
		}
//		根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
		char level;
		for(int i=0;i<scores.length;i++){
			if(maxScore - scores[i]<=10){
				level = 'A';
			}else if(maxScore - scores[i]<=20){
				level = 'B';
			}else if(maxScore - scores[i]<=30){
				level = 'C';
			}else{
				level = 'D';
			}
			System.out.println("student"+i+"score is"+scores[i]+"grade is "+level);
		}
	}
}
