package note;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] even = new int[10];
		int su=0;
		
		Scanner sc = new Scanner(System.in);		
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("수를 입력하시오 : ");
			su = sc.nextInt();
			if(su % 2 ==0) {
				even[i] = su;
			}
			
		}
		
		Arrays.sort(even);
		
		
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(" "+even[i]+" ");
		}
		
		
		
	}

}
