package JavaLearning;

import java.util.stream.IntStream;

public class PrintNumWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printNum(1);
		//printNumber(1, 100);
		IntStream.range(1, 101).forEach(e-> System.out.println(e));
	}
	
	public static void printNum(int num) {
		if(num <=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	public static void printNumber(int stNum, int enNum) {
		if(stNum <= enNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, enNum);
		}
	}

}
